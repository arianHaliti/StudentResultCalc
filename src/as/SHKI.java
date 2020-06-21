/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package as;

import java.util.ArrayList;
import as.Student;
import as.Profesori;
/**
 *
 * @author arian
 */
public class SHKI {
    private final ArrayList<Student> StudList = new ArrayList<>();
    private String name;

    public SHKI( String name) {
        
        this.name = name;
    }

    public ArrayList<Student> getStudList() {
        return StudList;
    }

    public String getName() {
        return name;
    }
    
    
    
    public void fill(Profesori p){
        
        Student s1 = new  Student("Arian", "Haliti", "151636", "Prishtin", 24,new Result(90, 80, 70,80 , 0, 70, true,p ));
        Student s2 = new  Student("Filan", "Fisteku", "151637", "Germi", 22,new Result(10, 20, 15,15 , 0, 7, true,p ));
        Student s3 = new  Student("Rima", "Giba", "151638", "Dardani", 21,new Result(10, 80, 0,15 , 0, 7, true,p ));
        Student s4 = new  Student("Studenti3", "Studenti4", "151639", "Prizren", 24,new Result(90, 80, 70,80 , 0, 70, true,p ));
        Student s5 = new  Student("Joe", "Goe", "151611", "US", 24,new Result(70, 78, 70,80 , 23, 80, false,p ));
        Student s6 = new  Student("Man", "Lamp", "151690", "Gibberish", 23,new Result(90, 90, 70,80 , 90, 100, false,p ));
        Student s7 = new  Student("Lim", "Sim", "151676", "Sofali", 21,new Result(90, 0, 70,80 , 60, 70, true,p ));
        this.StudList.add(s1);this.StudList.add(s2);this.StudList.add(s3);
        this.StudList.add(s4);this.StudList.add(s5);this.StudList.add(s6);
        this.StudList.add(s7);
//        System.out.println(s1.getResults().getTotalPoints());
//        System.out.println(s2.getResults().getTotalPoints());
//        System.out.println(s3.getResults().getTotalPoints());
    }
}
