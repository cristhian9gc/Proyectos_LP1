
package modularidad;

//Autor: Cristian Gamboa Condori
public class Prog10 {
    
        public static int factorial(int numero){
            int fac= 1;
            for (int j = 1; j <=numero; j++) {
                fac*=j;
            }
            return fac;
        }
    public static void main(String[] args) {
        System.out.println(factorial(7));
    }
}
