package Logicnote;

public class WhileContadorImpar {
    public static void main(String[] args) {

        int contador = 1;

        while (contador <= 100) {

            if (contador % 2 != 1) {
                System.out.println(contador);


                contador++;

            }
        }
    }

}