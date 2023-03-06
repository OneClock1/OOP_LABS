import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Main prog = new Main();

        Scanner scanner = new Scanner(System.in);
        System.out.printf("a = ");
        double a = scanner.nextDouble();
        System.out.printf("b = ");
        double b = scanner.nextDouble();
        System.out.printf("x = ");
        double x = scanner.nextDouble();

        System.out.printf("S = %f, Q = %f",
                prog.calculateS(a,b,x), prog.calculateQ(a,b,x));
        prog.outputCurrentDate();

    }
    private double calculateS(double a, double b, double x){
        return Math.pow(Math.tan(Math.pow(x, 3)), 2) * Math.pow((x + b),2) + a / Math.sqrt(x + b);
    }
    private double calculateQ(double a, double b, double x){
        return Math.pow(b * x, 2) / Math.pow(Math.E, a * x) - 1;
    }
    private void outputCurrentDate()
    {
        Date date = new Date();
        System.out.printf("\n%td %tB %tY", date, date, date);
    }
}