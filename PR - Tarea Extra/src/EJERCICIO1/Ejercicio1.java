package EJERCICIO1;

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

	public void intercambiar(int cantidad) {
		int value = 0;
		for(int i = 0; i < cantidad;i++){
			if(valores[i]%2!=0 && (i+1)<cantidad && value != valores[i]){
				value = valores[i];
				valores[i]=valores[i+1];
				valores[i+1]=value;
			}
		}
	}

	

	public static void main(String[] args) {
		Ejercicio1 ejemplo = new Ejercicio1();
		ejemplo.introducirValores(5);
		ejemplo.intercambiar(5);
		System.out.println(ejemplo);
	}
}