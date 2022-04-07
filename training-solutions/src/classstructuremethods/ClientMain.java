package classstructuremethods;

public class ClientMain {

    public static void main(String[] args) {
        Client client=new Client();

        client.setName("Balazs");
        client.setYear(1982);
        client.setAddress("Budapest");
        client.migrate("Bécs");
        System.out.println("Név: " + client.getName() + "\nSzül. év: "+client.getYear()+ "\nCím: " + client.getAddress());
    }
}
