//10-05-2024
@FunctionalInterface
interface Converter<T, R>{
    R apply(T source);
}
public class Main{
    public static void main(String[] args) {
        /*Converter<String, Boolean> str2bool = (String s) -> {
            return Boolean.parseBoolean(s);
        };*/
        Converter<String, Boolean> str2bool = s -> Boolean.parseBoolean(s);


        System.out.println(str2bool.apply("TruE"));
        System.out.println(str2bool.apply("FaLsE"));
        System.out.println(str2bool.apply(""));
    }
}