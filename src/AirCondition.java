public class AirCondition extends Device{
    private double noise_level;
    private double btu;
    private String ionizer;
    private String wifi;
    private String color;
    static int countAirCondition;

    public AirCondition(double Length, double Height, double Depth, String Mname, String Dname, String Dtype, double ENCON,
                        double noise_level, double btu, String ionizer, String wifi, String color) {
        super(Length, Height, Depth, Mname, Dname, Dtype, ENCON);
        this.noise_level = noise_level;
        this.btu = btu;
        this.ionizer = ionizer;
        this.wifi = wifi;
        this.color = color;
        countAirCondition++;
    }

    public String toString(){
        return noise_level + ", " + btu + ", " + ionizer + ", " + wifi + ", " + color + '\n' + countAirCondition + '\n';
    }
}

