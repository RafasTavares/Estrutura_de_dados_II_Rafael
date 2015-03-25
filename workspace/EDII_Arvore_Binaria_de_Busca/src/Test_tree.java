import static org.junit.Assert.*;

import org.junit.Test;

import tree.ArvoreBuscaBinaria;

public class Test_tree {

	@Test
	public void inserirTest() {
		ArvoreBuscaBinaria tree = new ArvoreBuscaBinaria();

		tree.insere(30);
		System.out.println(tree.toString());
		tree.insere(15);
		System.out.println(tree.toString());
		tree.insere(50);
		System.out.println(tree.toString());
		tree.insere(25);
		System.out.println(tree.toString());
		tree.insere(10);
		System.out.println(tree.toString());
		tree.insere(31);
		System.out.println(tree.toString());
		tree.remove(30);
		System.out.println("Remove 30: " + tree.toString());
	}

	@Test
	public void removerTest() {
		ArvoreBuscaBinaria tree = new ArvoreBuscaBinaria();
		tree.insere(3);
		tree.insere(2);
		tree.insere(1);
		System.out.println("Tree: " + tree.toString());
		assertEquals(" 1 2 3 ", tree.toString());
		tree.remove(3);
		System.out.println("Remove 3: " + tree.toString());
		assertEquals(" 1 2 ", tree.toString());
		tree.remove(1);
		System.out.println("Remove 1: " + tree.toString());
		assertEquals(" 2 ", tree.toString());
	}

}
