package EJERCICIO4;

public class Ejercicio4 {
	static java.util.Scanner in;

	public static boolean casoDePrueba() {
		int n = Integer.parseInt(in.nextLine());
		if (n == 0)
			return false;
		// Programa aquí
		return true;
	}

	public static void main(String args[]) {
		in = new java.util.Scanner(System.in);
		while (casoDePrueba())
			;
	}
}