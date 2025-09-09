import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Welcome");
        System.out.println("Github");

        String reverse=StringReverse.reverse("kishore");
        System.out.println(reverse);
        System.out.println("============");
        int[] a={5,6,1,3,2,4,7};
        System.out.println(Arrays.toString(a));
        SortArray.sortArr(a);
        System.out.println(Arrays.toString(a));

    }
}