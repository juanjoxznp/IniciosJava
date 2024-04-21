import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        //Determinar si un número es positivo, negativo o cero:

        public class PositivoNegativoCero {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Ingrese un número: ");
                int numero = scanner.nextInt();
                if (numero > 0) {
                    System.out.println("El número es positivo.");
                } else if (numero < 0) {
                    System.out.println("El número es negativo.");
                } else {
                    System.out.println("El número es cero.");
                }
            }
        }

        //  Determinar si un estudiante aprobó o reprobó
        //  un examen basado en su calificación:

        public class AprobarReprobar {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Ingrese la calificación del estudiante: ");
                double calificacion = scanner.nextDouble();
                if (calificacion >= 60) {
                    System.out.println("El estudiante aprobó el examen.");
                } else {
                    System.out.println("El estudiante reprobó el examen.");
                }
            }
        }

       // Determinar si un número ingresado por el usuario es primo o no:


        public class NumeroPrimo {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Ingrese un número entero positivo: ");
                int numero = scanner.nextInt();
                boolean esPrimo = true;
                if (numero <= 1) {
                    esPrimo = false;
                } else {
                    for (int i = 2; i <= Math.sqrt(numero); i++) {
                        if (numero % i == 0) {
                            esPrimo = false;
                            break;
                        }
                    }
                }
                if (esPrimo) {
                    System.out.println("El número ingresado es primo.");
                } else {
                    System.out.println("El número ingresado no es primo.");
                }
            }
        }


    }

}
