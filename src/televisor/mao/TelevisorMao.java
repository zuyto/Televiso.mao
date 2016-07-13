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
public class TelevisorMao { 
    Scanner op=new Scanner(System.in);
    
     public void EncenderTv(String enc){
         if (enc.equals("on")) { 
         System.out.println("la tv esta encendida"); 
         }
     } 
     String sw; 
     public void CambiarCanal(String elegir){
         System.out.println("INGRESE NUMERO DE CANAL");
     do{ String num; num=op.next(); 
     if (num.equals("9")) System.out.println(">>>>>usted esta viendo FRECUENCIA LATINA"); 
     if(num.equals("11")) System.out.println(">>>>>usted esta viendo AMERICA TELEVISION"); 
     if(num.equals("13")) System.out.println(">>>>>usted esta viendo ATV"); 
     if(num.equals("4")) System.out.println(">>>>>usted esta viendo RED GLOBAL"); 
     System.out.println("····presione !!SW!! para cambiar·····"); 
     System.out.println("····presione SALIR para cambiar de opcion·······"); sw=op.next(); 
     }
     while(sw.equals("sw")); 
     } 
     public void CantVolumen(int x){
         if (x>0 && x<51) {
             System.out.println("volumen medio..:::");
         } 
         if(x>51 && x<101){ 
             System.out.println("volumen alto......:::!!!!!¨¨"); 
         }
     } 
     public void Mute(String silence){ 
         if (silence.equals("mute")) { 
             System.out.println("!!!MUTE!!!!");
         }
     } 
     public void CambiaraCable(String camb){ 
         if (camb.equals("si")) {
             System.out.println("!!!usted esta viendo cable!!!"); 
         }
     }
     public void AccesoInternet(String x){ String salir; 
     if(x.equals("192.168.1.3")){ 
         do{ System.out.println( "elija la opcion"); 
         System.out.println( "::::::::::::::::::"); 
         System.out.println( "1:Internet"); 
         System.out.println( "2:music");
         System.out.println( "3:videos");
         System.out.println( "::::::::::::::::::"); 
         int opcion; String camb; String nav; opcion=op.nextInt(); 
         do{ if(opcion==1) {
             System.out.println(" :::.escriba el navegador "); 
             System.out.println(" ........................"); 
             System.out.println(" google chrome"); 
             System.out.println(" explorer"); 
             System.out.println(" firefox");
             System.out.println(" opera"); 
             nav=op.next(); 
             if(nav.equals("chrome"))
                 System.out.println(" BIENVENIDO A google Chrome");
             if(nav.equals("explorer"))
                 System.out.println(" BIENVENIDO A EXPLORER");
             if(nav.equals("firefox")) 
                 System.out.println(" BIENVENIDO A FIREFOX");
             if(nav.equals("opera"))
                 System.out.println(" BIENVENIDO A OPERA"); 
             System.out.println(" ......");
             System.out.println("presione cambiar para estar en otro navegador");
             System.out.println("presione salir");
         }
                  camb=op.next(); 
         }
         while(camb.equals("cambiar")); 
         if(opcion==2)
             System.out.println(" :::.eliga la musica que desea escuchar");
         if(opcion==3)
             System.out.println(" :::.eliga los videos que desea escuchar"); 
         System.out.println(" presione sw para cambiar");
         System.out.println(" presione off para salir de internet"); 
         salir=op.next();
         }
         while(salir.equals("sw")); 
     } 
     System.out.println(" ingrese una ip correcta"); 
     }
} 

