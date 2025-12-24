package Calculadora;

import java.util.Scanner;

public class CalCONSOLA {
    public static void main(String[] args) {
		Scanner operacion = new Scanner(System.in);
		boolean condicional = true;
		while (condicional == true){
			System.out.print("Escribe la operacion que quieras hacer (debe contener espacios) o stop para parar: ");
			String entrada = operacion.nextLine();
			if (entrada.equals("stop")){
				condicional = false;
				System.out.println("Apagando calculadora.");
			}else{
				String[] partes = entrada.split(" ");
				if (partes.length != 3){
					System.out.println("Error, la operacion debe tener dos numeros y una operacion por lo menos");
					break;
				}else{
					int numero1 = Integer.parseInt(partes[0]);
					int numero2 = Integer.parseInt(partes[2]);
					if (partes[1].equals("+")){
					System.out.println("Resultado = " + (numero1 + numero2));
					}else if (partes[1].equals("-")){
					System.out.println("Resultado = " + (numero1 - numero2));
					}else if (partes[1].equals("*")){
					System.out.println("Resultado = " + (numero1 * numero2));
					}else if (partes[1].equals("/")){
					System.out.println("Resultado = " + (numero1 / numero2));
					}
				}
			}
		}
	}
}
