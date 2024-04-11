package condicional;

import java.util.Scanner;

public class CampeonatoFut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 final int qtdeTimes = 5;
	        final int qtdeJogadores = 11;
	        
	        int i, j;
	        
	        int idade;
	        double altura, peso;
	        
	        float mediaIdade = 0, mediaAltura = 0;
	        int contMediaIdade = 0, contMediaAltura = 0;
	        
	        int qtdeMenor18 = 0, qtdeMaior80Kg = 0;
	        
	        Scanner sc = new Scanner(System.in);
	        
	        for (i = 1; i <= qtdeTimes; i++) {
	            for (j = 1; j <= qtdeJogadores; j++) {
	                System.out.println("idade do jogador: ");
	                idade = sc.nextInt();
	                System.out.println("altura do jogador: ");
	                altura = sc.nextDouble();
	                System.out.println("peso do jogador: ");
	                peso = sc.nextDouble();
	                
	                if (idade < 18) {
	                    qtdeMenor18++;
	                }
	                if (peso > 80) {
	                    qtdeMaior80Kg++;
	                }
	                
	                mediaIdade += idade;
	                contMediaIdade++;
	                mediaAltura += altura;
	                contMediaAltura++;
	            }
	            System.out.printf("A idade média do time %d é %f\n", i, mediaIdade/contMediaIdade);
	            System.out.printf("A altura média do time %d é %f\n", i, mediaAltura/contMediaAltura);
	            
	            mediaIdade = 0;
	            contMediaIdade = 0;
	            mediaAltura = 0;
	            contMediaAltura = 0;
			 }
			 System.out.printf("No campeonato %d jogadores são menores que 18 anos\n", qtdeMenor18);
			 System.out.printf("No campeonato  %d jogadores tem acima de 80 Kg\n", qtdeMaior80Kg);
			 
			 sc.close();
		}
			    
	}