public class MilitaryTank implements Vehicle {
    private Driver driver;



    public  MilitaryTank() {
        System.out.println("Tank created.");
    }
    @Override
    public void drive(){
        if (driver == null) {
            System.out.println("Tank didn’t drive - there’s no driver!");
        }else System.out.println("Tank drove 5 miles - 1995 miles to go");
    }
    public void setDriver(Driver d) {
        this.driver = d;
        if (driver.getAge() < 25) {
            System.out.println("Driver not changed! " + driver.getName() + " is 21, but must be 25 or older to drive tank");
            return;
        }
        this.driver = d;
        System.out.println("Driver changed to " + driver.getName());
    }
}


