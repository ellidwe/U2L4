public class TipCalculator {

    private double billBeforeTip;
    private double tipPercent;
    private int partySize;

    TipCalculator(double billBeforeTip, double tipPercent, int partySize)
    {
        this.billBeforeTip = billBeforeTip;
        this.tipPercent = tipPercent;
        this.partySize = partySize;
    }

    public void calculateTip()
    {
        System.out.println();
        System.out.printf("The total tip is $" + "%.2f",(tipPercent * billBeforeTip)); //Formats tip amount to have 2 decimal places
        System.out.println();
        System.out.printf("The total price with the tip is $" + "%.2f",((tipPercent * billBeforeTip) + billBeforeTip)); //Formats total price to have 2 decimal places
        System.out.println();
        System.out.printf("The total tip per person is $" + "%.2f",((tipPercent * billBeforeTip) / partySize)); //Formats total tip per person to have 2 decimal places
        System.out.println();
        System.out.printf("The total with the tip per person is $" + "%.2f",(((tipPercent * billBeforeTip) + billBeforeTip) / partySize)); //Formats total with tip to have 2 decimal places
    }
}
