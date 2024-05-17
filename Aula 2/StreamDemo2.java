import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        Stream<Person> db =
        Stream.of(new Person("Rui", 80, 60.0, 1.70),
        new Person("Eva", 25, 70.0,1.82),
        new Person("Ivo", 25, 49.0,1.67),
        new Person("Otto", 48, 100.0,1.79));

        // long wcount = db
        //     .filter(w -> w.weight >= 80.0)
        //     .count();
        // System.out.println("O número de pessoas com mais de 80kg é"+ wcount);

        // List<Person> tallPeople = db
        //     .filter(h -> h.height >= 1.75)
        //     .toList();
        // for (Person e : tallPeople) {
        //     System.out.println(e.name);
        // }

        // long highBMI = db
        //     .map(p -> p.weight / (p.height * p.weight))
        //     .filter(x -> x > 25.0)
        //     .count();
        //     System.out.println(highBMI+" pessoas tem o IMC maior que 25");

        long oName = db
            .filter(o -> o.name.contains("oO"))
            .count();
            System.out.println(oName+" pessoas tem 'o' no nome");
    }
}
