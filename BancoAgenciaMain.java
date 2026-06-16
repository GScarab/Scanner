import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BancoAgenciaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco();
        List<Agencia> agencias = new ArrayList<>();

    System.out.print("Digite o nome do banco: ");
            banco.setNome(scanner.nextLine());
    System.out.print("Digite o número do banco: ");
        banco.setNumero(scanner.nextInt());
    scanner.nextLine();


    while (true) {
        System.out.print("Deseja adicionar uma agência? (s/n): ");
        String resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase("s")) {
            Agencia agencia = new Agencia();
            System.out.print("Digite o nome da agência: ");
                agencia.setNome(scanner.nextLine());
            System.out.print("Digite o número da agência: ");
                agencia.setNumero(scanner.nextInt());
            scanner.nextLine();
            agencias.add(agencia);
        }
        
        else if (resposta.equalsIgnoreCase("n")) {
            break;
        }
        
        else {
            System.out.println("Digite uma resposta válida (s/n).");
        }
    }
        scanner.close();

        banco.setAgencias(agencias);
        
        System.out.println("Número do Banco: " + banco.getNumero());
        System.out.println("Nome do Banco: " + banco.getNome());
        System.out.println("Agências:");
        for (Agencia agencia : banco.getAgencias()) {
            System.out.println("- Número: " + agencia.getNumero() 
            + ", Nome: " + agencia.getNome());
        }
    }
}