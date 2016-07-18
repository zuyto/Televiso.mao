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
     public void CantVolumen(int x){
         if (x>10 && x<51) {
             System.out.println("volumen MEDIO......:::");
         } 
         if(x>51 && x<101){ 
             System.out.println("volumen ALTO......:::!!!!!¨¨"); 
         }
         if(x>0 && x<10){ 
             System.out.println("volumen BAJO..::"); 
         }
     } 
     public void Mute(String mute){ 
         if (mute.equals("mute")) { 
             System.out.println("!!!MUTE!!!!");
         }
     } 
     
    public void CambiaraCable(String puerto) { 
         if (puerto.equals("ELEGIR")){
         System.out.println("ELIGA SU PUERTO DE ENTRADA");
     do{ String camb; camb=op.next(); 
     if (camb.equals("1")) System.out.println(">>>>>usted esta en el puerto TV"); 
     if(camb.equals("2")) System.out.println(">>>>>usted esta en el puerto CABLE"); 
     if(camb.equals("3")) System.out.println(">>>>>usted esta en el puerto HDMI"); 
     if(camb.equals("4")) System.out.println(">>>>>usted esta en el puerto RGB"); 
     System.out.println("····presione !!SW!! para cambiar·····"); 
     System.out.println("····presione SALIR para cambiar de opcion·······"); sw=op.next();
     
     }
     while(sw.equals("sw"));
     }
         
     } 
     

} 

