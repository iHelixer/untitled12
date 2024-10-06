//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver("Charles Leclerc", "Ferrari", 26, true);
        driver.setDriver(driver);
        driver.setChampion(true);
        driver.CheckIfChampion();


        Car car = new Car("SF-24", 749, "Soft");
        car.setCar(car);

        System.out.println("Driver: " + driver.getName() + ", Age: " + driver.getAge() + ", Team: " + driver.getTeam() + ", Champion: " + driver.isChampion());
        System.out.println("Car: " + car.getModel() + ", Weight: " + car.getWeight() + ", Tyres: " + car.getTyres());


        RaceCar raceCar = new RaceCar("SF-23", 730, "Hard", true);
        raceCar.start();
        raceCar.useDrs();

        System.out.println("Model: " + raceCar.getModel() + ", Weight: " + raceCar.getWeight() + ", Tyres: " + raceCar.getTyres());
    }
}