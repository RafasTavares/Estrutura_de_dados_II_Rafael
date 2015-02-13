package Tree;

public class TreeNode<T extends Comparable<T>> {

	/*
	 *  Estrutura - Variáveis
	 */
	int data;
	TreeNode left; 
	TreeNode center; 
	TreeNode right; 
	
	/*
	 * Contrutor
	 */
	TreeNode(int data) {
		this.data = data;
		this.left = null;
		this.center = null;
		this.right = null;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public void setCenter(TreeNode center) {
		this.center = center;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}

	public TreeNode getLeft() {
		return this.left;
	}

	public TreeNode getCenter() {
		return this.center;
	}

	public TreeNode getRight() {
		return this.right;
	}

	public int getData() {
		return this.data;
	}

	public void setData(int value) {
		this.data = value;
	}
}