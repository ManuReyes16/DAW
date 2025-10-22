/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aventura1;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Aventura1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         System.out.println("Bienvenido a este juego");
        Scanner sc = new Scanner (System.in);
        
       
        
        boolean salir = false;
        int opcion = 5;
        int resultado = 0;
                
        String panelOpciones = "elige un camino: 1. izquierda, 2. derecha, 3. recto, 4. me quedo en el sitio, 5. dame otra vez las opciones";
        
                              
      do{
          System.out.println(panelOpciones);
          opcion = sc.nextInt();
      switch (opcion){
                case 1:{
                    System.out.println("muere");
                    salir = true;
                    break;
                }   
                case 2:{
                    System.out.println("muere");
                    salir = true;
                    break;
                }    
                    
                case 3: {
                    System.out.println("bien, sigues vivo. Ahora elige 1. derecha, o 2. izquierda:");
                    
                    int subOpcion1 = sc.nextInt();
                     
                    
                    if(subOpcion1 == 2){
                        System.out.println("muere");
                        salir = true;
                        
                    }else if (subOpcion1 == 1){
                        System.out.println("sigamos por aquí mejor. Elige de nuevo. 1. derecha, o 2. izquierda: ");
                        int subOpcion2 = sc.nextInt();
                        
                      if (subOpcion2 == 1){
                          System.out.println("muere");
                          salir = true;
                      }else if (subOpcion2 == 2){
                          System.out.println("sigamos corre!!!. Elige de nuevo. 1. derecha, o 2. izquierda: ");
                        int subOpcion3 = sc.nextInt();
                        
                        if (subOpcion3 == 2){
                            System.out.println("muere");
                            salir = true;
                        }else if (subOpcion3 == 1){
                            System.out.println("HAS GANADO VIEO KIERES 50€ O NOOOOO?");
                            salir = true;
                        }
                      }  
                        
                    }  
 
                    break;    
                }
                    
                case 4:{
                    System.out.println("muere");
                    salir = true;
                    break;    
                }
                case 5:{
                    System.out.println(panelOpciones);
                    
                    break;
                }    
                    
                default:
                    System.out.println("Erroreeees");
            }       
      }while (!salir);
            
                
                
                  
                                                  
            
    }
          
        
}        
                 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
   

