package staff;

public abstract class Staff implements Comparable<Staff>{

    private int id = 0;
    private String name = "Han";
    private int age = 23;
    private int phone = 000000;
    private String email = "han@gmail.com";

    private int rank = 1;

    public Staff() {
    }

    public Staff(int id, String name, int age, int phone, String email, int rank) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.rank = rank;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    abstract int getSalary();
    abstract double checkRank();
    public static int getAvgSalary(Staff[] staff) {
        int sum = 0;
        for (int i = 0; i < staff.length; i++) {
            sum += staff[i].checkRank();
        }
        return sum/staff.length;
    }

    public static int sumOfSalaryParttime (Staff[] staff) {
        int sum = 0;
        for (int i = 0; i < staff.length; i++) {
            if (staff[i] instanceof Parttime) {
                Parttime parttime = (Parttime) staff[i];
                sum += parttime.checkRank();
            }
        }return sum;
    }
@Override
    public int compareTo(Staff o) {
        if (this.checkRank() < o.checkRank())
            return -1;
        else if (this.checkRank() > o.checkRank())
            return 1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Staff{ is: " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }
}
