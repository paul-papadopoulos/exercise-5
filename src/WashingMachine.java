public class WashingMachine extends Device {
    private double noise_level;
    private double capacity;
    private double rotation_speed ;
    private String wifi;
    private String color;
    static int countWashingMachine;

    public WashingMachine(double Length, double Height, double Depth, String Mname, String Dname, String Dtype, double ENCON,
                          double noise_level,double capacity, double rotation_speed, String wifi, String color) {
        super(Length, Height, Depth, Mname, Dname, Dtype, ENCON);
        this.noise_level = noise_level;
        this.capacity = capacity;
        this.rotation_speed = rotation_speed;
        this.wifi = wifi;
        this.color = color;
        countWashingMachine++;
    }

    public String toString() {
        return noise_level + ", " + capacity + ", " + rotation_speed + ", " + wifi + ", " + color + '\n' + countWashingMachine + '\n';
    }
}

