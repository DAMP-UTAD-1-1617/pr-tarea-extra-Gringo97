import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
	int[] valores;
	Scanner sc;

	public void introducirValores(int cantidad) {
		sc = new Scanner(System.in);
		valores = new int[cantidad];
		for (int i = 0; i < valores.length; i++) {
			System.out.printf("Introduzca el elemento %dº: ", i + 1);
			valores[i] = sc.nextInt();
		}
	}

	public String toString() {
		return Arrays.toString(valores);
	}

	/**
	 * Debes cambiar las posiciones pares por las posiciones impares del
	 * atributo "valores" que es de tipo array Ejemplo: 1 2 3 4 5 -> 2 1 4 3 5
	 */
	public void intercambiar() {
	}

	public static void main(String[] args) {
		Ejercicio1 ejemplo = new Ejercicio1();
		ejemplo.introducirValores(5);
		ejemplo.intercambiar();
		System.out.println(ejemplo);
	}
}