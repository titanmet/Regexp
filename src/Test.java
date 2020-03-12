import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String a = "World452345hello3245234523all324523452cat45234534523dog";
        String[] word = a.split("\\d+");
        System.out.println(Arrays.toString(word));

        String b = "Hello where hey";
        String c = b.replaceAll(" ",".");
        System.out.println(c);
    }
}
