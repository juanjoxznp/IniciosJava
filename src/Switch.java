public class Switch {

    public static void main(String[] args) {

       // Ejemplo de determinar el día de la semana según un número:
        public class DiaDeLaSemana {
            public static void main(String[] args) {
                int dia = 3; // Ejemplo: 1 para lunes, 2 para martes, etc.
                String nombreDia;
                switch (dia) {
                    case 1:
                        nombreDia = "Lunes";
                        break;
                    case 2:
                        nombreDia = "Martes";
                        break;
                    case 3:
                        nombreDia = "Miércoles";
                        break;
                    case 4:
                        nombreDia = "Jueves";
                        break;
                    case 5:
                        nombreDia = "Viernes";
                        break;
                    case 6:
                        nombreDia = "Sábado";
                        break;
                    case 7:
                        nombreDia = "Domingo";
                        break;
                    default:
                        nombreDia = "Día inválido";
                        break;
                }
                System.out.println("El día correspondiente al número " + dia + " es: " + nombreDia);
            }
        }

       // Ejemplo de calcular el número de días en un mes según el nombre del mes:

        public class DiasEnElMes {
            public static void main(String[] args) {
                String mes = "Febrero"; // Ejemplo: "Enero", "Febrero", etc.
                int numDias;
                switch (mes) {
                    case "Enero":
                    case "Marzo":
                    case "Mayo":
                    case "Julio":
                    case "Agosto":
                    case "Octubre":
                    case "Diciembre":
                        numDias = 31;
                        break;
                    case "Abril":
                    case "Junio":
                    case "Septiembre":
                    case "Noviembre":
                        numDias = 30;
                        break;
                    case "Febrero":
                        numDias = 28; // O 29 si es año bisiesto, pero se omite la lógica aquí por simplicidad
                        break;
                    default:
                        numDias = -1; // Valor inválido
                        break;
                }
                System.out.println("El mes de " + mes + " tiene " + numDias + " días.");
            }
        }

        //Ejemplo de determinar el precio de un producto según su código:

        public class PrecioDelProducto {
            public static void main(String[] args) {
                int codigoProducto = 2; // Ejemplo: 1 para producto A, 2 para producto B, etc.
                double precio;
                switch (codigoProducto) {
                    case 1:
                        precio = 10.99;
                        break;
                    case 2:
                        precio = 25.50;
                        break;
                    case 3:
                        precio = 15.75;
                        break;
                    default:
                        precio = -1; // Código inválido
                        break;
                }
                if (precio != -1) {
                    System.out.println("El precio del producto con código " + codigoProducto + " es: $" + precio);
                } else {
                    System.out.println("Código de producto inválido.");
                }
            }
        }


    }
}
