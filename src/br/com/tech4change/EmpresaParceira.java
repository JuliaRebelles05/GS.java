package br.com.tech4change;

import java.util.Scanner;

public class EmpresaParceira extends Usuario {
    private Scanner scanner = new Scanner(System.in);

    public EmpresaParceira(String login, String senha) {
        super(login, senha);
    }

    public void exibirMenuEmpresa() {
        while (true) {
            System.out.println("\nBem-vindo, " + getLogin() + "!");
            System.out.println("1. Importância da sua Parceria");
            System.out.println("2. Benefícios da sua Parceria");
            System.out.print("\nDigite o número da opção desejada: ");
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("\nÉ com grande satisfação que compartilhamos informações da Fazenda Marinha " +
                            "Tech4Change. Como parceira, sua empresa desempenha um papel fundamental em nosso " +
                            "compromisso com a sustentabilidade dos oceanos e o fornecimento de produtos marinhos " +
                            "de alta qualidade. Nossa fazenda marinha é dedicada à produção responsável de alimentos " +
                            "marinhos, utilizando práticas sustentáveis que visam a preservação dos ecossistemas " +
                            "aquáticos.");
                    break;
                case "2":
                    System.out.println("\nA intenção da Tech4Change é atingir positivamente todos que fazem parte deste" +
                            " projeto, incluindo você Empresa Parceira. Em muitas jurisdições, o investimento em " +
                            "atividades sustentáveis, como fazendas marinhas, pode qualificar as empresas para " +
                            "incentivos fiscais, subsídios ou outros benefícios governamentais. Esses incentivos podem " +
                            "incluir redução de impostos, créditos fiscais ou acesso a fundos de investimento " +
                            "específicos. Além de fortalecer a imagem corporativa da sua empresa, diante das causas" +
                            " ambientais que impactam o mundo como um todo.");
                    break;
                default:
                    return;
            }
        }
    }
}

