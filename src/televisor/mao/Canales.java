/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package televisor.mao;
import java.util.Scanner;
/**
 *
 * @author jhone
 */
public class Canales {
    Scanner op = new Scanner(System.in);
    String sw;
     public void CambiarCanal(String elegir){
         if  (elegir.equals("ELEGIR")) {
         System.out.println("INGRESE NUMERO DE CANAL");
     do{ String num; num=op.next(); 
     if (num.equals("9")) System.out.println(">>>>>usted esta viendo CANAL INSTITUCIONAL"); 
     if(num.equals("11")) System.out.println(">>>>>usted esta viendo SEÑAL COLOMBIA"); 
     if(num.equals("13")) System.out.println(">>>>>usted esta viendo CANAL 13"); 
     if(num.equals("4")) System.out.println(">>>>>usted esta viendo RCN"); 
     System.out.println("····presione !!SW!! para cambiar·····"); 
     System.out.println("····presione SALIR para cambiar de opcion·······"); sw=op.next(); 
     }
     while(sw.equals("sw")); 
     } 
     }
    
}
