public class Main {
    public static void main(String[] args) {
        RegistroAcademico matricula01 = new RegistroAcademico("Karoline", 122, 2.0);
        RegistroAcademico matricula02 = new RegistroAcademico("Tasca", 123, 3.0);
        RegistroAcademico matricula03 = new RegistroAcademico("Giovanna", 124, 4.0);

        System.out.println(" Aluno 1 ");
        System.out.println("Nome: " + matricula01.getNome());
        System.out.println("Código do curso: " + matricula01.getCodigoCurso());
        System.out.println("Percentual Cobrança: " + matricula01.getPercentualCobranca());
        System.out.println("Número da matrícula: " + matricula01.getNumeroMatriculaAluno());

        System.out.println("\n");

        System.out.println(" Aluno 2 ");
        System.out.println("Nome: " + matricula02.getNome());
        System.out.println("Código do curso: " + matricula02.getCodigoCurso());
        System.out.println("Percentual Cobrança: " + matricula02.getPercentualCobranca());
        System.out.println("Número da matrícula: " + matricula02.getNumeroMatriculaAluno());

        System.out.println("\n");

        System.out.println(" Aluno 3 ");
        System.out.println("Nome: " + matricula03.getNome());
        System.out.println("Código do curso: " + matricula03.getCodigoCurso());
        System.out.println("Percentual Cobrança: " + matricula03.getPercentualCobranca());
        System.out.println("Número da matrícula: " + matricula03.getNumeroMatriculaAluno());
    }
}