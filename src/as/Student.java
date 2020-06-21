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
public class Student{
    private String name;
    private String surname;
    private String ID;
    private String address;
    private Result results;
    private int age;

    public Student(String name, String surname, String ID, String address, int age, Result res) {
        this.name = name;
        this.surname = surname;
        this.ID = ID;
        this.address = address;
        this.age = age;
        this.results = res;
    }

    public Result getResults() {
        return results;
    }
    
  
    public String getFullName(){
        return getName()+ " "+getSurname();
    }
    public String getFormalName (){
        return getFullName() + " " +getID();
    }
    public int getAge(){
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getID() {
        return ID;
    }

    public String getAddress() {
        return address;
    }
    
    
}
