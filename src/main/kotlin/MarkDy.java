import java.util.Scanner;

public class MarkDy {
}

class HomeWork10_03_23 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String string = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder(string);

        if (stringBuilder.charAt(0) == 'i') {
            System.out.println((Integer.parseInt(stringBuilder.delete(0, 1).toString()) + 1));

        } else if (stringBuilder.charAt(0) == 's') {
            System.out.println(stringBuilder.delete(0, 1).reverse());

        } else
            System.out.println(string);

    }

}

