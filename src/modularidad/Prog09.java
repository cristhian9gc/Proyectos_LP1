
package modularidad;

//Autor: Cristian Gamboa Condori
public class Prog09 {
    //Metodos que devuelven valores
    public static String miuniversidad(){
        String universidad ="Universidad Nacional Tecnologica de Lima sur";
        return universidad;
    }
    
    public static void main(String[] args) {
        System.out.println(miuniversidad());
        System.out.println(miuniversidad().toUpperCase());
    }
}
