package computer;

public class PersonalComputerMain {

    public static void main(String[] args) {

        Cpu cpu=new Cpu("Intel xeon",4.6);

        PersonalComputer personalComputer=new PersonalComputer(cpu);

        Hardware monitor=new Hardware("monitor","LG");
        Hardware keyBoard=new Hardware("keyboard","samsung");
        Hardware mouse=new Hardware("mouse", "Logitech");

        personalComputer.addHardware(monitor);
        personalComputer.addHardware(keyBoard);
        personalComputer.addHardware(mouse);

        Software windows =new Software("windows",11.0);
        Software imageJ =new Software("imageJ",9.0);

        personalComputer.addSoftware(windows);
        personalComputer.addSoftware(imageJ);

        System.out.println(cpu);
        System.out.println();
        System.out.println(monitor);
        System.out.println(keyBoard);
        System.out.println(mouse);
        System.out.println(windows);
        System.out.println(imageJ);


        System.out.println(personalComputer.getCpu());
        System.out.println(personalComputer.getHardWares());
        System.out.println(personalComputer.getSoftWares());

        System.out.println(personalComputer.getHardWares().size());
    }
}
