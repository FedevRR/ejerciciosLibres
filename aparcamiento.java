


package ejlibres;

import java.util.Scanner;

public class aparcamiento {
    public static void main(String[] args) {

        /** definimos los strings que tenemos llenos de datos
         *y los strings nuevos que vamos a usar para manipularlos
         */

      String[] dniClientes={"326748f", "123456g", "567894a", "349812l", "503799h",
              "450922i","182344t", "772342y", "882375j", "458573g" };
      String[] coloresPosibles = {"rojo", "azul", "negro", "blanco", "gris"};

      String[] matriculaCoche = new String[dniClientes.length];
      String[] colorCocheClientes = new String[dniClientes.length];

     /** se define un scaner para cada tipo de dato que queremos usar */
     Scanner scString= new Scanner(System.in);

      for (int i = 0; i < dniClientes.length; i++) {
          String matricula= " ";
          do{
              System.out.println("introduzca la matricula del cliente " + dniClientes[i]+ ": ");
              matricula= scString.nextLine();

          }while(matricula.length()!= 7);
          // se asigna la matricula en la posicion i del array
          matriculaCoche[i]= matricula; //crea el array de las matriculas que antes habiamos dejado en blanco

          /** se pide el color del cliente */
          String colorCoche=" ";
          do {
              System.out.println("introduzca el color del cliente con dni " + dniClientes[i] + ": ");
              colorCoche = scString.nextLine();

          }while(!arrayContieneTexto(coloresPosibles, colorCoche));
          colorCocheClientes[i]= colorCoche;
          System.out.println("color correcto: "+ colorCoche);
      }
        for (int i = 0; i < dniClientes.length; i++) {
            System.out.println("El cliente con DNI " + dniClientes[i] + " tiene asignado el coche "
                    + matriculaCoche[i] + " de color " + colorCocheClientes[i]);
        }
        }

    public static boolean arrayContieneTexto(String[] textosPosibles, String textoAComprobar) {
        for (String texto : textosPosibles) {
            if (texto.equals(textoAComprobar)) {
                return true;
            }
        }
        return false;
    }

}
