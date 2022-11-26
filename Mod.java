package zModulação1;

import java.util.Scanner;

public class Mod {
	public static void menu() { 
	    System.out.println("Opções de conversão disponíveis:");
	    System.out.println("");
	    System.out.println("Opção 1 = Conversão para dólar");
	    System.out.println("Opção 2 = conversão para real");
	    System.out.println("");
	    System.out.println("Informe qual será a opção desejada:");
	}
	public static double transdolar(double real) {
	    double cotadolar, vdolar;
	    cotadolar = 5.40;
	    vdolar = real / cotadolar;
	    return vdolar;
	}	
    public static double transreal(double dolar) {
    	double vreal, cotadolar;
    	cotadolar = 5.40;
    	vreal = dolar * cotadolar;
    	return vreal;
        }
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double real, transf, dolar;
        char resp2;
	    int resp;
        
	    System.out.println("Programa para conversão de moedas");
	    do {
	    	System.out.println("");
            menu();
            resp = in.nextInt();
	        if(resp == 1) {
	            System.out.println("Informe o valor em reais a ser convertido:");
		        real = in.nextDouble();
		        transf = transdolar(real);
		        System.out.println("Valor equivalente em dólares: $" + transf);
	        }
	        if(resp == 2) {
		        System.out.println("Informe o valor em dólares a ser convertido:");
		        dolar = in.nextDouble();
		        transf = transreal(dolar);
		        System.out.println("Valor equivalente em reais: R$" + transf);
	        }
	        System.out.println();
	        System.out.println("Deseja encerrar a execução do programa?");
	        resp2 = in.next().charAt(0);
	        resp2 = Character.toLowerCase(resp2);
	        while(resp2 != 'n' && resp2 != 's') {
	    	    System.out.println("Resposta inválida. Por favor, tente novamente:");
	    	    resp2 = in.next().charAt(0);
		        resp2 = Character.toLowerCase(resp2);
	        }
	    }while(resp2 == 'n');
	
	
   }

}