/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeParseException;

/**
 *
 * @author Rafael tavares
 *         https://github.com/RafasTavares/Estrutura_de_dados_II_Rafael
 */
public class ArvoreBuscaBinaria {

	private No raiz;

	public ArvoreBuscaBinaria() {
		this.setRaiz(null);
	}

	/**
	 * @return the raiz
	 */
	public No getRaiz() {
		return raiz;
	}

	/**
	 * @param raiz
	 *            the raiz to set
	 */
	public void setRaiz(No raiz) {
		this.raiz = raiz;
	}

	/// 1� QUEST�O INSERIR A 'HORA'
	public void insere(No no, int valor) {
		// Se o valor for igual insiro a hora no meio 
		if (no.getValor() == valor) {

			// N�o esta inserindo a hora, por isso estou passando a hora corrente sem convers�o
			SimpleDateFormat format = new SimpleDateFormat("hh:mm");
			String a = format.format((int)System.currentTimeMillis());
			String hora = a;
			int vlHora = (int)System.currentTimeMillis();
			No nHora = new No(vlHora);

			if (no.getMeio() == null) {
				no.setMeio(nHora);
			} else {
				insere(no.getMeio(), vlHora);
			}

		} else if (no == null) {
			no.setValor(valor);
		} else {
			if (valor < no.getValor()) {
				if (no.getEsquerda() == null) {
					No novo = new No(valor);
					no.setEsquerda(novo);
				} else {
					insere(no.getEsquerda(), valor);
				}
			} else {
				if (no.getDireita() == null) {
					No novo = new No(valor);
					no.setDireita(novo);
				} else {
					insere(no.getDireita(), valor);
				}
			}

		}
	}
/// Inserir
	public void insere(int valor) {
		if (this.getRaiz() == null) {
			this.raiz = new No(valor);
		} else {
			insere(this.raiz, valor);
		}

	}

	public void remove(No no, No pai, int valor) {
		// se o no em questao nao possui o valor a ser removido
		if (no.getValor() != valor) {
			if (valor < no.getValor()) {
				if (no.getEsquerda() != null) {
					remove(no.getEsquerda(), no, valor);
				} else {
					System.out.println("O valor " + valor
							+ " nao esta na arvore");
				}
			} else {
				if (no.getDireita() != null) {
					remove(no.getDireita(), no, valor);
				} else {
					System.out.println("O valor " + valor
							+ " nao esta na arvore");
				}
			}

		}
		// se o no em questao possui o valor a ser removido
		else {
			No aux;
			// caso de remocao de folha
			if (no.getDireita() == null && no.getEsquerda() == null) {

				// se o no a ser removido for filho direito do pai
				if (pai.getDireita() == no) {
					pai.setDireita(null);
				} else {
					pai.setEsquerda(null);
				}
			}
			// caso onde o no possui 1 filho
			else if (no.getDireita() == null || no.getEsquerda() == null) {

				// se nao há subarvore à direita, pegue o antecessor
				if (no.getEsquerda() != null) {
					if (no == this.raiz) {
						this.raiz = no.getEsquerda();
					} else {
						if (no.getEsquerda() != null)
							pai.setDireita(no.getEsquerda());
						else
							pai.setDireita(no.getDireita());
					}
				}
				// se nao há subarvore à esquerda, pegue o sucessor
				else {
					if (no == this.raiz)
						this.raiz = no.getDireita();
					else {
						if (no.getDireita() != null)
							pai.setDireita(no.getDireita());
						else
							pai.setDireita(no.getEsquerda());
					}
				}
			}
			/*
			 * caso de remocao de no com dois filhos: copie o sucessor para o no
			 * a ser removido e remova o sucessor
			 */
			else {
				aux = no.sucessor(no);
				no.setValor(aux.getValor());
				remove(no.getDireita(), no, aux.getValor());
			}
		}
	}

	public void remove(int valor) {
		// caso em que a arvore está vazia
		if (this.getRaiz() == null)
			;
		// caso em que há apenas a raiz
		else if (this.getRaiz().getValor() == valor
				&& this.getRaiz().getEsquerda() == null
				&& this.getRaiz().getDireita() == null) {
			this.raiz = null;
		} else {
			remove(this.getRaiz(), this.getRaiz(), valor);
		}
	}

	public String imprimeSubArvoreIn(No no) {
		String ret;

		if (no == null) {
			return " ";
		}

		ret = "";
		ret = ret + this.imprimeSubArvoreIn(no.getEsquerda());
		ret = ret + this.imprimeSubArvoreIn(no.getMeio());
		ret = ret + no.toString();
		ret = ret + this.imprimeSubArvoreIn(no.getDireita());

		return ret;
	}

	@Override
	public String toString() {
		return this.imprimeSubArvoreIn(this.getRaiz());
	}
}
