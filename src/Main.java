import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("How much is the bill? (Don't enter symbols) ");
        String billBeforeTip = s.nextLine();
        double billBeforeTipDouble = Double.parseDouble(billBeforeTip); //Assigns entered value to a double for future use

        System.out.print("How many people are in your party? ");
        String partySize = s.nextLine();
        int partySizeInt = Integer.parseInt(partySize); //Assigns entered value to an int for future use

        System.out.print("What percent of the bill would you like to tip? (Don't enter symbols) ");
        String tipPercent = s.nextLine();
        int tipPercentInt = Integer.parseInt(tipPercent);
        double tipPercentDecimal = tipPercentInt * 0.01; //Converts entered value into a decimal for future use

        TipCalculator calculator = new TipCalculator(billBeforeTipDouble, tipPercentDecimal, partySizeInt);

        calculator.calculateTip();

    }
}