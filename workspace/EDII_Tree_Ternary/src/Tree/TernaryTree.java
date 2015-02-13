package Tree;

public class TernaryTree {
	TreeNode root;

	// Constructor
	public TernaryTree() {
		root = null;
	}

	// Metodo de inserir na arvore
	public void insert(int value) {
		root = insert(root, value);
	}

	/*
	* M�todo para criar um novo n� com o valor determinado e inseri-lo para a arvore ternaria
	*/ 
	private TreeNode insert(TreeNode root, int value) {
		if (root == null) {
			root = new TreeNode(value);
			root.setLeft(null);
			root.setRight(null);
			root.setCenter(null);
		} else {
			if (value < root.getData()) {
				root.setLeft(insert(root.getLeft(), value));
			}
			if (value == root.getData()) {
				root.setCenter(insert(root.getCenter(), value));
			}
			if (value > root.getData()) {
				root.setRight(insert(root.getRight(), value));
			}
		}
		return root;
	}

	/*
	 * Deleta um valor da arvore ternaria
	 */
	public void delete(int value) {
		System.out.println("Delete " + value + " from the Tree...");
		root = delete(root, value);
	}

	/*
	 * M�todo para excluir o n� com um valor give da �rvore de Trinary
	 */
	private TreeNode delete(TreeNode root, int value) {
		if (isPresent(root, value)) {
			if (root == null) {
				return root;
			}
			if (value < root.getData()) {
				root.setLeft(delete(root.getLeft(), value));
			} else if (value > root.getData()) {
				root.setRight(delete(root.getRight(), value));
			} else { // found element to delete
				if (root.getLeft() == null && root.getCenter() == null
						&& root.getRight() == null) {
					root = null;
					return root;
				}
				if (root.center != null) {
					root.setCenter(delete(root.getCenter(), value));
				} else {
					if (root.getLeft() != null && root.getRight() != null) {
						// Find Largest element in left subtree
						// replace current Node's data with the Largest Left
						// subtree data
						TreeNode temp = findMax(root.getLeft());
						root.setData(temp.getData());
						root.setLeft(delete(root.getLeft(), temp.getData()));
						;
					} else if (root.getLeft() == null) {
						root = root.getRight();
						return root;
					} else if (root.getRight() == null) {
						root = root.getLeft();
						return root;
					}
				}
			}
		} else {
			System.out.println(value + " not present in the Trinary tree");
		}
		if (isPresent(root, value)) {
			root = delete(root, value);
		}
		return root;
	}

	/*
	 * Encontre o elemento m�ximo da sub-�rvore a partir do dado "root" n�
	 * Elemento m�ximo � a crian�a com o bot�o direito do mais � direita sub�rvore do dado
	 * N� de �rvore
	*/ 
	private TreeNode findMax(TreeNode root) {
		if (root == null) {
			return root;
		} else {
			while (root.getRight() != null) {
				root = root.getRight();
			}
		}
		// System.out.println("Max element = " + root.getData());
		return root;
	}

	/*
	* M�todo para verificar se o n� com o valor dado est� presente na �rvore ou n�o 
	*/
	private boolean isPresent(TreeNode root, int value) {
		if (root == null) {
			return false;
		} else if (value == root.getData()) {
			return true;
		} else if (value < root.getData()) {
			return isPresent(root.getLeft(), value);
		} else if (value > root.getData()) {
			return isPresent(root.getRight(), value);
		}
		return false;
	}

	// Passagem da �rvore em ordem a partir da raiz da �rvore Ternaria
	public void traverseTree(TreeNode root) {
		if (root != null) {
			traverseTree(root.getLeft());
			traverseTree(root.getCenter());
			System.out.print(root.getData() + " ");
			traverseTree(root.getRight());
		}
	}

	/*
	 *  Metodo para percorer a arvore ternaria
	 */
	public void traverseTree() {
		System.out.println("---------------------------------------------");
		System.out.println("Passagem da arvore a partir da raiz : ");
		if (this.root == null) {
			System.out.println("Arvore Vazia");
		} else
			traverseTree(root);
		System.out.println();
		System.out.println("---------------------------------------------");
	}
}
