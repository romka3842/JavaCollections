public class Car {
    private String brand;

    public void setNumber(int number) {
        this.number = number;
    }

    private int number;

    public Car(String brand, int number) {
        this.brand = brand;
        this.number = number;
    }

    public String getBrand() {
        return brand;
    }

    public int getNumber() {
        return number;
    }

}
