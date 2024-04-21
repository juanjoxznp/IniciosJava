public class TiposOperadores {

    public static void main(String[] args) {

        //Operadores aritméticos: Se utilizan para
        // realizar operaciones matemáticas básicas, como suma,
        // resta, multiplicación y división.

        int a = 10;
        int b = 5;

        int suma = a + b;       // Suma
        int resta = a - b;      // Resta
        int multiplicacion = a * b;  // Multiplicación
        int division = a / b;   // División

       // Operadores de asignación: Se utilizan
        // para asignar valores a variables.

        int x = 10;   // Asigna el valor 10 a la variable x

        int y = 10;
        y -= 4;  // Equivalente a y = y - 4, y ahora es 6

        int z = 2;
        z *= 5;  // Equivalente a z = z * 5, z ahora es 10

       // Operadores de comparación: Se utilizan para
        // comparar valores y devolver un resultado booleano.

        int a = 5;
        int b = 10;

        boolean esMayor = (a > b);   // Devuelve false, ya que a no es mayor que b
        boolean esIgual = (a == b);  // Devuelve false, ya que a no es igual a b
        boolean esMenorOIgual = (a <= b); // Devuelve true, ya que a es menor o igual que b




       // Operadores lógicos: Se utilizan para
        // realizar operaciones lógicas en valores booleanos.

        boolean esVerdadero = true;
        boolean esFalso = false;

        boolean resultadoAnd = (esVerdadero && esFalso);  // Devuelve false, ya que una de las condiciones es falsa
        boolean resultadoOr = (esVerdadero || esFalso);   // Devuelve true, ya que al menos una de las condiciones es verdadera
        boolean resultadoNot = !esVerdadero;             // Devuelve false, ya que negamos el valor verdadero


    }
}
