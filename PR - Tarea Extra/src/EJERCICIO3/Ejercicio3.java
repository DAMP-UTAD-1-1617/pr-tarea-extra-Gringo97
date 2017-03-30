package EJERCICIO3;

public class Ejercicio3 {
	/**
	 * Programa este método para que devuelva true si todos los elementos del
	 * Array que se pasa por parámetro son pares y false en caso contrario
	 */
	public boolean todoPares(int[] vector) {
		boolean res = false;
		for (int i = 0; i < vector.length; i++) {
			if(vector[i]%2==0){
				res = true;
			}else{
				res = false;
			}
		}
		
		return res;
		
	}

	public static void main(String[] args) {
		int[] ejemplo1 = { 3, 4, 5, 6, 7 };
		int[] ejemplo2 = { 2, 6, 8, 10, 12 };
		Ejercicio3 miEjemplo = new Ejercicio3();
		// Este debería imprimir No
		System.out.println(miEjemplo.todoPares(ejemplo1) ? "Sí" : "No");
		// Este debería imprimir Sí
		System.out.println(miEjemplo.todoPares(ejemplo2) ? "Sí" : "No");
	}
}