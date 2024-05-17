import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] alunos = {"Gabi", "Manu", "Davi", "João"};

        int media = calcularMediaTurma(alunos, scan);

        System.out.printf("Média da turma : ", media);
    }

    public static int calcularMediaTurma(String[] alunos, Scanner scanner){
       
        int soma = 0;
        for(String aluno : alunos){
            System.out.printf("Nota do aluno %s: ", aluno);
            int nota = scanner.nextInt();
            soma += nota;
        }
        return soma / alunos.length;
    }
}