package controller;

public class Threads extends Thread {
	private int matriz[][], l, coluna;
	
	public Threads (int l, int coluna,int[][] matriz){
		this.matriz = matriz;
		this.l = l;
		this.coluna = coluna;
	}
	public void run(){
		sum();
	}
	
	public void sum (){
		int soma=0;
		for (int c=0;c<coluna;c++){
			soma = matriz[l][c] + soma;
		}
		System.out.println("TID #"+getId()+ " linha " + l + " = " + soma );
	}
	
}

