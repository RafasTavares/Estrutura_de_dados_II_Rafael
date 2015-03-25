package exemplo;

/**
 * 
 * 
 * @author Rafael Oliveira Vasconcelos
 */
public interface Arvore {
  //A árvore pode ser genérica (Arvore<T>)
  //Coloquei assim para facilitar.
  //Como a árvore não é genérica, ou seja, não existe o tipo T,
  //O tipo do valor tem que ser um 'Object' para não ficar fixo a apenas um tipo
  public No inserir(Object valor, No pai, Lado lado);

  public No obterRaiz();

  public No obterFilho(No pai, Lado lado);

  public No removerNo(No no);

  public No removerFilho(No pai, Lado lado);
}
