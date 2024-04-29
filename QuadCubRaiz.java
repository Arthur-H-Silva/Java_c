package condicional;

import java.util.Scanner;

public class QuadCubRaiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num, quad = 0, cubo = 0, raiz = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do número em questão: ");
		num = sc.nextDouble();
		
		while(num > 0) {
			quad = num*num;
			cubo = num*num*num;
			raiz = Math.sqrt(num);
			
			System.out.println("o valor do quadrado de " + num + " é " + quad );
			System.out.println("o valor do cubo de " + num + " é " + cubo );
			System.out.println("o valor da raiz quadrada de " + num + " é " + raiz );
			
			num = sc.nextDouble();
			
			}
			
	     	}
		

}
