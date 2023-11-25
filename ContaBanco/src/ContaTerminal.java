import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        /* 
            Todo's: Conhecer e importar a classe Scanner;
            Exibir as mensagens para o user;
            Obter pelo Scanner os valores digitados no terminal;
            Exibir a mensagem conta criada.
        */

        double saldo = 7.200;
        DecimalFormat df = new DecimalFormat("#0.000");

        System.out.println("Olá, para iniciar nosso atendimento, poderia nos informar o seu nome?");
        String nome = scanner.next();

        System.out.println("Qual o seu sobrenome?");
        String sobrenome = scanner.next();

        System.out.println("Olá " +nome+ " seja bem vindo ao atendimento do Banco Feels Good");

        System.out.println("Por favor, informe o número da sua conta:");
        int numero = scanner.nextInt();

        System.out.println("Também iremos precisar da sua agência:");
        String agencia = scanner.next();

        System.out.println("\nOlá " +nome+ " " +sobrenome+ ", obrigado por criar uma conta no banco Feels Good,\n Sua agência é: "+agencia+",\n O número da sua conta é: "+numero+",\n O seu saldo atual é: R$"+df.format(saldo)+",\n que já está disponível para saque.");
        

    }
}
