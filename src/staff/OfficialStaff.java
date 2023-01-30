package staff;

public class OfficialStaff extends Staff implements takehomePay{

    private int salary = 5000000;

    public OfficialStaff(long salary) {
    }

    public OfficialStaff(int id, String name, int age, int phone, String email, int salary, int rank) {
        super(id, name, age, phone, email, rank);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getBonus () {
        return salary+500000;
    }
    public int payCut () {
        return salary-300000;
    }

    public double checkRank () {
       switch (getRank()){
           case 1:
               return this.getBonus();
           case 2:
               return this.salary;
           case 3:
               return this.payCut();
           default:
               return 0;
       }
    }

    public static String compareOfficialStaffSalarylessthanAvgSalary(OfficialStaff[] officialStaffs, int AvgSalary) {
        String str = "";
        for (int i = 0; i < officialStaffs.length; i++) {
            if (officialStaffs[i].checkRank() < AvgSalary) {
                str += officialStaffs[i].getName() + " muc luong thap hon trung binh, ";
            }
            else {
                str += officialStaffs[i].getName() + " muc luong khong thap hon trung binh, ";
            }
        }return str;
    }

    @Override
    public void takeHomePay() {
        System.out.println(checkRank());
    }

    @Override
    public String toString() {
        return super.toString() +
                " OfficialStaff{" +
                "salary=" + checkRank() +
                '}';
    }
}
