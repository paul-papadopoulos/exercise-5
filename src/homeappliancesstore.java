public class homeappliancesstore {
    static String compname;
    static String compadress;
    static int emp;

    static void deviceStatus(Device ask){
        System.out.println(ask.status());
    }



    public static void main(String[] args) {

        Device Fridge1;
        Fridge1 = new Fridge( 179,
                91,
                73,
                "LG",
                "GSLV70PZTM"
                , "PSIGIO NTOULAPA",
                430,
                55,
                "yes",
                "no",
                "yes",
                "white" );
        Device Fridge2;
        Fridge2 = new Fridge(178 ,
                91,
                71,
                "Samsung",
                "RS68A8822S9"
                , "PSIGIO NTOULAPA",
                281,
                54,
                "no",
                "yes",
                "no",
                "grey");

        Device WashingMachine1;
        WashingMachine1 = new WashingMachine(85,
                60,
                56,
                "LG",
                "F4WV308S3E"
                , "EMPROSTHIAS FORTISIS",
                63/100,
                74,
                9,
                1400,
                "no",
                "black"  );
        Device WashingMachine2;
        WashingMachine2 = new WashingMachine(85,
                60,
                55,
                "Samsung",
                "WW90T554DAX/S7"
                , "EMPROSTHIAS FORTISIS",
                49/100,
                77,
                10,
                1500,
                "yes",
                "white");

        Device Oven1;
        Oven1 = new Oven(59,
                59,
                54,
                "Bosch ",
                "BA51FN00"
                , "hlektrikos",
                420,
                55,
                "yes",
                275,
                "YES",
                "grey" );
        Device Oven2;
        Oven2 = new Oven(59,
                59,
                54,
                "Bosch",
                "HBA534ES0"
                , "hlektrikos",
                777,
                56,
                "no",
                285,
                "no",
                "inox");

        Device AirCondition1;
        AirCondition1 = new AirCondition(923,
                305,
                263,
                "Mitsubishi",
                "MSZ/MUZ-HR71VF"
                , "AC",
                355,
                72,
                18000,
                "yes",
                "no",
                "grey");
        Device AirCondition2;
        AirCondition2 = new AirCondition(849,
                289,
                215,
                "Toyotomi",
                "UTN/UTG-12AP"
                , "AC",
                400,
                78,
                19000,
                "yes",
                "yes",
                "white");


        System.out.println("Fridge1 : " + Fridge1 + '\n');
        Fridge1.PowerOn();
        deviceStatus(Fridge1);
        System.out.println("Fridge2 : " + Fridge2 + '\n');
        Fridge2.PowerOff();
        deviceStatus(Fridge2);

        System.out.println("WashingMachine1 : " + WashingMachine1 + '\n');
        WashingMachine1.PowerOn();
        deviceStatus(WashingMachine1);
        System.out.println("WashingMachine2 : " + WashingMachine2 + '\n' );
        WashingMachine2.PowerOff();
        deviceStatus(WashingMachine2);

        System.out.println("Oven1 : " + Oven1 + '\n');
        Oven1.PowerOn();
        deviceStatus(Oven1);
        System.out.println("Oven2 : " + Oven2 + '\n');
        Oven2.PowerOff();
        deviceStatus(Oven2);

        System.out.println("AirCondition1 = " + AirCondition1 + '\n' );
        AirCondition1.PowerOn();
        deviceStatus(AirCondition1);
        System.out.println("AirCondition2 = " + AirCondition2 + '\n');
        AirCondition2.PowerOff();
        deviceStatus(AirCondition2);

        int count =  Fridge.countFridge + WashingMachine.countWashingMachine + Oven.countOven + AirCondition.countAirCondition;
        System.out.println("sinolo siskevon = " + count +'\n');

        if(compname == null ) {
            System.out.println("compname error");
        }
        if (compadress == null ) {
            System.out.println("compadress error");
        }

        System.out.println("namec = " + compname + '\n' + "adressc = " + compadress + '\n' + "emp = " + emp);

    }
}

