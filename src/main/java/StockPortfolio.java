public class StockPortfolio {
    double value = 200000;
    static int transferFee = 10;


    public double getValue() {
        return value;

    }

    public static void setTransferFee(int newTransferFee) {
        StockPortfolio.transferFee = newTransferFee;
    }

    public double transfer(double amount) {
        double transferAmount = transferFee + amount;

        return transferAmount;



    public double applyChange() {
        return transferAmount / amount;

        }

}
