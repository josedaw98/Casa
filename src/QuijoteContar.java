import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.Spring;




public class QuijoteContar {

	public static void main(String[] args) {
		InputStream input;
		InputStreamReader isr;
		BufferedReader bf = null;
		Map<String, Integer> palabras = new HashMap<>();
		String[] partes;
		int cont = 0;
		String respuesta = "no";
		Scanner sc = new Scanner(System.in);

		try {
			input = Ejercicio4.class.getResourceAsStream("El Quijote (windows-1252).txt");
			isr = new InputStreamReader(input, "windows-1252");
			bf = new BufferedReader(isr);
			String linea = bf.readLine();
			//linea = linea.toLowerCase();
			while (linea != null) {
				// procesar la línea para que al final
				// tengra registrado en algún sitio
				// el número de veces que se repite cada
				// palabar sin tener en cuenta mayúsculas
				// y minúsculas.

				partes = linea.split(" ");

				for (int i = 0; i < partes.length; i++) {
					if (!palabras.containsKey(partes[i])) {
						palabras.put(partes[i], 1);
					} else {
						cont = palabras.get(partes[i]) + 1;
						palabras.put(partes[i], cont);
					}

				}
				linea = bf.readLine();
				//linea = linea.toLowerCase();
			}

			// pedir palabras al usuario y mostrar el
			// número de veces que se repiten. El programa
			// finaliza cuando el usuario introcuzca la
			// palabra 'fin'. También se tiene que ver el
			// número de veces que se repite la palabra 'fin'.
			while (!respuesta.equalsIgnoreCase("fin")) {
				System.out.println("Introduzca la palabra a buscar (fin para acabar)");
				respuesta = sc.next();
				if (!respuesta.equalsIgnoreCase("fin")) {
					System.out.println(palabras.get(respuesta));
					
				}else {
					System.out.println("fin busqueda");
				}
			}

		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bf != null)
					bf.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
