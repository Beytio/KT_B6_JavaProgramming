package day50_Week10_Review.scrumTeam;

public class Tester extends Employee implements DevTeam {

    public String programmingLanguage;

    public Tester(String name, int age, char gender, double salary, int id, String deparmentName, String programmingLanguage) {
        super(name, age, gender, "Tester", salary, id, deparmentName);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void coding() {
        System.out.println(jobTitle+" "+name+" is writing automation with  "+programmingLanguage);
    }

    public void createTicket(){
        System.out.println(jobTitle+" "+name+" is finding bugs");
    }
}
