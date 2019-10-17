/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_calculatrice;

public enum Operation {
 PLUS('+') {  
        @Override
        public double eval(double operande1, double operande2) {
            return operande1+operande1;
        }
    },MOINS('-') {
        @Override
        public double eval(double operande1, double operande2) {
           return operande1-operande1;
        }
    },MULTIPLICATION('*') {
        @Override
        public double eval(double operande1, double operande2) {
         return operande1*operande1;
        }
    },DIVISION('/') {   
        @Override
        public double eval(double operande1, double operande2) {
            return operande1/operande1;
        }
    };   

    static Operation valueOf(char symbole) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private final char  symbole;
    private Operation(char symbole)
        {    
            this.symbole=symbole;
        }    
        public abstract double eval(double operande1,double operande2);
          
}
