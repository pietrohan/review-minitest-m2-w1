package staff;

public class Parttime extends Staff implements takehomePay{

    private int hourly = 10000;

    public Parttime() {
    }

    public Parttime(int id, String name, int age, int phone, String email, int hourly, int rank) {
        super(id, name, age, phone, email, rank);
        this.hourly = hourly;
    }

    public int getHourly() {
        return hourly;
    }

    public void setHourly(int hourly) {
        this.hourly = hourly;
    }

    public int getSalary() {
        return (this.hourly*5)*30;
    }

    public int getBonus() {
        return getSalary()+100000;
    }
    public int payCut() {
        return getSalary()-50000;
    }

    public double checkRank () {
        switch (getRank()){
            case 1:
                return this.getBonus();
            case 2:
                return this.getSalary();
            case 3:
                return this.payCut();
            default:
                return 0;
        }
    }

    @Override
    public void takeHomePay() {
        System.out.println(checkRank());
    }

    @Override
    public String toString() {
        return super.toString() +
                " Parttime{" +
                "Salary: " +
               checkRank() +
                '}';
    }
}
