import PublicTransport.Cars;
import PublicTransport.Transport;

public class Main {
    public static void main(String[] args) {
        //1
        Transport transport = new Transport();
        transport.setName("Volvo");
        transport.getName();
        System.out.println(transport);
        transport.setSpotsCount(4);
        transport.setSpotsCount(10);
        transport.move(2);
        transport.move(20);
        //2
        Cars car1 = new Cars("2w23e", "234 DFD");
        System.out.println(car1.getVIN());
        System.out.println(car1.getRenNumber());
        car1.move(3);

        Cars car2 = new Cars("435r6","564 WER");
        System.out.println(car2.getVIN());
        System.out.println(car2.getRenNumber());
        car2.move(8);



    }
}