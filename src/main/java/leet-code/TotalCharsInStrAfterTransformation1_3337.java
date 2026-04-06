import java.util.Arrays;
import java.util.List;

public class TotalCharsInStrAfterTransformation1_3337 {
    public static void main(String[] args) {
        System.out.println("Class called as TotalCharsInStrAfterTransformation1_3337");

        String s = "abcyy";

        int t = 2;

        List<Integer> numbs = Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2);

        System.out.print("\nResult is " + lengthAfterTransformations(s, t, numbs));
    }

    public static int lengthAfterTransformations(String s, int t, List<Integer> numbs) {

        List<Character> characterList = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');

        for (int i = 0; i < t; i++) {
            System.out.print(i);
        }

        return 0;
    }
}
