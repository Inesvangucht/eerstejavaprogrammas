package Week3;

public class PlusPlus {

    public static void main(String[] args) {
        int a = 5, i;

        i = a++ + ++a + ++a;
        a = ++a + ++a + a++;

        System.out.println(i);
        System.out.println(a);
    }
}
