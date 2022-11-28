public class Oven extends Device{
    private double noise_level;
    private String self_cleaning;
    private double temperature_range;
    private String wifi;
    private String color;
    static int countOven ;

    public Oven(double Length, double Height, double Depth, String Mname, String Dname, String Dtype, double ENCON,
                double noise_level,String self_cleaning, double temperature_range, String wifi, String color) {
        super(Length, Height, Depth, Mname, Dname, Dtype, ENCON);
        this.noise_level = noise_level;
        this.self_cleaning = self_cleaning;
        this.temperature_range = temperature_range;
        this.wifi = wifi;
        this.color = color;
        countOven++;
    }

    public String toString(){
        return noise_level + ", " + self_cleaning + ", " + temperature_range + ", " + wifi + ", " + color + '\n' + countOven + '\n';
    }
}