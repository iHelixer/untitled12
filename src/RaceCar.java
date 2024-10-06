public class RaceCar extends Car{
    private boolean drs;

    public RaceCar(String model, int weight, String tyres, boolean drs) {
        super(model, weight, tyres);
        this.drs = drs;
    }

    public void useDrs(){
        if(drs){
            System.out.println("DRS is activated");
        }else {
            System.out.println("DRS is not activated");
        }
    }


}
