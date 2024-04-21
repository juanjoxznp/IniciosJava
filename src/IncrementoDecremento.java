public class IncrementoDecremento {

    public static void main(String[] args) {

      //  Los operadores de incremento (++) y decremento (--) se
        //  utilizan para aumentar o disminuir el valor de una variable
        //  en 1, respectivamente. Estos operadores pueden aplicarse tanto
        //  como prefijo (antes de la variable) como sufijo (después de la variable).
        //  La diferencia radica en el momento en que se realiza la operación de
        //  incremento o decremento con respecto a la evaluación de la expresión.



        //    Operador de incremento (++):
        //  Cuando se utiliza como sufijo, primero se evalúa la
        //  expresión y luego se incrementa la variable.

        int x = 5;
        int resultado = x++;  // resultado es igual a 5, luego x se incrementa a 6
        System.out.println("Resultado: " + resultado);  // Salida: 5
        System.out.println("x: " + x);  // Salida: 6

        //  Cuando se utiliza como prefijo, primero se incrementa
        //  la variable y luego se evalúa la expresión.

        int y = 5;
        int resultado = ++y;  // y se incrementa a 6, luego resultado es igual a 6
        System.out.println("Resultado: " + resultado);  // Salida: 6
        System.out.println("y: " + y);  // Salida: 6

        //    Operador de decremento (--):
        //     Al igual que con el operador de incremento,
        //     cuando se utiliza como sufijo, primero se evalúa
        //     la expresión y luego se decrementa la variable.

        int a = 10;
        int resultado = a--;  // resultado es igual a 10, luego a se decrementa a 9
        System.out.println("Resultado: " + resultado);  // Salida: 10
        System.out.println("a: " + a);  // Salida: 9

        //  Y cuando se utiliza como prefijo, primero se decrementa
        //  la variable y luego se evalúa la expresión.

        int b = 10;
        int resultado = --b;  // b se decrementa a 9, luego resultado es igual a 9
        System.out.println("Resultado: " + resultado);  // Salida: 9
        System.out.println("b: " + b);  // Salida: 9


    }

}
