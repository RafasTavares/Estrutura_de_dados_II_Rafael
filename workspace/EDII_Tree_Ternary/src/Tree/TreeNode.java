package Tree;

public class TreeNode<T extends Comparable<T>> {

	public TreeNode(char key) {
		this.key = key;
	}

	char key;
	T value;
	TreeNode<T> leftNode;
	TreeNode<T> middleNode;
	TreeNode<T> rightNode;

	public String toString() {
		return key + "";
	}
}