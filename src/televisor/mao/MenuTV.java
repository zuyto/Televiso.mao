/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package televisor.mao;
import java.util.*;
/**
 *
 * @author zuyto
 */
 public class MenuTV { 
     
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in); 
         System.out.println(" ");
         TelevisorMao tv1=new TelevisorMao();
         int opcion; String op;
         do{ 
             System.out.println("QUE OPERACION DESEA REALIZAR");
             System.out.println("=============================");
             System.out.println("OP 1: encender TV"); 
             System.out.println("OP 2: Swtich Channel");
             System.out.println("OP 3: volumen");
             System.out.println("OP 4: mute"); 
             System.out.println("OP 5: Swtich cable"); 
             System.out.println("OP 6: Acceso a Internet");
             System.out.println("OP 7: apagar TV");
             System.out.println("=============================="); 
             System.out.println("by MAURO MARTINEZ");
             opcion=sc.nextInt(); 
             switch (opcion) { 
                 case 1:
                     System.out.println("presione !ON! para encender"); 
                 tv1.EncenderTv(sc.next());
                 break; 
                 case 2: 
                     System.out.println(" presione !ELEGIR! canal"); 
                     System.out.println(" ...................."); 
                     System.out.println(" canal 9 FRECUENCIA LATINA"); 
                     System.out.println(" canal 11 AMERICA TV"); 
                     System.out.println(" canal 13 ATV"); 
                     System.out.println(" canal 4 RED GLOBAL"); 
                     System.out.println(" .......................");
                     tv1.CambiarCanal(sc.next());
                     break; 
                 case 3: 
                     System.out.println( " voulumen entres 1 y 100"); 
                     tv1.CantVolumen(sc.nextInt());
                     break; 
                 case 4: 
                     System.out.println( "presione MUTE para silenciar");
                     tv1.Mute(sc.next());
                     break;
                 case 5: 
                     System.out.println( "Esta seguro de cambiar a cable (SI/NO)");
                     tv1.CambiaraCable(sc.next());
                     break; 
                 case 6: 
                     System.out.println( "Ingrese la IP de intenet"); 
                     tv1.AccesoInternet(sc.next());
                     break; 
                 default: 
                     break;
             } 
             System.out.println("desea continuar ......(SI/NO)");
             System.out.println(" "); 
             op=sc.next(); 
         }
         while(op.equals("si")); 
     }
 } 
