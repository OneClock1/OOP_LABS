import java.util.Scanner;
import StringChangerText.Lib.StringChangerText;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




        System.out.print("Text: ");
        String text = scanner.nextLine();
        StringChangerText stringChangerText = new StringChangerText(text);
        System.out.print("Line: ");
        String line = scanner.nextLine();
        System.out.print("Number: ");
        int number = scanner.nextInt();

        System.out.println(stringChangerText.getInsertLineAfterNumber(number, line));
        System.out.println("Number word = " + stringChangerText.getText().split(" ").length);

    }


}