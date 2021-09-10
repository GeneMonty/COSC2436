package Week02.WeekAssigment;

public class Payroll {
    
private String name;
private String idNumber;
private int hours;
private double rate;

// Constructors
// No argument constructor 
public Payroll()
{
    name = "";
    idNumber= "";
    hours=0;
    rate=0.0;
}

public Payroll(String n, String id,int h,double r){
    name = n;
    idNumber= id;
    hours = h;
    rate = r;
}
// Setters
public void setName(String n){
    name = n;
}
public void setIdNumber(String id){
    idNumber = id;
}
public void setHours(int h){
    hours = h;
}
public void setRate(double r){
    rate = r;
}

// Getters

public String getName(){return name;}
public String getIdNumber(){return idNumber;}
public int getHours(){return hours;}
public double getRate(){return rate;}


}
