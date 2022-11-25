package modularização3Q2;

import java.util.Scanner;

public class mod {
    public static void crescente(double a, double b, double c) {
    	double menor=0, medio=0, maior=0;
    	if(a > b && a > c) {
    		maior = a;
    	    if(b > c) {
    	    	medio = b;
    	    	menor = c;
    	    }
    	    else {
    	    	medio = c;
    	    	menor = b;
    	    }
    	}
        if(b > a && b > c) {
        	maior = b;
            if(a > c) {
            	medio = a;
            	menor = c;
            }
            else {
            	medio = c;
            	menor = a;
            }
        }
        if(c > a && c > b) {
        	maior = c;
            if(b > a) {
            	medio = b;
            	menor = a;
            }
            else {
            	medio = a;
            	menor = b;
            }
        }
        System.out.println("");
        a = menor;
        b = medio;
        c = maior;
        System.out.println("Valores ordenados:");
        System.out.println("");
        System.out.println("A: " + a);
        System.out.println("");
        System.out.println("B: " + b);
        System.out.println("");
        System.out.println("C: " + c);
    }
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	    Double a, b, c;
	    System.out.println("Programa de ordenação crescente");
	    System.out.println("");
	    System.out.println("Insira aqui o primeiro número (A):");
	    a = in.nextDouble();
	    System.out.println("Insira aqui o segundo número (B):");
	    b = in.nextDouble();
	    System.out.println("Insira aqui o terceiro número (C):");
	    c = in.nextDouble();
	    crescente(a, b, c);
	}

}
