package exercicios.aula2;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        System.out.println("Entre com o valor do coeficiente a:");
        double a = leitor.nextDouble();
        System.out.println("Entre com o valor do coeficiente b:");
        double b = leitor.nextDouble();
        System.out.println("Entre com o valor do coeficiente c:");
        double c = leitor.nextDouble();

        double delta = Math.pow(b, 2) -4*a*c;

        System.out.println("o valor de delta é: " + delta);

        leitor.close();

    }
}
