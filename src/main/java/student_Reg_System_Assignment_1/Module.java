/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_Reg_System_Assignment_1;

import java.util.ArrayList;

/**
 *
 * @author Mark
 */
public class Module {
    private String moduleName;
    private String modID;
    private ArrayList<Student> Students = new ArrayList();
    private ArrayList<Course_Programme> Courses = new ArrayList();
    
    public Module (String moduleName, String modID){
        this.moduleName = moduleName;
        this.modID = modID;
    }
    
    public String getModuleName(){
        return this.moduleName;
    }
    
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }
    
    public String getModID(){
        return this.modID;
    }

    public void setModID(String modID) {
        this.modID = modID;
    }
    
    public ArrayList<Student> getStudents(){
    
        return this.Students;
    }
    
    public void setStudents(ArrayList<Student> Students) {
        this.Students = Students;
    }

    public ArrayList<Course_Programme> getCourses(){
        return this.Courses;
    }
    
    public void setCourses(ArrayList<Course_Programme> Courses) {
        this.Courses = Courses;
    }
    
}


