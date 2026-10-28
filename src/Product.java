public class Product {
   private int id ;
   private String name;
   private Double price;

   public static  int counter = 0;

    public Product(int id,String name,Double price)
    {
        this.id = id;
        this.name = name;
        this.price = price;

        Product.counter++;
    }

    public int GetId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public Double getPrice()
    {
        return price;
    }
}
