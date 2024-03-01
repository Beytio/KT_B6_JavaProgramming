package day50_Week10_Review.scrumTeam;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    public ProductManager PM;
    public BusinessAnalist BA;
    public ScrumMaster SM;
    public ArrayList<Tester> testers;
    public ArrayList<Developer> developers;


    public ScrumTeam(ProductManager PM, BusinessAnalist BA, ScrumMaster SM, ArrayList<Tester> testers, ArrayList<Developer> developers) {
        this.PM = PM;
        this.BA = BA;
        this.SM = SM;
        this.testers = testers;
        this.developers = developers;
    }


    public void addTester(Tester tester){
        testers.add(tester);
    }


    public void addTester(Tester [] testers){
        this.testers.addAll(Arrays.asList(testers));
    }

    public void addDeveloper(Developer developer){
        developers.add(developer);
    }


    @Override
    public String toString() {
        return "ScrumTeam{" +
                "PM=" + PM +
                ", BA=" + BA +
                ", SM=" + SM +
                ", testers=" + testers +
                ", developers=" + developers +
                '}';
    }
}
