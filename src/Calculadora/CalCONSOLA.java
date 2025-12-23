package Calculadora;

import java.util.Scanner;

public class CalCONSOLA {
    public static void main(String[] args) {
		Scanner num1 = new Scanner(System.in);
		System.out.print("Dame el primer numero para realizar la operacion: ");
		int numero1 = num1.nextInt();
		num1.close();
		
		Scanner operador = new Scanner(System.in);
		System.out.print("Dame el primer numero para realizar la operacion: ");
		String operacion = operador.nextLine();
		operador.close();
		
		Scanner num2 = new Scanner(System.in);
		System.out.print("Dame el segundo numero para realizar la operacion: ");
		int numero2 = num1.nextInt();
		num2.close();
		
	}
}
