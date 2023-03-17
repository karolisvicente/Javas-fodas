public class RegistroAcademico {
    private String nome;
    private static int numeroMatricula=1;
    private int codigoCurso;
    private double percentualCobranca;
    private int numeroMatriculaAluno = numeroMatricula;

    public int getNumeroMatriculaAluno(){
        return numeroMatriculaAluno;
    }

    public void setNumeroMatriculaAluno(int numeroMatriculaAluno){
        this.numeroMatriculaAluno = numeroMatriculaAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static int getNumeroMatricula() {
        return numeroMatricula;
    }

    public static void setNumeroMatricula(int numeroMatricula) {
        RegistroAcademico.numeroMatricula = numeroMatricula;
    }

    public int getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public double getPercentualCobranca() {
        return percentualCobranca;
    }

    public void setPercentualCobranca(double percentualCobranca) {
        this.percentualCobranca = percentualCobranca;
    }

    public RegistroAcademico(String nome, int codigoCurso, double percentualCobranca){
        this.nome = nome;
        this.codigoCurso = codigoCurso;
        this.percentualCobranca = percentualCobranca;
        numeroMatricula++;
    }



}
