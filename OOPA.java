class Car {
    private String doors;
    private String engine;
    private String driver;
    private int speed;

    public void SetSpeed(int speed) {
        this.speed = speed;
    }

    public int getspeed()

    {
        return speed;
    }
}

public class OOPA {
    public static void main(String[] args) {
        Car car = new Car();
        car.SetSpeed(10);
        System.out.println(car.getspeed());
    }
}