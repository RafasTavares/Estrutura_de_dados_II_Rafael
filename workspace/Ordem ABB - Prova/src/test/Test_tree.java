package test;
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
	public void testImprimir (){
		ArvoreBuscaBinaria tree = new ArvoreBuscaBinaria();
		tree.insere(30); // 3
		tree.insere(20); // 1
		tree.insere(210); // 4
		tree.insere(22); // 2
		tree.insere(10); // raiz
		System.out.println("Arvore: " +"\n" +  tree.imprimir());
	}
	@Test
	public void testImprimir2(){
		ArvoreBuscaBinaria tree = new ArvoreBuscaBinaria();
		tree.insere(213); // 3
		tree.insere(30); // 3
		tree.insere(31); // 3
		tree.insere(20); // 1	
		tree.insere(210); // 4
		tree.insere(22); // 2
		tree.insere(10); // raiz
		System.out.println("Arvore: " +"\n" +  tree.imprimir());
	}
	
	@Test
	public void TestImprimir4 (){
		ArvoreBuscaBinaria tree = new ArvoreBuscaBinaria();
		tree.insere(30); // 3
		tree.insere(20); // 1
		tree.insere(210); // 4
		tree.insere(22); // 2
		tree.insere(10); // raiz
		System.out.println(tree.imprimir());
		
	}
}
