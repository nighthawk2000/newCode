package bsu.comp152;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class DayCareFacility {
    private ArrayList<Child> student = new ArrayList<Child>();
    private ArrayList<DayCarWorker> employees = new ArrayList<DayCarWorker>();

public static void main(String [] arg){
    var Account = new BankAccount(initialDeposit, 0.04F);
    var success = Account.add();
    return success;


    }
    public void printMenu(){
        System.out.println("[1]Admit Child");
        System.out.println("[2]Hire Worker");
        System.out.println("[1]Student go to School");
        System.out.println("[1]RunFireDrill");
        System.out.println("[5]Exit");
        System.out.println("[6]End of year");
        System.out.println("[7]DoAccounting");


    }
    public void runDayCare() {
        Scanner reader = new Scanner(System.in);
        while(true){
            printMenu();
            var answer = reader.nextLine();
            if(answer.equals("1")){
                System.out.println("What is the child's name");
                var name = reader.nextLine();
                System.out.println("Do you have a sibling in the program?");
                var sibInProg = false;
                var answer1 = reader.nextLine();
                if(answer.toLowerCase().equals("y")){
                    sibInProg = true;
                System.out.println("What's the child's age?");
                var age = reader.nextInt();
                Child newChild = new Child(name,sibInProg,age);
                student.add(newChild);
                var rand = new Random();
                var randomIndex = rand.nextInt(employees.size());
                var empWorker = employees.get(randomIndex);
                student.add(newChild);

            }
            else if(answer.equals("2")) {
                    String Reader = reader.nextLine();
                    System.out.println("What is the employee's name?");
                    var workerName = reader.nextLine();
                    System.out.println("what is the employee's starting salary?");
                    var salary = reader.nextLine();
                    var workerSalary = reader.nextLine();
                    DayCarWorker CareWorker = new DayCarWorker();
                    CareWorker.runCareWorker();

                    employees.add(new DayCarWorker(Float.parseFloat(workerName), name));
                    DayCarWorker currentWok = new DayCarWorker(workerName, salary);
                    employees.add(currentWok);
                }
            else if(answer.equals("3")){
                    int i;
                    for (int student = 6; i < list.size(); i++){
                        if (list.get(i) > 5)
                            list.remove(DayCareFacility,DayCarWorker);
            }
            else if(answer.equals("4")){

            }
            else if(answer.equals("5")){
                System.exit(0);
            }
            else if(answer.equals("6")){

            }
            else if(answer.equals("7")){

            }


            }


        }
    }
}

