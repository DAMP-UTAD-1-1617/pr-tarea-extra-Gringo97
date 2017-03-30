package EJERCICIO4;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 1;
		while (x != 0) {
			x = sc.nextInt();
			if (x != 0) {
				HashMap<Integer, Integer> valores = new HashMap<Integer, Integer>();
				for (int i = 0; i < x; i++) {
					int a = sc.nextInt();
					int res = a % 10;
					if (valores.containsKey(res)) {
						valores.put(res, valores.get(res) + 1);
					} else {
						valores.put(res, 1);
					}
				}
				String salida = "";
				int cant = 0;
				for (Map.Entry<Integer, Integer> entry : valores.entrySet()) {
					if (entry.getValue() > cant) {
						cant = entry.getValue();
						salida = "" + entry.getKey();
					} else if (entry.getValue() == cant) {
						salida = "VARIAS";
					}
				}
				System.out.println(salida);

			}
		}
	}
}