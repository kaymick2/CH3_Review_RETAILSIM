class Main {
  public static void main(String[] args) {
    Product pepperspray = new Product("Sabre Pepper Gel Spray, Pink with quick release mechanism", 9.99);
    Product WD40 = new Product("WD-40 Spray Protectant", 4.99);
    Product koffee = new Product("Keurig K55 K-Classic Single Serve Coffee Maker", 59.99);
    Product cleaner = new Product("409 Multi- Purpose cleaner", 5.99);

    System.out.println(pepperspray.getName() + "," + pepperspray.getPrice() + " Regular Price");
    System.out.println(WD40.getName() + "," + WD40.getPrice() + " Regular Price");
    System.out.println(koffee.getName() + "," + koffee.getPrice() + " Regular Price");
    System.out.println(cleaner.getName() + "," + cleaner.getPrice() + " Regular Price");
    System.out.println(
        "Right now at your Eastside HyBee, we have HOT DEALS going on through this Sunday! Stop on by and grab an ad!");
    System.out.println(
        "Here are some of the items with HOT DEALS! These won't last long, so come on down and shop while supplies last. And as always, thank you for shopping at your Eastside HyBee.");
    System.out.println();
    System.out.println(pepperspray.getName() + "," + pepperspray.priceDecline() + " Sale Price");
    System.out.println(WD40.getName() + "," + WD40.priceDecline() + " Sale Price");
    System.out.println(koffee.getName() + "," + koffee.priceDecline() + " Sale Price");
    System.out.println(cleaner.getName() + "," + cleaner.priceDecline() + " Sale Price");
  }
}