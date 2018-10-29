/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.junit.Assert.*;
import student_Reg_System_Assignment_1.Student;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 *
 * @author Mark
 */
public class reg_Test {
    
    
    public reg_Test() {
    
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void getUserName() {
        Student s = new Student("Mark Garvey",21);
        String expected_UserName = "Mark_Garvey_21";
        assertEquals(expected_UserName, s.getUsername());
        System.out.print("Username: " + s.getUsername());
    }
    
}
