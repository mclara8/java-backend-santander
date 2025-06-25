import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in); 
        //Todo: Conhecer e importar a classe Scanner
        //Exibir as mensagens para o usuário 

         //Obter pela classe Scanner os valores digitados no terminal
        System.out.print("Digite o seu nome: ");
        String nomeCliente = scan.nextLine();
        

        System.out.println("Digite o número da sua conta: ");
        int numeroConta = scan.nextInt();
        scan.nextLine();

        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scan.nextLine();
        

        System.out.println("O seu saldo é: ");
        float saldo = scan.nextFloat();
      
        //Exibir a mensagem conta criada
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco.%n \n", nomeCliente);
        System.out.printf("Agência: %s | Conta: %d | Saldo disponível: R$ %.2f%n", agencia, numeroConta, saldo);

        scan.close();

    }
}
