package modularizaçao3Q7;

import java.util.Scanner;

public class Mod {
    public static char conceituar(double media) {
    	char conc=' ';
    	if(media < 5) {
    		conc = 'D';
    	}
        if(media >= 5 && media < 7) {
        	conc = 'C';
        }
        if(media >= 7 && media < 9) {
        	conc = 'B';
        }
        if(media >= 9 && media <=10) {
        	conc = 'A';
        }
        return conc;
    }
    public static void exibir(double n1, double n2) {
    	double media;
    	media = (n1 + n2) / 2;
    	System.out.println("Media calculada do aluno: " + media);
    	System.out.println("Conceito do aluno: " + conceituar(media));
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int cont=1;
        double n1, n2;
        
    	System.out.println("Programa para calcular conceitos de médias");
    	System.out.println("");
    	do {
        	cont++;
            System.out.println("Insira aqui sua nota da primeira avaliação:");
            n1 = in.nextDouble();
            while(n1 < 0 || n1 > 10){
            	System.out.println("Valor inválido. Por favor, tente novamente:");
            	n1 = in.nextDouble();
            }
            System.out.println("Insira aqui sua nota da segunda avaliação:");
            n2 = in.nextDouble();
            while(n2 < 0 || n2 > 10) {
            	System.out.println("Valor inválido. Por favor, tente novamente:");
                n2 = in.nextDouble();
            }
            exibir(n1, n2);
        }while(cont <= 60);
	}

}
