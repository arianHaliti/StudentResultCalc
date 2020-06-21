/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package as;

/**
 *
 * @author arian
 */
public class Result {
    /* Perqindja e pikeve ne Detyrave */
    private int assingments;
    // Perqindja e pikeve ne projekt grupor
    private int group_project;
    // Perqindja e pikeve ne mid term 1 
    private int mid_term1;
    // Perqindja e pikeve ne mid term 1 
    private int mid_term2;
    // Perqindja e pikeve ne test Final
    private int final_test;
    // Perqindja e pikeve ne vijushmeri
    private int attendance;
    // A e ka pranu Mid term testin nese PO : true JO : false
    private boolean acceptMids;
    private Profesori prof;

    public int getAssingments() {
        return assingments;
    }

    public int getGroup_project() {
        return group_project;
    }

    public int getMid_term1() {
        return mid_term1;
    }

    public int getMid_term2() {
        return mid_term2;
    }

    public int getFinal_test() {
        return final_test;
    }

    public int getAttendance() {
        return attendance;
    }
    
    public Result(int assingments, int group_project, int mid_term,int mid_term2, int final_test, int attendance ,boolean am,Profesori p) {
        this.assingments = assingments;
        this.group_project = group_project;
        this.mid_term1 = mid_term;
        this.mid_term2 = mid_term2;
        this.final_test = final_test;
        this.attendance = attendance;
        this.acceptMids = am;
        this.prof = p;
    }
    public boolean passedMidTerms(){
        return (this.mid_term1 + this.mid_term2 >= 100);
    }
    public boolean passedFinalTest(){
        return (this.final_test >= 50);
    }
    public boolean passedGroupProject(){
        if(this.prof.getGroup_project()==0)
            return true;
        return this.group_project >=50;
    }
    public double getExamPoints(){
        if(this.acceptMids){
            return (this.mid_term1* (this.prof.getMid_term()/2)/100.0)+(this.mid_term2 * (this.prof.getMid_term()/2)/100.0);
        }
        return  (this.final_test * this.prof.getFinal_test()/100.0);
    }
    public String getTotalPoints(){
        
        if(passedGroupProject()){
            if(passedMidTerms() && this.acceptMids){
                return ""+getScore(0);
            }else if (!this.acceptMids && passedFinalTest()){
                return ""+getScore(1);
            }
            else if (!this.acceptMids && !passedFinalTest()){
                return "Exam Fail !";
            }
            else if (!passedMidTerms() && this.acceptMids){
                return "Mid Term Fail !";
            }
                
        }
        return "No Project !";
    }
    public String getGrade()
    {
        return calculateGrade();
    }
    private double getScore(int t ){
        double attedance = this.attendance * this.prof.getAttendance() / 100.0;
        double assignment = this.assingments * this.prof.getAssingments() /100.0;
        double group_p = this.group_project * this.prof.getGroup_project()/100.0;
        double  sum = attedance+assignment+group_p;
        if (t ==0) {
            double mid1 = this.mid_term1 * (this.prof.getMid_term()/2)/100.0;
            double mid2 = this.mid_term2 * (this.prof.getMid_term()/2)/100.0;
            
            return (sum+mid1+mid2);
        }
        else{
            double finals = this.final_test * this.prof.getFinal_test()/100.0;
            
            return (sum+finals);
        }
        
    }   
    private String calculateGrade(){
        if(!passedGroupProject()){
            return "F";
        }
        if(this.acceptMids){
            if(!passedMidTerms())
                return "F";
        }
        else 
            if(!passedFinalTest())
                return "F";
        
        double points = getScore((this.acceptMids ? 0 :1));
        if(points <50){
            return "F";
        }
        else if(points >=50 && points<60){
            return "E";
        }
        else if(points >=60 && points<70){
            return "D";
        }
        else if(points >70 && points <80){
            return "C";
        }
        else if(points > 80 && points <90){
            return "B";
        }
        else
            return "A";
    }
}
