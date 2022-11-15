class Car {
    private String doors;
    private int speed;

    public void SetSpeed(int speed) {
        this.speed = speed;
    }

    public int getspeed()

    {
        return speed;
    }

    public String getdoors() {
        return doors;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    public String run()
    {
        if(doors.equals("Closed") && speed>0 )
        {
            return "Running";
        }
        else
        {
            return "not running";
        }
    }

}

public class OOPB {
    public static void main(String[] args) {
        Car car = new Car();
        car.setDoors("closed");
        car.SetSpeed(18);
        System.out.println(car.run());
    }
}