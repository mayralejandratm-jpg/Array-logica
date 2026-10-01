package Logicnote.MetodoVoid;

public class MetodoVoid {

    public static void main(String[]args){
        saludarPorElNombre("Juan");
        sumarDosNumeros(  100,  320);

    }


    public static void saludarPorElNombre(String nombre){

        System.out.println("Hola " + nombre);
    }

    public static void sumarDosNumeros(int num1, int sum2){
        int resultado = num1 + sum2;
        System.out.println("Resultado " + resultado);
    }
}
