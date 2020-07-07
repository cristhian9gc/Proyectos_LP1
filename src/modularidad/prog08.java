
package modularidad;

//Autor: Cristian Gamboa Condori
public class prog08 {
    //metodos que reciben parametros
    public static void saludo(String nombre){
        System.out.println("Bienvenido "+ nombre);
        System.out.println("Disfruta tu estadia en este lugar");
    }
    public static void saludo2(String nombre, String carrera){
        System.out.println(nombre+" Disfruta tu estadia en la carrera de "+ carrera);
    }
    public static void main(String[] args) {
        saludo("Cristian");
        saludo2("Pamela Greta", "Ing. Sistemas");
    }
}
