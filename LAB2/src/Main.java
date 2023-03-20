import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder text = new StringBuilder();
        System.out.print("Text: ");
        text.append(scanner.nextLine());
        System.out.print("Line: ");
        String line = scanner.nextLine();
        System.out.print("Number: ");
        int number = scanner.nextInt();

        text.insert(text.indexOf(String.valueOf(number)) + 1,line);

        System.out.println(text);
        System.out.println("Number word = " + text.toString().split(" ").length);

    }


}