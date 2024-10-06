public class Car {
    private String model;
    private int weight;
    private String tyres;
    private Car car;


    public Car(String model, int weight, String tyres) {
        this.model = model;
        this.weight = weight;
        this.tyres = tyres;
    }

    public void start(){
        System.out.println("The car is starting");
    }


    public void setCar(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }



    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getTyres() {
        return tyres;
    }

    public void setTyres(String tyres) {
        this.tyres = tyres;
    }
}
