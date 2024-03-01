package day50_Week10_Review.scrumTeam;

public class Employee extends Person {

    public String jobTitle;
    private double salary;
    private int id;
    public String deparmentName;


    public Employee(String name, int age, char gender, String jobTitle, double salary, int id, String deparmentName) {
        super(name, age, gender);
        this.jobTitle = jobTitle;
        setSalary(salary);
        this.id = id;
        this.deparmentName = deparmentName;
    }




    public void setSalary(double salary) {
        if(salary<15000){
            System.out.println("Not enough salary");
        }else {
            this.salary=salary;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void work(){
        System.out.println(jobTitle+" "+name+" is working");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                ", deparmentName='" + deparmentName + '\'' +
                '}'+ super.toString();
    }
}
