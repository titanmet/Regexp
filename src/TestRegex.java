public class TestRegex {
    public static void main(String[] args) {
        /*
            \\d -  одна цифра
            \\w - одна буква
            + - 1 или более
            * - 0 или более
            ? - 0 или 1 символов до
            (x|y|z) - одно значение из перечисленного

            [a-zA-Z] - все английские буквы
            [0-9] - \\d
            [^abc] - все кроме перечисленных символов
            . - любой символ
            {5} - точное количество символов
            {2,} - 2 или более символов
            {2,4} - от 2 до 4 символов
         */
        String a = "-112345";
        String b = "12345";
        String c = "+12345";
        System.out.println(a.matches("(-|\\+)?\\d+"));
        System.out.println(b.matches("(-|\\+)?\\d+"));
        System.out.println(c.matches("(-|\\+)?\\d+"));

        String d = "b12345";
        String e = "bdsfsd12345";
        String g = "sddf342fsd243424";
        System.out.println(d.matches("[a-zA-Z]\\d+"));
        System.out.println(e.matches("[a-zA-Z]+\\d+"));
        System.out.println(g.matches("[a-zA-Z0-9]+"));

        String i = "hello";
        System.out.println(i.matches("[^abc]*"));

        String url = "http://www.google.com";
        System.out.println(url.matches("http://www\\..+\\.(com|ru)"));
    }
}
