package lab1_3; 

public class Receipt {
  public static void main(String[] args) {

    final double HST_RATE = 0.13;
    final int RECEIPT_WIDTH = 77;

    System.out.format("\n%48s", "Holiday Grocery\n");
    System.out.format("%49s", "---------------\n\n");

    System.out.println("Thank you for shopping at our store\n");
    System.out.println("Date:\t\t\tDec.23.2022");
    System.out.println("Location:\t\t0016225");
    System.out.println("Address:\t\t239 Rudolph Rd");
    System.out.println("\t\t\t\tToronto, ON");
    System.out.println("\t\t\t\tM72 2X4\n");

    System.out.print("Payment:\t\tCredit ");
    System.out.println("**** **** **** 1025");
    System.out.println("-".repeat(RECEIPT_WIDTH));

    // Item Codes
    String codeOrange = "002601", codeSalad = "137262", codeSpaghetti = "622516";

    // Descriptions
    String descriptOrange = "Home Orange",
        descriptSalad = "Green Salad",
        descriptSpaghetti = "Spaghetti US";

    // Quantities
    int qtyOrange = 12, qtySalad = 1, qtySpaghetti = 1;

    // Unit Prices
    double priceOrange = 2.59, priceSalad = 4.25, priceSpaghetti = 4.25;

    // Total Prices
    double totalOrange = qtyOrange * priceOrange,
        totalSalad = qtySalad * priceSalad,
        totalSpaghetti = qtySpaghetti * priceSpaghetti;

    // Subtotal and tax
    double subtotal = totalOrange + totalSalad + totalSpaghetti;
    double hst = subtotal * HST_RATE;

    String total = String.format("$%.2f", subtotal + hst);

    System.out.format("%s%7s%15s%16s%15s%19s\n", "Items", "Code",
        "Description", "Qty", "Unit Price", "Price");

    // Oranges
    System.out.format("%14s\t%s", codeOrange, descriptOrange);
    System.out.format("%16d%15.2f%19.2f\n", qtyOrange, priceOrange, totalOrange);

    // Salad
    System.out.format("%14s\t%s", codeSalad, descriptSalad);
    System.out.format("%16d%15.2f%19.2f\n", qtySalad, priceSalad, totalSalad);

    // Spaghetti
    System.out.format("%14s\t%s", codeSpaghetti, descriptSpaghetti);
    System.out.format("%15d\t%14.2f%19.2f\n", qtySpaghetti, priceSpaghetti, totalSpaghetti);

    System.out.println("-".repeat(RECEIPT_WIDTH));

    System.out.format("%64s%13.2f\n", "Subtotal", subtotal);
    System.out.format("%59s%18.2f\n", "HST", hst);
    System.out.format("%78s", "---------------------\n");
    System.out.format("%61s%16s\n\n", "Total", total);
  }
}