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
public class Course_Programme {
    private String courseName;
    private ArrayList<Module> moduleList = new ArrayList();
    private ArrayList<Student> enrolledStudents = new ArrayList();
    private DateTime startDate;
    private DateTime endDate;
    
    public Course_Programme(String courseName){
        this.courseName = courseName;
    }
    
    public String getCourseName(){
        return this.courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
    public ArrayList<Module> getModuleList(){
        return this.moduleList;
    }

    public void setModuleList(ArrayList<Module> moduleList) {
        this.moduleList = moduleList;
    }
    
    public ArrayList<Student> getEnrolledStudents(){
        return this.enrolledStudents;
    }

    public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }
    
}
