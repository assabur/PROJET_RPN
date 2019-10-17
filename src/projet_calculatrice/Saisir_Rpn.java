/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_calculatrice;

import java.util.Scanner;

/**
 *
 * @author MAIGA
 */
public class Saisir_Rpn {
    
    Moteur_Rpn mon_moteur=new Moteur_Rpn();
    
    Scanner lecture =new Scanner(System.in);
   public void affichage()
   {
        
        System.out.println("veuillez tapez une valeur");
        String a= lecture.nextLine();
       do 
       {       
        if (a!="exit")
        {
            double b =Double.parseDouble(a);
            mon_moteur.enregistrer(b);
        }
        if (a.equals('+')||a.equals('-')||a.equals('*')||a.equals('/'))
        {
            
            double val1=mon_moteur.dépiler();
            double val2=mon_moteur.dépiler();
            char c= a.charAt(0);               
            mon_moteur.apply(c,val1,val2);
            
        }
        
        else
            System.exit(-1);
       }while (a!="exit");
       
       
       
       
   
   }
            
            
       
            
    
     
    
}
