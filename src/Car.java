public class Car implements Vehicle {
    private Driver driver;


    public   Car() {
        System.out.println("Car created. 100 miles to go!");
    }
    @Override
    public void drive(){
        if (driver == null) {
            System.out.println("Car didn’t drive - there’s no driver!");
        }else System.out.println("Car drove 10 miles - 90 miles to go");

    }

    public void setDriver(Driver d) {
        if (d.getAge() < 18) {
            System.out.println("Driver not changed! " + d.getName() + " is too young to drive car");
            return;
        }
        this.driver = d;
        System.out.println("Driver changed to " + driver.getName());
    }

}


