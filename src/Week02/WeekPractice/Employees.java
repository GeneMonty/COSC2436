package Week02.WeekPractice;

public class Employees {
    
    private String name;
    private int idNumber;
    private String department;
    private String position;

    // Constructors
    // Constructur with no argument

    public Employees()
    {
        name = "";
        idNumber = 0;
        department = "";
        position = "";
    }

    public Employees(String n, int id)
    {
        name = n;
        idNumber = id;
    }
    // Constructor with 4 argumetns
    public Employees(String n,int id,String dept,String pos){
        name = n;
        idNumber = id;
        department = dept;
        position = pos;
    }

    /*Setters or mutators/ accesors*/
    public void setName(String n) {
        name = n;
    }
    public void setIdNumber(int id) {
        idNumber = id;
    }
    public void setDeparment(String dept){
        department = dept;
    }
    public void setPosition(String pos){
        position = pos;
    }

    /*Getters get the information requested*/
    public String getName(){return name;}
    public int getIdNumber(){return idNumber;}
    public String getDepartment() { return department;}
    public String getPosition() {return position;}


}
