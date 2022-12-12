package PublicTransport;

public class Cars extends Transport {
    private String VIN;
    private String renNumber;

    public Cars(String VIN, String renNumber) {
        this.VIN = VIN;
        this.renNumber = renNumber;
    }

    @Override
    public void move(Integer spots) {
        super.move(spots);
        if (spots > 7) {
            System.out.println("It is not a car, it is probably bus");
        } else {
            System.out.println("It is Car or Van");
        }
    }

    public String getVIN() {
        return VIN;
    }

    public String getRenNumber() {
        return renNumber;
    }

}
