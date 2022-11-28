public class Fridge extends Device{
    private double noise_level;
    private String water_dis;
    private String ice_dis;
    private String wifi;
    private String color;
    static int countFridge;

    public Fridge(double Length, double Height, double Depth, String Mname, String Dname, String Dtype, double ENCON,
                  double noise_level, String water_dis, String ice_dis, String wifi, String color) {
        super(Length, Height, Depth, Mname, Dname, Dtype, ENCON);
        this.noise_level = noise_level;
        this.water_dis = water_dis;
        this. ice_dis =  ice_dis;
        this.wifi = wifi;
        this.color = color;
        countFridge++;
    }

    public String toString(){
        return  noise_level + ", " + water_dis + ", " + ice_dis + ", " + wifi + ", " + color + '\n' + countFridge + '\n';
    }
}


