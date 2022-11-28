public class Device {
    private double Length;
    private double Height;
    private double Depth;
    private String Mname;   //Όνομα Κατασκευαστή
    private String Dname;   //Όνομα Συσκευής
    private String Dtype;   //Τύπος Συσκευής
    private double ENCON;   //Κατανάλωση Ενέργειας
    boolean status;

    public Device(double Length, double Height, double Depth, String Mname, String Dname, String Dtype, double ENCON) {
        this.Length = Length;
        this.Height = Height;
        this.Depth = Depth;
        this.Mname = Mname;
        this.Dname = Dname;
        this.Dtype = Dtype;
        this.ENCON = ENCON;
    }

    public String toString() {
        return Length + ", " + Height + ", " + Depth + ", " + Mname + ", " + Dname + ", " + Dtype + ", " + ENCON + '\n';
    }

    void PowerOn(){
        status = true;
        System.out.println("status device is true");
    }


    void PowerOff(){
        status = false;
        System.out.println("status device is false");
    }

    boolean status() {
        return status;
    }
}

