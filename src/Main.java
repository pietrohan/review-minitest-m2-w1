import staff.OfficialStaff;
import staff.Parttime;
import staff.Staff;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Staff Phong = new OfficialStaff(1,"Phong",23,222222,"Phong@gmail.com",5000000,1);
        Staff Huy = new OfficialStaff(2,"Huy",23,333333,"Huy@gmail.com",5000000,2);
        Staff Luong = new OfficialStaff(3,"Luong",24,444444,"Luong@gmail.com",5000000,3);
        Staff Banh = new Parttime(4,"Banh",24,555555,"Banh@gmail.com",12000,3);
        Staff Hang = new Parttime(5,"Hang",30,666666,"Hang@gmail.com",12000,2);
        Staff Han = new Parttime(6,"Han",27,777777,"Han@gmail.com",12000,1);
        Staff Hoang = new Parttime(7, "Hoang", 23, 88888888, "Hoang@gmail.com",12000, 3);
        Staff[] staff = {Phong, Huy, Luong, Banh, Hang, Han, Hoang};
        OfficialStaff phong = (OfficialStaff) Phong;
        OfficialStaff huy = (OfficialStaff) Huy;
        OfficialStaff luong = (OfficialStaff) Luong;
        Parttime banh = (Parttime) Banh;
        Parttime hang = (Parttime) Hang;
        Parttime han = (Parttime) Han;
        Parttime hoang = (Parttime) Hoang;
        OfficialStaff officialStaff[] = {phong, huy, luong};
        Parttime parttime[] = {banh, hang, han, hoang};

//        test ep kieu
//        System.out.println(p.payCut());
//        System.out.println(((Parttime) Banh).checkRank());
//        System.out.println(p.checkRank());

//          Luong fulltime test rank
//        System.out.println(phong.checkRank());
//        System.out.println(huy.checkRank());
//        System.out.println(luong.checkRank());

//          Luong Parttime test rank
//        System.out.println(hang.checkRank());
//        System.out.println(han.checkRank());
//        System.out.println(banh.checkRank());


//        Luong trung binh cua nhan vien
        int avgSalary = Staff.getAvgSalary(staff);
        System.out.println("Luong trung binh cua nhan vien ca cong ty la: " + avgSalary);

//        Luong cua nhan vien fulltime thap hon luong trung binh cua cong ty

        System.out.println(OfficialStaff.compareOfficialStaffSalarylessthanAvgSalary(officialStaff, avgSalary));

//        Luong phai tra cho nhan vien Partime
        int sumOfSalaryParttime = Staff.sumOfSalaryParttime(staff);
        System.out.println("Tong so luong phai tra cho nhan vien Part-time la: " + sumOfSalaryParttime);

//        Sap xep nhan vien Fulltime theo so luong tang dan
        Arrays.sort(staff);
        System.out.println("STT tang dan theo muc luong la: ");
        for (int i = 0; i < staff.length; i++) {
            System.out.println("Vi tri: " + (i+1) + " la: " + staff[i]);
        }
    }



}
