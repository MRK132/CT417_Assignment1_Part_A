/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_Reg_System_Assignment_1;

import java.util.ArrayList;
import org.joda.time.DateTime;

/**
 *
 * @author Mark
 */
public class Student {
    
    private String name;
    private int age;    
    private DateTime DOB;
    private String ID;
    private ArrayList<Module> regModules = new ArrayList();
    private ArrayList<Course_Programme> course = new ArrayList();
    
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public DateTime getDOB() {
        return DOB;
    }

    public void setDOB(DateTime DOB) {
        this.DOB = DOB;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }


    public ArrayList<Course_Programme> getCourse() {
        return course;
    }

    public void setCourse(ArrayList<Course_Programme> courses) {
        this.course = course;
    }

    public ArrayList<Module> getModules() {
        return regModules;
    }

    public void setModules(ArrayList<Module> regModules) {
        this.regModules = regModules;
    }
    
    public String getUsername() {
            String studentName = this.name.replace(" ","_");
            String username = studentName + "_" + Integer.toString(this.age);
            return username;
    }

}

