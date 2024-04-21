public class BreakContinue {

    public static void main(String[] args) {
     //   Ejemplo de Break

        public class EjemploBreak {
            public static void main(String[] args) {
                for (int i = 1; i <= 5; i++) {
                    if (i == 3) {
                        break; // Sale del ciclo cuando i es igual a 3
                    }
                    System.out.println(i);
                }
                System.out.println("Fin del ciclo");
            }
        }

      //  Ejemplo de continue
        public class EjemploContinue {
            public static void main(String[] args) {
                for (int i = 1; i <= 5; i++) {
                    if (i == 3) {
                        continue; // Salta la iteración cuando i es igual a 3
                    }
                    System.out.println(i);
                }
                System.out.println("Fin del ciclo");
            }
        }




    }

}
