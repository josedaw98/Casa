package Ejerciciojulio;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> c1 = new ArrayList<Integer>();
		ArrayList<Integer> c2 = new ArrayList<Integer>();
		ArrayList<Integer> c3 = new ArrayList<Integer>();
		String r;
		
		
		Scanner sc =  new Scanner(System.in);
		
		do {
			System.out.println("escriba valor a añadir a la cadena 1");
			int n =sc.nextInt();
			c1.add(n);
			System.out.println("desea añadir otro numero a la cadena 1?");
			r=sc.next();
		}while(r.equalsIgnoreCase("si"));
		
		
		do {
			System.out.println("escriba valor a añadir a la cadena 2");
			int n =sc.nextInt();
			c2.add(n);
			System.out.println("desea añadir otro numero a la cadena 2?");
			r=sc.next();
		}while(r.equalsIgnoreCase("si"));
		
		
		System.out.println("que operacion quiere realizar u(union) o d(diferencia) o i(intersecion)");
		r = sc.next();
		
		
		if(r.equalsIgnoreCase("i")) {
			for(int i=0;i<c1.size();i++) {
				for(int j=0; j<c2.size();j++) {
					if(c1.get(i)==c2.get(j)) {
						c3.add(c1.get(i));
					}
				}
			}
			
			System.out.println(c1 + " i " + c2 + " = " + c3);
				
		}else if(r.equalsIgnoreCase("d")) {
			for(int i=0;i<c1.size();i++) {
				c3.add(c1.get(i));
			}
			
			for(int i=0;i<c2.size();i++) {
				for(int j=0; j<c3.size();j++) {
					if(c2.get(i)==c3.get(j)) {
						c3.remove(j);
					}else {
						c3.add(c2.get(i));
					}
				}
			}
			System.out.println(c1 + " d " + c2 + " = " + c3);
		}else if(r.equalsIgnoreCase("u")) {
			
		}

	}

}
