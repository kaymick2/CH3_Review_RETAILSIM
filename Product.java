   public class Product {

    private String name;
    private double price;

    public Product(String name, double price) {
      this.name = name;
      this.price = price;
    }
    public String getName() {
      return name;
    }
    public double getPrice(){
      return price;
    }
    public double priceDecline(){
     double hotDeals = price -(price * (0.2));
     return hotDeals;
    }
   }