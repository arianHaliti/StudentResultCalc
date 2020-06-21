/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package as;

/**
 *
 * @author arian
 *
 * 
 *
 *
 * 
Assingments 15%
Group project 35%
Mid-Term Test 40(20-20)%
Final Test 40%
Attendance 10%
*/
public class Profesori {
    private int assingments;
    private int group_project;
    private int mid_term;
    private int final_test;
    private int attendance;
    private String name;
    private String surname;
    private String degree;

 

    public Profesori(int assingments, int group_project, int mid_term, int final_test, int attendance, String name, String surname, String degree) {
        this.assingments = assingments;
        this.group_project = group_project;
        this.mid_term = mid_term;
        this.final_test = final_test;
        this.attendance = attendance;
        this.name = name;
        this.surname = surname;
        this.degree = degree;
    }
    
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDegree() {
        return degree;
    }

   
    public int getAssingments() {
        return assingments;
    }

    public int getGroup_project() {
        return group_project;
    }

    public int getMid_term() {
        return mid_term;
    }

    public int getFinal_test() {
        return final_test;
    }

    public int getAttendance() {
        return attendance;
    }
    
    
}
