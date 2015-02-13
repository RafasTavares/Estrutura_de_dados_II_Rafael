package Test;

import static org.junit.Assert.*;

import java.security.PublicKey;

import org.junit.Before;
import org.junit.Test;

import Tree.TernaryTree;

public class Test_Tree_Ternary {
	TernaryTree tree = new TernaryTree();

	@Before
	public void testContructor() {
		tree.insert(7);
		tree.insert(6);
		tree.insert(5);
		tree.insert(4);
		tree.insert(3);
		tree.insert(2);
		tree.insert(1);
		tree.insert(8);
		tree.insert(9);
		tree.insert(10);
		tree.insert(2);
	}

	@Test
	public void testPrint() {
		System.out.println("* Arvore Ordenada: ");
		tree.traverseTree();
		System.out.println();
	}

	@Test
	public void testIsPresent() {
		assertEquals(tree.isPresent(tree.getRoot(), 7), true);
		System.out.println("* Contem 7 na arvore: "
				+ tree.isPresent(tree.getRoot(), 7));
	}

	@Test
	public void testGetMaxValue() {
		assertEquals(tree.findMax(tree.getRoot()).getData(), 10);
		System.out.println("* Valor Max: "
				+ tree.findMax(tree.getRoot()).getData());
	}

	@Test
	public void testGetRoot() {
		assertEquals(tree.getRootValue(), 7);
		System.out.println("* Raiz: " + tree.getRootValue());
	}

	@Test
	public void testDelete() {
		tree.delete(2);
		System.out.println("* Delete 2 ");
		tree.traverseTree();
		tree.insert(2);
		System.out.println();
	}

	@Test
	public void testAddLado() {
		System.out.println("\n" + "--------------ADD LADO---------------");
		TernaryTree tree1 = new TernaryTree();
		tree1.insert(1);
		tree1.insert(2);
		tree1.insert(3);
		tree1.insert(4);
		System.out.println("root:" + tree1.getRootValue());
		System.out.println(tree1.getRoot().getRight().getData() + " DIR");
		System.out.println(tree1.getRoot().getRight().getRight().getData()  + " DIR");
		System.out.println(tree1.getRoot().getRight().getRight().getRight()
				.getData()  + " DIR");
		// tree.getFilhos(tree1.getRoot());
		// System.out.println("Tree: ");
		tree1.traverseTree();
		System.out.println("\n" + "-------------------------------------" + "\n");
	}
}