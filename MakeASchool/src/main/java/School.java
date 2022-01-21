import com.mycompany.makeaschool.Teacher;

import java.util.ArrayList;

public class School {
    ArrayList<Teacher> teachers = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    
    public School(){
        ArrayList<Teacher> teachers = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
    }
    
    public void addteacher(String firstname, String lastname, String subject){
        boolean e = true;
        
        for(int k = 0;k < teachers.size();k++){
            if(teachers.get(k).getfirstname().equals(firstname) && teachers.get(k).getlastname().equals(lastname)){
                e = false; // if teacher is already in database
            }
        }
        
        if(e){
        teachers.add(new Teacher(firstname, lastname, subject));
        }

    }
    
    public void addstudent(String first, String last, int grade){
        boolean f = true;
        
        for(int k = 0;k < students.size();k++){
            if(students.get(k).getfirst().equals(first) && students.get(k).getlast().equals(last) && students.get(k).getgrade() == grade){
                f = false; // if student is already in database
            }
        }
        
        if(f){
        students.add(new Student(first, last, grade));
        }

    }
    
    public void deleteteacher(String firstname, String lastname){
        int g = -1;
        
        for(int k = 0;k < teachers.size();k++){
            if(teachers.get(k).getfirstname().equals(firstname) && teachers.get(k).getlastname().equals(lastname)){
                g = k; // tests for where said teacher is
            }
        }
        
        if(g < 0){
            // Teacher does not exist
        } else {
            ArrayList<Teacher> teachersdupe = new ArrayList<>();
            
            for(int y = 0; y < g; y++){
                teachersdupe.add(new Teacher(teachers.get(y).getfirstname(), teachers.get(y).getlastname(), teachers.get(y).getsubs()));
            }
            
            for(int y = g+1; y < teachers.size(); y++){
                teachersdupe.add(new Teacher(teachers.get(y).getfirstname(), teachers.get(y).getlastname(), teachers.get(y).getsubs()));
            }
            teachers = teachersdupe;
        }

    }
    
    public void deletestudent(String first, String last, int grade){
        int h = -1;
        
        for(int k = 0;k < students.size();k++){
            if(students.get(k).getfirst().equals(first) && students.get(k).getlast().equals(last) && grade == students.get(k).getgrade()){
                h = k;
            }
        }
        
        if(h < 0){
            // student does not exist
        } else {
            ArrayList<Student> studentsdupe = new ArrayList<>();
            
            for(int z = 0; z < h; z++){
                studentsdupe.add(new Student(students.get(z).getfirst(), students.get(z).getlast(), students.get(z).getgrade(), students.get(z).getstupid()));
            }
            
            for(int z = h+1; z < students.size(); z++){
                studentsdupe.add(new Student(students.get(z).getfirst(), students.get(z).getlast(), students.get(z).getgrade(), students.get(z).getstupid()));
            }
            students = studentsdupe;
        }

    }
    
    public void deletestudentByStupid(int id){
        int h = -1;
        
        for(int k = 0;k < students.size();k++){
            if(students.get(k).getstupid() == id){
                h = k;
            }
        }
        
        if(h < 0){
            // student does not exist
        } else {
            ArrayList<Student> studentsdupe = new ArrayList<>();
            
            for(int z = 0; z < h; z++){
                studentsdupe.add(new Student(students.get(z).getfirst(), students.get(z).getlast(), students.get(z).getgrade(), students.get(z).getstupid()));
            }
            
            for(int z = h+1; z < students.size(); z++){
                studentsdupe.add(new Student(students.get(z).getfirst(), students.get(z).getlast(), students.get(z).getgrade(), students.get(z).getstupid()));
            }
            students = studentsdupe;
        }

    }
    
    public void displayTeachers(){
        System.out.println("Teachers:");
        for(int k = 0;k < teachers.size();k++){
            System.out.println("Name: "+teachers.get(k).getfirstname()+" "+teachers.get(k).getlastname()
            +"; Subject: "+teachers.get(k).getsubs()
            );
        }
    }
    
    public void displayStudents(){
        System.out.println("Students:");
        for(int k = 0;k < students.size();k++){
            System.out.println("Name: "+students.get(k).getfirst()+" "+students.get(k).getlast()+"; Grade: "
                    +students.get(k).getgrade()+"; Student ID: "+students.get(k).getstupid());
        }
    }
}
