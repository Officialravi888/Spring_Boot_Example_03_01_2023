package Org.Stap;

public class Emp {
    private int Id;
    private int No;
    private String Name;
    private String Gender;
    private int Bankno;
    private String Bankname;

    public Emp(int id, int no, String name, String gender, int bankno, String bankname) {
        Id = id;
        No = no;
        Name = name;
        Gender = gender;
        Bankno = bankno;
        Bankname = bankname;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getNo() {
        return No;
    }

    public void setNo(int no) {
        No = no;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public int getBankno() {
        return Bankno;
    }

    public void setBankno(int bankno) {
        Bankno = bankno;
    }

    public String getBankname() {
        return Bankname;
    }

    public void setBankname(String bankname) {
        Bankname = bankname;
    }

    public Emp() {
    }

    @Override
    public String toString() {
        return "Emp{" +
                "Id=" + Id +
                ", No=" + No +
                ", Name='" + Name + '\'' +
                ", Gender='" + Gender + '\'' +
                ", Bankno=" + Bankno +
                ", Bankname='" + Bankname + '\'' +
                '}';
    }
    public void displayInfo(){
        System.out.println("Hello: "+Name);
        System.out.println("Hello:"+Bankname);
        System.out.println("Hello:"+Bankno);
    }
}
