import java.util.Scanner;
public class CadastroAluno {
    static final int MAX = 50;
    static Aluno[] alunos = new Aluno[MAX];
    static int quantidade = 0;


    static void cadastrar(Scanner sc){
        if (quantidade >= MAX){
            System.out.println("Cadastro Cheio");
            return;
        }
        sc.nextLine();
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Matricula: ");
        int matricula = sc.nextInt();
        System.out.print("Nota 1: ");
        double nota1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        double nota2 = sc.nextDouble();

        alunos[quantidade] = new Aluno(nome, matricula, nota1, nota2);
        System.out.println("Aluno cadastrado na posição: ["+ (quantidade)+ "]");
        quantidade++;
    }
    public static void listarTodos(){
        if (quantidade == 0){
            System.out.println("Nenhum aluno cadastrado");
            return;
        }
        System.out.printf("%-5s %20s %-12s %-8s %s%n",
                "Idx", "Nome", "Matricula", "Média", "Situação");
        System.out.println("-".repeat(55));
        for (int i = 0; i < quantidade; i++){
            Aluno a = alunos[i];
            System.out.printf("[%-2d] %-20s %-12d %-8.1f %s%n",
                    i, a.getNome(), a.getMatricula(),
                    a.calcularMedia(), a.getSituacao());
        }
    }

    static void buscaPorNome(Scanner sc) {
        sc.nextLine();
        System.out.print("Nome para busca: ");
        String busca = sc.nextLine().toLowerCase();
        boolean achou = false;
        for (int i = 0; i < quantidade; i++){
            if (alunos[i].getNome().toLowerCase().contains(busca)){
                System.out.printf("[%d] %s — Média %.1f — %s%n",
                        i, alunos[i].getNome(),
                        alunos[i].calcularMedia(),
                        alunos[i].getSituacao());
                achou = true;
            }
        }
        if (!achou) System.out.println("Nenhum aluno encontrado");
    }
}

