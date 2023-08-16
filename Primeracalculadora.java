import java.util.Scanner;

public class Primeracalculadora { //Encabezado de clase

	public static void main(String[] args) {

		int Num1;
		int Num2;
		int suma_res;
		int resta;
		int multiplicacion;
		int division;
		int modulo;

		Scanner lector = new Scanner (System.in);

		System.out.println("Hola, escribe tu primer numero numeros");

		Num1 = lector.nextInt();

		System.out.println("Hola, escribe tu primer numero numeros");

		Num2 = lector.nextInt();


		suma_res = suma(Num1, Num2);
		resta = Num1 - Num2;
		multiplicacion = Num1 * Num2;
		division = Num1 / Num2;
		modulo = Num1 % Num2;

		System.out.println(" El resultado de la suma fue:");
		System.out.println(suma_res);

		System.out.println(" El resultado de la resta fue:");
		System.out.println(resta);
		
		System.out.println(" El resultado de la multiplicacion fue:");
		System.out.println(multiplicacion);
		
		System.out.println(" El resultado de la division fue:");
		System.out.println(division);
		
		System.out.println(" El resultado de la moduloo fue:");
		System.out.println(modulo);
	}

	/**
	* Descripción: El método suma_res tiene como tarea suma_resr dos números enteros y retornar el resultado
	* pre: El método suma_res recibe dos parámetros y retorna el resultado; no afecta variables globales
	* pos: Por lo anterior, no modifica variables globales
	* @param n1 int Debe ser un número entero cuya asignación ya haya ocurrido
	* @param n2 int Debe ser un número entero cuya asignación ya haya ocurrido
	* @return res int El resultado de suma_resr n1 y n2
	*/
	public static int suma(int n1, int n2) {
		int res;
		res = n1 + n2;
		return res;
	}
}