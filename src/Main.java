import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Vitor Monea";
        String tipoConta = "Conta Corrente";
        double saldo = 2000.00;
        int opcao = 0;

        System.out.println("************************");
        System.out.println("\nNome do cliente:" + nome);
        System.out.println("Tipo da conta:" + tipoConta);
        System.out.println("Saldo atual:" + saldo);


        String menu = """
                *** Digite uma das opções ***
                1 - Consultar saldo
                2 - Transferir valor
                3 - Depositar valor
                4 - Sair
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            switch (opcao){
                case 1:
                    System.out.println(("Saldo atual: " + saldo));
                    break;

                case 2:
                    System.out.println("Digite o valor que irá transferir:");
                    double valorTransferencia = leitura.nextDouble();
                    if (valorTransferencia > saldo){
                        System.out.println("Saldo insuficiente para realizar a transação");
                    } else {
                        saldo -= valorTransferencia;
                        System.out.println("Transferência realizada com sucesso!");
                    }
                    break;
                case 3:
                    System.out.println("Digite o valor que será depositado:");
                    double valorDeposito = leitura.nextDouble();
                    saldo += valorDeposito;
                    System.out.println("Depósito realizado com sucesso!");
                    break;
                case 4:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    leitura.close();
    }
}