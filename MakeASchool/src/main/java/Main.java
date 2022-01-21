import com.mycompany.makeaschool.Teacher;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*Student dumdum = new Student();
        System.out.println(dumdum.getstupid());
        Student smort = new Student();
        System.out.println(smort.getfirst());
        System.out.println(smort.getlast());
        System.out.println(smort.getgrade());
        System.out.println(smort.getstupid());
        Student dumsmort = new Student("dum","smort",29);
        System.out.println(dumsmort.getfirst());
        System.out.println(dumsmort.getlast());
        System.out.println(dumsmort.getgrade());
        System.out.println(dumsmort.getstupid());
        
        //School cheese = School.addteacher("poo", "pee", "pa");
        
        return School.teachers.size();
        
        for(int k = 0;k < School.teachers.size();k++){
            System.out.println(School.teachers[k]);
        }*/
    
    School Pokemon = new School();    
        
    Pokemon.addstudent("Ivy", "Ven", 1);
    Pokemon.addstudent("Quil", "Ty", 2);
    Pokemon.addstudent("Marshall", "Swamp", 3);
    Pokemon.addstudent("Mon", "Infer", 4);
    Pokemon.addstudent("Ser", "Ser", 5);
    Pokemon.addstudent("Dew", "Sam", 5);
    Pokemon.addstudent("Gad", "Gren", 6);
    Pokemon.addstudent("Braix", "Delph", 6);
    Pokemon.addstudent("Dart", "Dekidewy", 7);
    Pokemon.addstudent("Driz", "Intel", 8);
    
    Pokemon.addteacher("Samuel", "Oak", "Poetry");
    Pokemon.addteacher("Samson", "Oak", "Pokemon Name Puns");
    Pokemon.addteacher("Sonia", "Magnolia", "Galarian History");
    
    Pokemon.displayTeachers();
    Pokemon.displayStudents();
    
    System.out.println("-----------------------------");
    
    Pokemon.deleteteacher("Samson", "Oak");
    Pokemon.deletestudentByStupid(3);
    Pokemon.deletestudentByStupid(5);
    
    Pokemon.displayTeachers();
    Pokemon.displayStudents();
    
    }
}
