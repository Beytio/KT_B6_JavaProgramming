package day50_Week10_Review.scrumTeam;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.Arrays;

public class IBM {
    public static void main(String[] args) {
        String departmentName="IBM-IT";

        ProductManager pm=new ProductManager("Nisa", 30, 'F',70000,100002,departmentName);
        BusinessAnalist ba=new BusinessAnalist("Tuğba",30, 'F',70000,100003,departmentName);
        ScrumMaster sm=new ScrumMaster("Hatice",30,'F',65000, 100004,departmentName);

        Tester tester1=new Tester("Ahmet",34,'M',50000,100005,departmentName,"Java");
        Tester tester2=new Tester("Mehmet",35,'M',40000,100006,departmentName,"C++");
        Tester tester3=new Tester("Mustafa",33,'M',45000,100007,departmentName,"JavaScript");
        Tester tester4=new Tester("Elif",23,'F',45000,100014,departmentName,"Phyton");

        ArrayList<Tester> testers=new ArrayList<>(Arrays.asList(tester1,tester2,tester3));

        Developer developer1=new Developer("Ayşe",34,'F',80000,100008,departmentName,"Phyton");
        Developer developer2=new Developer("Fatma",36,'F',40000,100009,departmentName,"Phyton");
        Developer developer3=new Developer("Ali",44,'F',50000,100010,departmentName,"Phyton");
        Developer developer4=new Developer("Mahmut",25,'F',30000,100011,departmentName,"Phyton");
        Developer developer5=new Developer("Melek",28,'F',40000,100012,departmentName,"Phyton");
        Developer developer6=new Developer("Yıldız",35,'F',50000,100015,departmentName,"Phyton");


        ArrayList<Developer> developers=new ArrayList<>(Arrays.asList(developer1,developer2,developer3,developer4,developer5));

        ScrumTeam scrumTeam=new ScrumTeam(pm,ba,sm,testers,developers);


        System.out.println(scrumTeam);

        scrumTeam.addTester(tester4);
        scrumTeam.addDeveloper(developer6);

        System.out.println(scrumTeam);

        System.out.println("---------------------------");

        for (Developer developer : scrumTeam.developers) {
            System.out.println(developer.name);
        }


        System.out.println(scrumTeam.PM.name);

        for (Tester tester : scrumTeam.testers) {
            tester.coding();
        }

    }
}
