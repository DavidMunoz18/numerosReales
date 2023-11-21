package numerosReales;

import java.util.Scanner;

public class inicio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa un float");
		float numeroReal1 = sc.nextFloat();
		
		System.out.println("Ingresa un float");
		float numeroReal2 = sc.nextFloat();
		
		System.out.println("Ingresa un float");
		float numeroReal3 = sc.nextFloat();
		
			if((numeroReal1 > numeroReal2) & (numeroReal2 > numeroReal3)) 
				 {
					System.out.println(numeroReal1 + " " + numeroReal2 + " " + numeroReal3);
				
				
			}
			else if ((numeroReal1 > numeroReal3)&(numeroReal3 > numeroReal2))
				 {
					System.out.println(numeroReal1 + " " + numeroReal3 + " " + numeroReal2);
				
 			}
			else if ((numeroReal2 > numeroReal1) &(numeroReal1 > numeroReal3))
				 {
					System.out.println(numeroReal2 + " " + numeroReal1 + " " + numeroReal3);
				
			}
			else if ((numeroReal2 > numeroReal3) &(numeroReal3 > numeroReal1)){
				 {
					System.out.println(numeroReal2 + " " + numeroReal3 + " " + numeroReal1);
				}
			}
			else if ((numeroReal3 > numeroReal2)&(numeroReal2 > numeroReal1))
				 {
					System.out.println(numeroReal3 + " " + numeroReal2 + " " + numeroReal1);
				
			}
			else if ((numeroReal3 > numeroReal1)&(numeroReal1 > numeroReal2))
				 {
					System.out.println(numeroReal3 + " " + numeroReal1 + " " + numeroReal2); 
				
			}
		
	}

}
