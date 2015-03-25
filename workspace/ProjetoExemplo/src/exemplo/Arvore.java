package exemplo;

/**
 * 
 * 
 * @author Rafael Oliveira Vasconcelos
 */
public interface Arvore {
  //A �rvore pode ser gen�rica (Arvore<T>)
  //Coloquei assim para facilitar.
  //Como a �rvore n�o � gen�rica, ou seja, n�o existe o tipo T,
  //O tipo do valor tem que ser um 'Object' para n�o ficar fixo a apenas um tipo
  public No inserir(Object valor, No pai, Lado lado);

  public No obterRaiz();

  public No obterFilho(No pai, Lado lado);

  public No removerNo(No no);

  public No removerFilho(No pai, Lado lado);
}
