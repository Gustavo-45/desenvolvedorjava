import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args ) throws Exception {
        int transporte;
        String meio = ""; 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual seu nome?");
        String nome = scanner.nextLine();

        System.out.println("Qual meio de trasnporte você utiliza para ir ao trabalho?: ");
        System.out.println("1-Metrô");
        System.out.println("2-Ônibus");
        System.out.println("3-Caminhada");
        System.out.println("4-Uber");
        System.out.println("5-Táxi");
        System.out.println("6-Carro");
        System.out.println("Escolha uma opção (1-6)");
        transporte = scanner.nextInt();

        switch (transporte) {
            case 1:
                meio = "Metrô";break;
            case 2: 
                meio = "Ônibus";break;
            case 3:
                meio = "Caminhada";break;
            case 4:
                meio = "Uber";break;            
            case 5:   
                meio = "Táxi";break;
            case 6:   
                meio = "Carro";break;        
        }

        System.out.println("Nome: "+nome+ ", Meio de Transporte: "+ meio);
       
    }
}

// Task de amanhã: Salvar os dados no arquivo.
// Task no GitHu (git e github)
