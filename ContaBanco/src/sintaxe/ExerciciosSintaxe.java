package sintaxe;
import java.util.Scanner;

public class ExerciciosSintaxe {
    public static void main(String[] args) {
        //exercicio 1: Calcular a idade do usuário e exibir uma mensagem com seu nome e idade      
        Scanner sc = new Scanner(System.in);
        int anoAtual = 2025;

        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite o seu ano de nascimento");
        int anoNascimento = sc.nextInt();

        int idade = (anoAtual - anoNascimento);

        System.out.println("Olá, " + nome + "! você tem " + idade + " anos.");

        sc.close();

        //exercicio 2: calculo da área de um quadrado
        Scanner sca = new Scanner(System.in);

        System.out.println("Digite qual o tamanho do lado do quadrado: ");
        int lado = sca.nextInt(); 

        int area = lado * lado; 
        
        System.out.println("A área do quadrado é: " + area);

        sca.close();

        //exercício 3: calculo da área de um retângulo
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Digite o tamanho da base do retângulo: ");
        int base = sc1.nextInt();

        System.out.println("Digite a altura do retângulo: ");
        int altura = sc1.nextInt(); 

        int areaRetangulo = base * altura;
        System.out.println("A área do retângulo é: " + areaRetangulo);
    
        sc.close();

        //exercicio 4: diferença entre idades 
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Digite a idade da primeira pessoa: ");
        int idade1 = sc2.nextInt(); 

        System.out.println("Digite a idade da segunda pessoa: ");
        int idade2 = sc2.nextInt(); 

        int diferenca = (idade1 - idade2); 
        System.out.println("A diferença de idade é de " + diferenca + " anos.");

        sc.close();
    }

}
