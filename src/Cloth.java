public class Cloth extends Product {

    private String size;


    public Cloth(int id, String name, String size, Double price)
    {
        super(id,name,price);

        this.size = size;
    }
    public String getSize()
    {
        return this.size;
    }
}
