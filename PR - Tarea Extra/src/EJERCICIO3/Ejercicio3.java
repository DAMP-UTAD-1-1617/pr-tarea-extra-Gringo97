package EJERCICIO3;

public class Ejercicio3 {
	/**
	 * Programa este m�todo para que devuelva true si todos los elementos del
	 * Array que se pasa por par�metro son pares y false en caso contrario
	 */
	public boolean todoPares(int[] vector) {
		boolean res = false;
		return res;
	}

	public static void main(String[] args) {
		int[] ejemplo1 = { 3, 4, 5, 6, 7 };
		int[] ejemplo2 = { 2, 6, 8, 10, 12 };
		Ejercicio3 miEjemplo = new Ejercicio3();
		// Este deber�a imprimir No
		System.out.println(miEjemplo.todoPares(ejemplo1) ? "S�" : "No");
		// Este deber�a imprimir S�
		System.out.println(miEjemplo.todoPares(ejemplo2) ? "S�" : "No");
	}
}