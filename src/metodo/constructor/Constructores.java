/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo.constructor;

/**
 *
 * @author Greta
 */
public class Constructores {

     double numero1;
     
     public Constructores(){
         
         System.out.println("Constructor sin parametros");
     }
     
     public Constructores(double a){
         System.out.println("Constructor con un parametro:");
         System.out.println(a);
     }
     
      public Constructores(double a, double b){
         System.out.println("Constructor con dos parametros:");
         System.out.println(a+" "+b);
     }
     
      public Constructores(double a, double b, double c){
         System.out.println("Constructor con tres parametros:");
         System.out.println(a+" "+b+" "+c);
     }
     
     
     
    public static void main(String[] args) {
        // TODO code application logic here
        Constructores obj1 = new Constructores();
        Constructores obj2 = new Constructores(5.3);
        Constructores obj3 = new Constructores(5, 4);
        Constructores obj4 = new Constructores(5, 4, 3);
    }
    
}
