public class Aluno {
    private final String nome;
    private final int matricula;
    private final int faltas;
    private final double nota1, nota2, nota3;

    public Aluno(String nome, int matricula, double nota1, double nota2, double nota3, int faltas){
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.faltas = faltas;
    }
    public double calcularMedia(){
        return (nota1 + nota2 + nota3) / 3;
    }

    private double mediaPresenca(){
        double totalAulas = 100;
        return ((totalAulas - faltas) / totalAulas) * 100.0;
    }

    public String getSituacao(){
        double media = calcularMedia();
        double presenca = mediaPresenca();
        if (presenca < 75.0) return  ("Reprovado por Falta (" + presenca + "% de presença)");
        if (media >= 7.0) return "Aprovado";
        if (media >= 5.0) return "Recuperação";
        return "Reprovado";
    }
    public String getNome() {return nome;}
    public int getMatricula() {return matricula;}
}