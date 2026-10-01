package Logicnote.MetodoVoid;

public class PromedioNotas {


    public static void main(String[] args) {
        System.out.println("El promedio de la nota es: " + CalcularPromedioNotas(4.5f, 3.8f, 4.2f));

    }

    public static float CalcularPromedioNotas(float nota1, float nota2, float nota3) {
        float PromedioNotas = (nota1 + nota2 + nota3) / 3;
        return PromedioNotas;

    }
}