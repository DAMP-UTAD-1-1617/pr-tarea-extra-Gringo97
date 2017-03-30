package EJERCICIO2;

import java.util.Arrays;

public class Ejercicio2 {

	public static void main(String[] args) {
		int[] ejemplo1 = { 1, 2, 3, 4, 5, 6, 7 }; // Mostraría 2 3 4 5 6
		int[] ejemplo2 = { 8, 4, 2, 4, 3, 2 }; // Mostraría 4 4 3
		mostrarArray(ejemplo1);
		mostrarArray(ejemplo2);

	}

	private static void mostrarArray(int[] a) {
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			if (a[i] != a[0] && a[i] != a[a.length - 1])
				System.out.print(a[i]);
		}
		System.out.println();
	}
}