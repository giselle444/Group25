package Group25.Rreze;

public class ReverseSolution2 {
    public static void main(String[] args) {
        System.out.println(reverse("aaabbccdd"));
    }
    public  static String  reverse(String str) {

        return new StringBuffer(str).reverse().toString();

    }


}
