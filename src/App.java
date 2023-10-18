import java.util.Scanner;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class App {
    static Scanner input = new Scanner(System.in);
    static List<Cliente> clientes = new ArrayList<Cliente>();
    static List<Conta> contas = new ArrayList<Conta>(); 

    public static void main(String[] args) throws Exception {
        while (true){
            System.out.println("------------- B A N C O M A U T --------------------");
            System.out.println("------------- 1 - Criar Conta          -------------");
            System.out.println("------------- 2 - Entrar Conta Corrente ------------");
            System.out.println("------------- 3 - Entrar Conta Poupança ------------");
            System.out.println("------------- 0 - Sair                  ------------");

            System.out.println("Digite a opção desejada: ");
            int opcao = input.nextInt();

            switch (opcao){
                case 0:
                    System.out.println("Obrigada por utilizar o Banco Maut!");
                    System.exit(0);
                    break;

                case 1:
                    criarConta();
                    break;
             }
        }
    }

    private static void criarConta(){

        System.out.println("Digita seu nome: ");
        String nome = input.next();

        System.out.println("DIgita seu CPF: ");
        String cpf = input.next();

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date data = null;
        
        while (true) {
            try {
                System.out.println("Digite sua data de nascimento: ");
                data = format.parse(input.next());
                break;
            } catch (Exception e) {
                System.out.println("Data inválida!");
            }
        }

        System.out.println("Digite o nome da rua: "); 
        String rua = input.next(); 

        System.out.println("Digite o nome da cidade: ");
        String cidade = input.next();

        System.out.println("Digite o nome do país: ");
        String pais = input.next();

        Endereco endereco = new Endereco(rua, 0, cpf, rua, cidade, pais);
        Cliente newCliente = new Cliente(nome, cpf, data, endereco);
        clientes.add(newCliente);

        Conta newConta = new Conta(pais, 0, 0, newCliente);
        contas.add(newConta);
    }
    
}


