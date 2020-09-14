package view;
import java.util.Random;
import controller.Threads;

public class Principal {
	public static void main (String[] args){
		int matriz[][] = new int[3][5],linha,coluna=0;
		Random random = new Random();
		linha = matriz.length;
		coluna = matriz[0].length;
	
		for (int l=0;l<linha;l++){
			for (int c=0;c<coluna;c++){
				matriz[l][c] = random.nextInt(100);
			}
		}
		for (int l=0;l<linha;l++){
			Thread thread = new Threads(l,coluna,matriz);
			thread.start();
			for (int c=0;c<coluna;c++){
			}
		}
		
	}
}
