package Tree;

public class Arvore {

	public static void main(String[] args) {

		TreeTernary t = new TreeTernary();
		t.insereNode(1);
		t.insereNode(2);

		t.insereNode(3);

		t.insereNode(9);

		t.insereNode(5);

		t.insereNode(6);

		t.insereNode(7);

		t.insereNode(8);

		System.out.print("Pre\n");
		t.preorderTraversal();
		System.out.print("\nIn\n");
		t.inorderTraversal();
		System.out.print("\nPos\n");
		t.postorderTraversal();
		System.out.print("\nFolhas\n");
		t.TodasFolhas();
		System.out.print("\nInternos\n");
		t.TodosInternos();

	}
}