import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Main prog = new Main();
        prog.calculator();
        prog.date();

    }
    private void calculator () {
        System.out.printf("a = ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.printf("b = ");
        double b = scanner.nextDouble();
        System.out.printf("x = ");
        double x = scanner.nextDouble();
        run( a, b, x);
    }
    // double a = -0.5, b = 1,7, t=0.44;
    private void run(double a, double b, double x)
    {

        double s = Math.pow(Math.tan(Math.pow(x, 3)), 2) * Math.pow((x + b),2) + a / Math.sqrt(x + b);
        double q = Math.pow(b * x, 2) / Math.pow(Math.E, a * x) - 1;
        System.out.printf("a = %f; b = %f; x = %f", a, b, x);
        System.out.println("\n s = " + s);
        System.out.println(" q = " + q);
    }
    private void date ()
    {
        Date dat = new Date();
        System.out.printf("%td", dat);
        System.out.printf(" %tB", dat);
        System.out.printf(" %tY", dat);
    }
}