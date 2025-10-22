/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aventuraconversacionalv1;
import java.util.Scanner;

/**
 *
 * @author EAG
 */
public class AventuraConversacionalV1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Bienvenido a este juego");
        Scanner sc = new Scanner (System.in);
        
       
        
        boolean salir = true;
        int opcion = 4;
        int resultado = 0;
                
        String panelOpciones = "elige un camino: 1. izquierda, 2. derecha, 3. recto, 4. volver a pensar, 5. salir del juego";
        
              System.out.println(panelOpciones);                  
        
        
            switch (opcion){
                
                case 1:
                    System.out.println("girar a la izquierda");
                    System.out.println(panelOpciones);
                    opcion = sc.nextInt();
                    break;
                    
                case 2:
                    System.out.println("girar a la derecha");
                    System.out.println(panelOpciones);
                    opcion = sc.nextInt();
                    break;
                    
                case 3: {
                    System.out.println("seguir recto");
                    System.out.println(panelOpciones);
                    opcion = sc.nextInt();
                    
                    
                    break;    
                }
                    
                case 4:
                    System.out.println("veamos a donde voy...");
                    
                    opcion = sc.nextInt();
                    break;    
                
                case 5:
                    System.out.println("hasta pronto");
                    salir = false;
                    break;
                    
                default:
                    System.out.println("esa opcion no es válida");
                  
                    
                    
            
            }        
                                                            
                                                          
            
                                                            
                                                           
      
       
               
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
