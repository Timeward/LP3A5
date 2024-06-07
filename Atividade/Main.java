import java.util.List;

public class Main{
    public static void main(String[] args) {
        List<Aluno> db = List.of(
        new Aluno(3056945, "Eduardo", 23, "TADS", 7.1),
        new Aluno(3776591, "Kaik", 17, "BMBR", 8.2),
        new Aluno(3319822, "Gabe", 19, "TADS", 5.7),
        new Aluno(3096982, "Casey", 23, "HIST", 5.4),
        new Aluno(3918212, "Mina", 16, "MEDI", 7.2));

        //Q1: Gerar uma lista de nomes
        // List<String> names = db.stream()
        // .map(a -> a.nome)
        // .toList();
        // for (String a : names){
        //     System.out.println(a);
        // }

        //Q2: Lista de alunos do curso tads
        // List<Aluno> alunosTADS = db.stream().filter(a -> "TADS".equals(a.curso)).toList();
        // for (Aluno a : alunosTADS){
        //     System.out.println(a.nome);
        // }

        //Q3: tirar a média dos IRA dos alunos
        // double somaIRA = db.stream()
        // .mapToDouble(Aluno :: getIra)
        // .reduce(0, Double::sum);
        // mediaIRA = somaIRA / db.size();

        //Q4: Média de idade de alunos com ira abaixo de 6
        double somaIdade = db.stream()
        .filter(a -> a.ira < 6)
        .mapToDouble(Aluno :: getIdade)
        .reduce(0, Double::sum);
        double mediaIdade = somaIdade/db.stream().filter(a -> a.ira < 6).count();
        System.out.println(mediaIdade);
    }
}