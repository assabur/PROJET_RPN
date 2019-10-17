/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_calculatrice;

import java.util.Stack;

/**
 *
 enregistrer une opérandes,

appliquer une opération sur les opérandes,

retourner l’ensemble des opérandes stockées.
 */
public class Moteur_Rpn 
{
    Stack pile =new Stack();
    public void enregistrer (double operande)
    {
        pile.add(operande);
    }
     public double apply (char symbole,double a, double b)
     {
         Operation monoperation = Operation monoperation.eval(a, b);
         switch(symbole)
         {
             case '+':
                 
         
         
         }
         
         
         
     }
}
