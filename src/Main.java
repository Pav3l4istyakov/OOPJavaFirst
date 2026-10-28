public class Main {
    public static void main(String[] args){
        Product p = new Product(1, "Milk", 120.0);
        Product p2 = new Product(2, "Coffee", 440.0);

        System.out.println(Product.counter);

        String str = "102";
        int x = 8 + Integer.parseInt(str);
    }
}
