package EJERCICIO2;

public class Ejercicio2 {
	/**
	 * Debes imprimir todos los números de un array, excepto el mayor y el menor
	 */
	public static void main(String[] args) {
		int[] ejemplo1 = { 1, 2, 3, 4, 5, 6, 7 }; // Mostraría 2 3 4 5 6
		int[] ejemplo2 = { 8, 4, 2, 4, 3, 2 }; // Mostraría 4 4 3
		int min = ejemplo1[0];
		int max = ejemplo1[0];
		for (int i = 0; i < ejemplo1.length; i++) {
			if (ejemplo1[i] >= max) {
				max = ejemplo1[i];
			} else if(ejemplo1[i] <= min) {
				min = ejemplo1[i];
			}
		
		if(ejemplo1[i]< max || ejemplo1[i] > min) {
				System.out.print(ejemplo1[i]);
			}
			
	
		
		
			
		
		
	}
}
}

