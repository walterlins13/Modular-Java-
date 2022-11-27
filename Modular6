package modular;

import java.util.Scanner;

public class Mod {
    public static double kelvin(double c) {
    	double k;
    	k = c + 273.15;
    	return k;
    }
	
	public static void menu() {
    	System.out.println("Opções de conversão de temperatura:");
    	System.out.println("");
    	System.out.println("1 = Conversão de graus Farenheit para graus Celsius");
    	System.out.println("2 = Conversão de graus Celsius para graus Farenheit");
    	System.out.println("3 = Conversão de graus Celsius para Kelvin");
    	System.out.println("");
    	System.out.println("Informe a opção de conversão:");
    }
	public static double conversaocelsius(double f) {
    	double c;
    	c = (f - 32) / 1.8;
    	return c;
    }
    public static double conversaofarenheit(double c) {
    	double f;
    	f = (c * 1.8) + 32;
	    return f;
	}
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double c, f;
        char resp;
        int conversao;
        
    	System.out.println("Programa de conversão de temperaturas");
        do {
        	System.out.println("");
        	menu();
        	conversao = in.nextInt();
        	while(conversao != 1 && conversao != 2 && conversao != 3) {
        		System.out.println("Opção inválida. Por favor, tente novamente:");
        	    conversao = in.nextInt();
        	}
        	if(conversao == 1) {
        		System.out.println("Informe a temperatura em graus Farenheit:");
        		f = in.nextDouble();
        		System.out.println("Temperatura em graus Celsius: " + conversaocelsius(f) + "°C");
        	}
        	if(conversao == 2) {
        		System.out.println("Informe a temperatura em graus Celsius:");
        		c = in.nextDouble();
        		System.out.println("Temperatura em graus Farenheit: " + conversaofarenheit(c) + "°F");
        	}
        	if(conversao == 3) {
                System.out.println("Temperatura em graus Celsius:");
                c = in.nextDouble();
                System.out.println("Temperatura em Kelvin: " + kelvin(c) + "K");
            }
        	System.out.println("");
        	System.out.println("Gostaria de finalizar a execução do programa? (S para sim / N para não)");
            resp = in.next().charAt(0);
            resp = Character.toLowerCase(resp);
            while(resp != 's' && resp != 'n') {
            	System.out.println("Resposta inválida. Por favor, tente novamente:");
            	resp = in.next().charAt(0);
                resp = Character.toLowerCase(resp);
            }
       }while(resp == 'n');
	}
}
