public class Main
{
    public static void main(String[] args)
    {
        double purchasePrice = 70.22;
        double salestax = 0;
        final double TAX_RATE = .05;

        salestax = purchasePrice * TAX_RATE;

        System.out.println("The sales tax on a purchase of " + purchasePrice + " is $" + salestax);

    }
}