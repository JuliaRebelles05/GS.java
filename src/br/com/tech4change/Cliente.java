package br.com.tech4change;

import java.util.Scanner;

public class Cliente extends Usuario {
    private Scanner scanner = new Scanner(System.in);

    public Cliente(String login, String senha) {
        super(login, senha);
    }

    public void exibirMenuCliente() {
        while (true) {
            System.out.println("\nBem-vindo, " + getLogin() + "!");
            System.out.println("1. Importância da sua colaboração");
            System.out.println("2. Benefícios da sua colaboração");
            System.out.print("\nDigite o número da opção desejada: ");
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("\nVocê que mora próximo à pedaços de mar, rios e lagos, saiba que você é " +
                            "importante para o nosso projeto. As Fazendas Marinhas da Tech4Change contam com centenas " +
                            "de colaboradores espalhadas em território nacional. As fazendas marinhas são essenciais " +
                            "para enfrentar os desafios globais relacionados à segurança alimentar, sustentabilidade " +
                            "ambiental e desenvolvimento econômico. Sua importância continuará a crescer à medida que " +
                            "a demanda por alimentos aumenta e a necessidade de práticas de produção sustentável se " +
                            "torna mais urgente.");
                    break;
                case "2":
                    System.out.println("\nOs cuidadores de fazendas marinhas desempenham um papel vital na indústria da" +
                            " aquacultura, e os benefícios que recebem refletem a importância de seu trabalho. Além das " +
                            "recompensas financeiras, esses profissionais desfrutam de oportunidades de desenvolvimento," +
                            " segurança alimentar, segurança no emprego, e a satisfação de contribuir para práticas " +
                            "sustentáveis e a conservação ambiental.");
                    break;
                default:
                    return;
            }
        }
    }
}
