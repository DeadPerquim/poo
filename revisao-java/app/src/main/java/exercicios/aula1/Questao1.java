package exercicios.aula1;
import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Entre com o seu nome:");
        String nome = leitor.next();
        leitor.nextLine();

        System.out.println("Entre com o ano que nasceu:");
        int anodenascimento = leitor.nextInt();
        leitor.nextLine();

        System.out.println("Entre com o ano atual");
        int anoatual = leitor.nextInt();
        leitor.nextLine();

        int idade = anoatual - anodenascimento;

        System.out.println(nome + ", poussui " + idade + " anos.");

        leitor.close();
    }
}
