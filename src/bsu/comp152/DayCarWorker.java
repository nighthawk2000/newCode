package bsu.comp152;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;


public class DayCarWorker {
    public String name;
    public float salary;
    public ArrayList<Child> childrenInGroup;

    public DayCarWorker(float startingPay, String name) {
        this.name = name;
        this.salary = startingPay;
        childrenInGroup = new ArrayList<Child>();
    }

    public DayCarWorker() {

    }

    public DayCarWorker(String workerName, String salary) {
    }

    public void performanceReview() {
        Random rand = new Random();
        var x = rand.ints(1, 5);
        if (x.equals(1))
            ;
        else if (x.equals(2))
            salary = (float) (salary * 1.01);

        else if (x.equals(3))
            salary = (float) (salary * 1.025);

        else if (x.equals(4))
            salary = (float) (salary * 1.035);

        else if (x.equals(5))
            salary = (float) (salary * 1.05);


    }

    public void performFireDrill(){
        for(Child c : childrenInGroup)
            System.out.println(c.getName()+"is safe");
        System.out.println("All children are safe.");

    }


    public boolean addChild(Child newKid){
        childrenInGroup.add(newKid);
        return true;

    }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }

    public Optional <Child> removeChild(int daycareID){
        for(Child c : childrenInGroup){
            if(c.getID() == daycareID)
                return Optional.of(c);
        }
        return Optional.empty();
    }

    public void runCareWorker() {
    }
}




