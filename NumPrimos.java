package condicional;

import java.util.Scanner;

public class NumPrimos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int j, i, cont;	
		int num[] = new int[9];
		for(i =0; i <= 8; i++) {
			num[i] = sc.nextInt();
		}
		for(i = 0; i <= 8; i++) {
			cont = 0;
			for(j = 1; j <= num[i]; j++) {
				if((num[i]%j) == 0) {
					cont += 1;
				}
			}
			if(cont <= 2) {
					System.out.println(num[i]);
					System.out.println(i);
			}
			}
		}

}
