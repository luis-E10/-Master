

package ciudades;

import java.util.*;

public class Ciudades {
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        String lista[]=new String[100];

        int i, lim;
        
        Scanner Teclado = new Scanner (System.in);
       
       System.out.println("Ingrese el limite del arreglo");
       lim=Teclado.nextInt();
       
       System.out.println("Ingrese "+lim+" ciudades\n");
       
       for(i=0;i<lim;i++){
           lista[i]=lector.nextLine();
       }
       System.out.println("\n\n");
       for(i=0;i<lim;i++){
           System.out.println("["+i+"]= "+lista[i]);
       }
  
    }
    
}
