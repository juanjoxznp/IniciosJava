import java.util.Scanner;
public class Ternario {

        //Programa para determinar si un número es par o impar:


        public class ParImpar {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Ingrese un número: ");
                int numero = scanner.nextInt();
                String resultado = (numero % 2 == 0) ? "par" : "impar";
                System.out.println("El número ingresado es " + resultado);
            }
        }



    // Programa para determinar si un número es positivo, negativo o cero:

        public class PositivoNegativoCero {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Ingrese un número: ");
                int numero = scanner.nextInt();
                String resultado = (numero > 0) ? "positivo" : (numero < 0) ? "negativo" : "cero";
                System.out.println("El número ingresado es " + resultado);
            }
        }

    //  Programa para determinar si una persona es mayor de edad o menor de edad:


        public class MayorMenorEdad {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Ingrese su edad: ");
                int edad = scanner.nextInt();
                String resultado = (edad >= 18) ? "mayor de edad" : "menor de edad";
                System.out.println("Usted es " + resultado);
            }
        }



    //Programa para determinar el mayor de dos números:

        public class MayorDeDos {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Ingrese el primer número: ");
                int num1 = scanner.nextInt();
                System.out.print("Ingrese el segundo número: ");
                int num2 = scanner.nextInt();
                int mayor = (num1 > num2) ? num1 : num2;
                System.out.println("El número mayor es: " + mayor);
            }
        }

    //  Programa para determinar si un número es positivo o
    //  no positivo (negativo o cero):


        public class PositivoONoPositivo {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Ingrese un número: ");
                int numero = scanner.nextInt();
                String resultado = (numero > 0) ? "positivo" : "no positivo";
                System.out.println("El número ingresado es " + resultado);
            }
        }



    }


