package com.mycompany.makeaschool;

public class Teacher {
    private String firstname;
    private String lastname;
    private String subject;
    
    public Teacher(String firstname, String lastname, String subject){
        this.firstname = firstname;
        this.lastname = lastname;
        this.subject = subject;
    }
    
    public String getfirstname(){
        return firstname;
    }
    
    public void setfirstname(String firstname){
        this.firstname = firstname;
    }
    
    public String getlastname(){
        return lastname;
    }
    
    public void setlastname(String lastname){
        this.lastname = lastname;
    }
    
    public String getsubs(){
        return subject;
    }
    
    public void setsubs(String subject){
        this.subject = subject;
    }
}
