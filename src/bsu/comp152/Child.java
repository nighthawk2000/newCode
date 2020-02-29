package bsu.comp152;


public class Child {
    private int age;
    private boolean siblingInProgram;
    private int yearsofAttendance;
    private String name;
    private int daycareId;
    private static int nextId = 1000;

public String thename(){return name;}


public double calculateBill(){
    double rate = 0;
if(0<=age && age ==1){
  rate=400;
}

if(1<=age && age==2){
rate=300;
}
else if(3<= age && age==4){
    rate = 200;
}
else if(age>4){
    rate =150;
}
if(siblingInProgram == true);
rate -= rate*.1;
rate -=yearsofAttendance*10;
    return rate;

}
public Child(String name, boolean siblingPlan, int currentAge){
    this.name = name;
    this.siblingInProgram = siblingPlan;
    yearsofAttendance=0;
    this.daycareId = nextId;
    nextId = nextId+1;

}
public String getName(){
    return name;
}
public int getID(){
    return daycareId;
}

    }
