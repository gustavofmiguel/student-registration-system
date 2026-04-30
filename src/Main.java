import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("\n === MENU === ");
            System.out.println("1 - Cadastrar novo aluno");
            System.out.println("2 - Listar todos alunos");
            System.out.println("3 - Buscar por nome");
            System.out.println("4 - Buscar por Matricula");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            int op = sc.nextInt();
            if (op == 0) {
                System.out.println("Saindo...");
                break;
            }
            else if (op == 1) CadastroAluno.cadastrar(sc);
            else if (op == 2) CadastroAluno.listarTodos();
            else if (op == 3) CadastroAluno.buscaPorNome(sc);
            else if (op == 4) CadastroAluno.buscarPorMatricula(sc);
        }
        sc.close();
    }
}