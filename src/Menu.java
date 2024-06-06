import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import br.com.tech4change.*;

public class Menu {
    private List<EmpresaParceira> empresasParceiras = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.exibirMenuPrincipal();
    }

    public void exibirMenuPrincipal() {
        while (true) {
            System.out.println("Bem-vindo à Fazenda Marinha Tech4Change!");
            System.out.println("Escolha uma opção:");
            System.out.println("1. Login como empresa parceira");
            System.out.println("2. Login como cliente");
            System.out.println("3. Cadastro de empresa parceira");
            System.out.println("4. Cadastro de cliente");
            System.out.println("5. Sair");
            System.out.print("\nDigite o número da opção desejada: ");
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    loginEmpresaParceira();
                    break;
                case "2":
                    loginCliente();
                    break;
                case "3":
                    cadastroEmpresaParceira();
                    break;
                case "4":
                    cadastroCliente();
                    break;
                case "5":
                    System.out.println("Obrigado por usar a Fazenda Marinha Tech4Change!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
        }
    }

    private void loginEmpresaParceira() {
        System.out.print("\nDigite o login da empresa parceira: ");
        String login = scanner.nextLine();
        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        EmpresaParceira empresa = encontrarEmpresa(login, senha);
        if (empresa != null) {
            empresa.exibirMenuEmpresa();
        } else {
            System.out.println("\nLogin ou senha incorretos.");
        }
    }

    private EmpresaParceira encontrarEmpresa(String login, String senha) {
        for (EmpresaParceira empresa : empresasParceiras) {
            if (empresa.getLogin().equals(login) && empresa.getSenha().equals(senha)) {
                return empresa;
            }
        }
        return null;
    }

    private void loginCliente() {
        System.out.print("\nDigite o e-mail do cliente: ");
        String email = scanner.nextLine();
        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        Cliente cliente = encontrarCliente(email, senha);
        if (cliente != null) {
            cliente.exibirMenuCliente();
        } else {
            System.out.println("E-mail ou senha incorretos.");
        }
    }

    private Cliente encontrarCliente(String email, String senha) {
        for (Cliente cliente : clientes) {
            if (cliente.getEmail().equals(email) && cliente.getSenha().equals(senha)) {
                return cliente;
            }
        }
        return null;
    }

    private void cadastroEmpresaParceira() {
        System.out.print("Digite um login para a empresa: ");
        String login = scanner.nextLine();
        System.out.print("Digite uma senha: ");
        String senha = scanner.nextLine();
        empresasParceiras.add(new EmpresaParceira(login, senha));
        System.out.println("Empresa cadastrada com sucesso!");
    }

    private void cadastroCliente() {
        System.out.print("Digite seu e-mail: ");
        String email = scanner.nextLine();
        System.out.print("Digite uma senha: ");
        String senha = scanner.nextLine();
        clientes.add(new Cliente(email, senha));
        System.out.println("Cliente cadastrado com sucesso!");
    }
}
