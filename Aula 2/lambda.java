/*
Método Normal
String change(String txt){return txt.toUpperCase();}
//10-05-2024
Lambda, ex. 1
(String txt) -> {return txt.toUpperCase();}

Lambda, ex. 2
(Integer x, Integer y) -> {
    if(x > y)
        return x;
    else
        return y;
}

Lambda ex. 2 v2 - simplificacao que dispensa tipos dos params
(x, y) -> {return (x > y ? x : y)}
v3 - simplificacao que ha so um statement, dispensando as chaves ({}) e return
(x, y) -> (x > y ? x : y)


lambda ex. 3
(Integer x) -> {return Integer.toString(x);}
ex. 3 v2 - simplificação que dispensa parentêses no parametro pois 1 so param.
x -> Integer.toString(x)

lambda ex. 4
() -> System.out.println("hello")
*/