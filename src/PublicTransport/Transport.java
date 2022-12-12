package PublicTransport;

public class Transport {
    private String name;
    private Integer spots;

    public Transport() {
        System.out.println("New Object Created");
    }

    public void move (Integer spots) {
        if (spots < 4) {
            System.out.println("Move fast");
        } else {
            System.out.println("Move carefully");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSpotsCount() {
        return spots;
    }

    public void setSpotsCount(Integer spots) {
        this.spots = spots;
        if (spots > 7) {
            System.out.println("Bus");
        } else {
            System.out.println("Car");
        }
    }

    @Override
    public String toString() {
        return "Transport{" +
                "name='" + name + '\'' +
                '}';
    }
}
