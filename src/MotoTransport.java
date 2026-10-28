public class MotoTransport extends Transport {
    private int power;
    private int fuel;
    private final double consumption = 10.0;

    public MotoTransport(String model, int power, int initFuel) {
        super(model);
        this.power = power;
        this.fuel = initFuel;
    }
    public String move(int distance) {
        double needFuel = this.power * this.consumption * (distance / 60) / 0.08;
        if(needFuel>this.fuel)
        {
            return "В баке недостаточно топлива";
        }
        this.fuel -= needFuel;
        return "Пройдено" + distance + "км. остаток топлива:" + this.fuel + "Литров";
    }
}
