public class Device {
    public double Length;
    public double Height;
    public double Depth;
    public String Mname;   //Όνομα Κατασκευαστή
    public String Dname;   //Όνομα Συσκευής
    public String Dtype;   //Τύπος Συσκευής
    public double ENCON;   //Κατανάλωση Ενέργειας
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
        return this.Length + ", " + this.Height + ", " + this.Depth + ", " + this.Mname + ", " + this.Dname + ", " + this.Dtype + ", " + this.ENCON + '\n';
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

