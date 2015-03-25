package test;

import static org.junit.Assert.*;
import tree.ArvoreBinaria;

public class Test {

	@org.junit.Test
	public void testPreOrdem() {
		ArvoreBinaria tree = new ArvoreBinaria();
		tree.insereAluno(1, "Rafa");
		tree.insereAluno(5, "Jefa");
		tree.insereAluno(4, "Gabi");
		tree.insereAluno(3, "Ian");
		tree.insereAluno(2, "Bia");
		System.out.println("\n" + " :::::  Pre Order  ::::: ");
		tree.percorrerPreOrder();
	}
	
	@org.junit.Test
	public void testPosOrdem() {
		ArvoreBinaria tree = new ArvoreBinaria();
		tree.insereAluno(1, "Rafa");
		tree.insereAluno(5, "Jefa");
		tree.insereAluno(4, "Gabi");
		tree.insereAluno(3, "Ian");
		tree.insereAluno(2, "Bia");
		System.out.println("\n" + " :::::  Post Order  :::::");
		tree.percorrerPostOrder();
	}
	
	@org.junit.Test
	public void testInOrdem() {
		ArvoreBinaria tree = new ArvoreBinaria();
		tree.insereAluno(1, "Rafa");
		tree.insereAluno(5, "Jefa");
		tree.insereAluno(4, "Gabi");
		tree.insereAluno(3, "Ian");
		tree.insereAluno(2, "Bia");
		System.out.println("\n" + " :::::  In Order  ::::: ");
		tree.percorrerInOrder();
	}

}
