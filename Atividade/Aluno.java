public class Aluno{
    public long matricula;
    public String nome;
    public long idade;
    public String curso;
    public Double ira;


    public Aluno(long matricula, String nome, long idade, String curso, Double ira) {
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.ira = ira;
    }

    public double getIra() {
        return ira;
    }


    public long getMatricula() {
        return this.matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getIdade() {
        return this.idade;
    }

    public void setIdade(long idade) {
        this.idade = idade;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void setIra(Double ira) {
        this.ira = ira;
    }

}
