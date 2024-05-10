//10/05/2024//

import java.util.ArrayList;
import java.util.List;

public class StreamDemo{
    public static void main(String[] args) {
        List<String> datasource = new ArrayList<>();

        datasource.add("o");
        datasource.add("mar");
        datasource.add("não");
        datasource.add("te");
        datasource.add("magoa");
        datasource.add("e");
        datasource.add("não");
        datasource.add("ri");
        //quantas palavras diferentes com 3 ou mais letras?

        long count = datasource.stream()
            .distinct()
            .filter(w -> w.length() >= 3)
            .count();
        System.out.println(count);
    } 
}