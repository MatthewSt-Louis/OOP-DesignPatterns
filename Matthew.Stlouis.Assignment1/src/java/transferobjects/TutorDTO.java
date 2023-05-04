/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transferobjects;

/**
 * This is the data transfer object for tutors in the database. Will be used to add/remove/edit
 * tutors in the database.
 * @author Matthew
 */
public class TutorDTO {
    private Integer tutorID;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String status;
    private String courseCode;
    
    
    public Integer getTutorID(){
    	return this.tutorID;
    }
    public void setTutorID(Integer authorID){
    	this.tutorID = authorID;
    }
    
    public String getFirstName(){
    	return firstName;
    }
    public void setFirstName(String firstName){
    	this.firstName = firstName;
    }
    
    public String getLastName(){
    	return lastName;
    }
    public void setLastName(String lastName){
    	this.lastName = lastName;
    }
    
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String e){
        this.email = e;
    }
    
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public void setPhoneNumber(String p){
        this.phoneNumber = p;
    }
    
    public String getStatus(){
        return this.status;
    }
    public void setStatus(String s){
        this.status = s;
    }
    
    public String getCourseCode(){
        return this.courseCode;
    }
    public void setCourseCode(String c){
        this.courseCode = c;
    }
    
    
    
}
