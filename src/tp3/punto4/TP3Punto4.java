
package tp3.punto4;

import dominio.Array;
import java.util.Scanner;


public class TP3Punto4 {

    
    public static void main(String[] args) {
      int vec[]=new int[3];
      Scanner input=new Scanner(System.in);
      Array array=new Array();
      int cont=0;
      while(cont<3){
          System.out.println("Ingrese un numero");
          vec[cont]=input.nextInt();
          cont++;
      }
      array.mostrarVector(vec);
      array.buscarMenorMayor(vec);
        System.out.println("El promedio es:"+array.calcularPromedio(vec));
    }
    
}
