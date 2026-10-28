public abstract class Transport {
    private String model;

    public Transport(String model) {
        this.model = model;
    }

    public abstract String move(int distance);
}





