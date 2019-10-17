/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_calculatrice;

import java.util.Stack;
import projet_calculatrice.Operation;

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
         Operation monoperation;
         switch(symbole)
         {
             case '+':
                 return Operation.PLUS.eval(a, b);
                 
             case '*':
                 return Operation.MULTIPLICATION.eval(a, b);
                 
            case '-':
              return Operation.MOINS.eval(a, b);
              
              
              case '/':
                 return Operation.DIVISION.eval(a, b);
         
         }
         
     }
}
