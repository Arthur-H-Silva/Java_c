package condicional;

import java.util.Scanner;

public class SalFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float sal_carlos, sal_joao;
		int meses;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("informe o valor do sálario de Carlos: ");
		sal_carlos = sc.nextFloat();
		
		sal_joao = sal_carlos/3;
		
		meses = 0;
		
		while(sal_joao < sal_carlos) {
			sal_carlos += sal_carlos*0.6/100;
			sal_joao += sal_joao*1/100;
			meses += 1;
		}
		System.out.println("serão necessários " + meses + " meses para que o valor do sálario de joão se iguale ou ultrapasse o de Carlos");
		sc.close();
  }
}
