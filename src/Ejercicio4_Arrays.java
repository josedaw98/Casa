import java.util.Random;
import java.util.Scanner;

public class Ejercicio4_Arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t;
		do {
			System.out.println("tamaño vector");
			t = sc.nextInt();
			if (t < 10 || t > 1000000) {
				System.out.println("el numero no es valido");
			}
		} while (t < 10 || t > 1000000);

		int[] vector = new int[t];
		

		Random r = new Random();

	for (int i = 0; i < t; i++) {
			int valor = r.nextInt(201) - 100;
			vector[i] = valor;

		}
		int valor = 101;
		int cont = 0;
		int sec = 0;
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] == valor) {
				for (int j = i; j < vector.length && vector[j] == valor; j++) {
					valor = vector[j];
					sec=j;
				}
				cont++;
				i=sec;
			} else {
				valor = vector[i];

			}
		}

		for(int i=0;20>vector.length && i<vector.length;i++) {
			System.out.print(vector[i]);
		}
		System.out.println();
		System.out.println(cont);
	}

}
