package sintaxe;
import java.util.Scanner;

public class ExerciciosSintaxe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anoAtual = 2025;

        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite o seu ano de nascimento");
        int anoNascimento = sc.nextInt();

        int idade = (anoAtual - anoNascimento);

        System.out.println("Olá, " + nome + "! você tem " + idade + " anos.");

        sc.close();
    }
}
