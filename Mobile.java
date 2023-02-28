package MobileCart;

public class Mobile  implements Exchangable,Repairable,Sellable,Talking {
    private String name;
    private double price;
    private String brand;
    private MobileType mobileType;
    private RingType ringType;
    private DailType dailType;

    public Mobile(String name, double price, String brand, MobileType mobileType, RingType ringType, DailType dailType) {
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.mobileType = mobileType;
        this.ringType = ringType;
        this.dailType = dailType;

    }

    public String toString() {
        return "Name" + name + "Price" + price + "Brand" + brand + "MobileType" + mobileType + "RingType" + ringType + "DailType" + dailType;
    }

    @Override
    public void Exchangable() {
        System.out.println("Samsung mobile can be Exchangable");


    }

    @Override
    public void Repairable() {
        System.out.println("Redmi Mobile will be repair");
    }

    @Override
    public void Sellable() {
        System.out.println("One Plus Mobile will be Sale after using many year");
    }

    @Override
    public void Talking() {
        System.out.println("LG mobile will be talking only");
    }
}





