package Tree;

public class TreeTernary {

	private TreeNode raiz; // root

	// Construtor
	public TreeTernary() {
		raiz = null;
	}

	public void insereNode(int insertValue) {
		if (raiz == null)
			raiz = new TreeNode(insertValue);
		else
			raiz.insereNode(insertValue);
	}

	// come�a percurso na pr�-ordem
	public void preorderTraversal() {
		preorderHelper(raiz);
	}

	// m�todo recursivo para fazer percurso na pr�-ordem
	private void preorderHelper(TreeNode node) {
		if (node == null)
			return;

		System.out.print(node.info + " , ");

		// percorre a subarvore a esquerda
		preorderHelper(node.esquerdaNode);
		// percorre a subarvore a direira
		preorderHelper(node.direitaNode);
	}

	// come�a o percurso na ordem
	public void inorderTraversal() {
		inorderHelper(raiz);
	}

	// m�todo recursivo para fazer o percurso na ordem
	private void inorderHelper(TreeNode node) {
		if (node == null)
			return;
		// percorre a subarvore a esquerda
		inorderHelper(node.esquerdaNode);

		System.out.print(node.info + " , ");

		// percorre a subarvore a direita
		inorderHelper(node.direitaNode);
	}

	// come�a o percurso na p�s-ordem
	public void postorderTraversal() {
		postorderHelper(raiz);
	}

	// m�todo recursivo para fazer o percurso na p�s-ordem
	private void postorderHelper(TreeNode node) {
		if (node == null)
			return;
		// percorre a subarvore esquerda
		postorderHelper(node.esquerdaNode);
		// percorre a subarvore direita
		postorderHelper(node.direitaNode);

		System.out.print(node.info + " , ");
	}

	// come�a o percurso na ordem
	public void TodasFolhas() {
		Folhas(raiz);
	}

	// m�todo recursivo para fazer o percurso na ordem
	private void Folhas(TreeNode node) {
		if (node == null)
			return;
		// percorre a subarvore a esquerda
		Folhas(node.esquerdaNode);

		if ((node.esquerdaNode == null) && (node.direitaNode == null)) {
			System.out.print(node.info + " , ");
		}

		// percorre a subarvore a direita
		Folhas(node.direitaNode);
	}

	// come�a o percurso na ordem
	public void TodosInternos() {
		Internos(raiz);
	}

	// m�todo recursivo para fazer o percurso na ordem
	private void Internos(TreeNode node) {
		if (node == null)
			return;
		// percorre a subarvore a esquerda
		Internos(node.esquerdaNode);

		if ((node.esquerdaNode != null) || (node.direitaNode != null)) {
			System.out.print(node.info + " , ");
		}

		// percorre a subarvore a direita
		Internos(node.direitaNode);
	}
}
