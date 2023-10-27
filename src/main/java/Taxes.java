import java.util.Scanner;

public class Taxes {
    static String makePretty(double t) {
        t = (t * 100 - ((t * 100) % 1)) / 100;
        String taxString = "" + t;
        int decimalFinder = taxString.indexOf(".");
        int decimals = taxString.length() - decimalFinder;
        if (decimals == 2) {
            taxString = taxString + "0";
        }
        return taxString;
    }
    static void printBracket(double t, String bracket){
        System.out.println("You are in the " + bracket + " tax bracket.\n" +
                "You will be paying £" + makePretty(t) + " in tax. Here's the breakdown:");
    }

    public static void main(String[] args) {
        Scanner inScanner = new Scanner(System.in);
        System.out.println("Input income here");
        float income = inScanner.nextFloat();
        if (income < 15000) {
            System.out.println("You are in the 0% tax bracket.\nYou earn all your money tax free!");
        } else {
            String taxBracket, taxString;
            int decimals, decimalFinder;
            double tax;
            if (income < 20000) {
                tax = (income - 15000) * 0.1;
                printBracket(tax, "10%");
                System.out.println("You earn the first £15000 tax free.");
                System.out.println("This leaves £" + makePretty(income - 15000) + ", of which you pay 10%, or £" +
                        makePretty(tax) + " in tax");
            } else if (income < 30000) {
                tax = ((income - 20000) * 0.15) + 500;
                printBracket(tax, "15%");
                System.out.println("You earn the first £15000 tax free.");
                System.out.println("You pay 10% on your next £5000, which is £500");
                System.out.println("This leaves £" + makePretty(income - 20000) + ", of which you pay 15%, or £" +
                        makePretty(tax - 500) + " in tax");
            } else if (income < 45000) {
                tax = ((income - 30000) * 0.2) + 2000;
                printBracket(tax, "20%");
                System.out.println("You earn the first £15000 tax free.");
                System.out.println("You pay 10% on your next £5000, which is £500");
                System.out.println("You pay 15% on your next £10000, which is £1500");
                System.out.println("This leaves £" + makePretty(income - 30000) + ", of which you pay 20%, or £" +
                        makePretty(tax - 2000) + " in tax");
            } else {
                tax = ((income - 45000) * 0.25) + 5000;
                printBracket(tax, "25%");
                System.out.println("You earn the first £15000 tax free.");
                System.out.println("You pay 10% on your next £5000, which is £500");
                System.out.println("You pay 15% on your next £10000, which is £1500");
                System.out.println("You pay 20% on your next £15000, which is £3000");
                System.out.println("This leaves £" + makePretty(income - 45000) + ", of which you pay 25%, or £" +
                        makePretty(tax - 5000) + " in tax");
            }
        }
    }
}
/*
0      - 14,999 :  0pc
15,000 - 19,999 : 10pc
20,000 - 29,999 : 15pc
30,000 - 44,999 : 20pc
45,000 +        : 25pc
*/