public class Driver {
    private String name;
    private String team;
    private int age;
    private boolean champion;
    private Driver driver;


    public Driver(String name,String team, int age, boolean champion) {
        this.name = name;
        this.team = team;
        this.age = age;
        this.champion = champion;
    }


    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Driver getDriver() {
        return driver;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isChampion() {
        return champion;
    }

    public void setChampion(boolean champion) {
        this.champion = champion;
    }

    public void CheckIfChampion(){
        if(isChampion()){
            System.out.println("Він чемпіон");
        }else {
            System.out.println("Він не чемпіон");
        }
    }
}
