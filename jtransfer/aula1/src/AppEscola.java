import java.util.Scanner;


public class AppEscola {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual seu nome?");
        String nome = teclado.nextLine();
        System.out.println("Qual a sua idade?");
        int idade = teclado.nextInt();
        System.out.println("Tem faculdade : 0-não e 1-sim");
        boolean temFaculdade = teclado.nextBoolean();
        Aluno aluno = new Aluno(nome,idade,temFaculdade); 
        System.out.println(aluno.getNome());
        System.out.println(aluno.getIdade());
        System.out.println(aluno.getTemFaculdade());

    }
}
