public class Student {

    private String first;
    private String last;
    private int grade;
    static int numnum = 1;
    private int stu_id;

    Student(){
        first="";
        last="";
        grade = 0;
        stu_id = numnum;
        numnum++;
    }
    
    Student(String first, String last, int grade){
        this.first = first;
        this.last = last;
        this.grade = grade;
        stu_id = numnum;
        numnum++;
    }
    
    Student(String first, String last, int grade, int stupid){
        this.first = first;
        this.last = last;
        this.grade = grade;
        this.stu_id = stupid;
    }
    
    public String toString(){
        return this.first = first;
    }
    
    public String getfirst(){
        return first;
    }
    
    public void setfirst(String first){
        this.first = first;
    }
    
    public String getlast(){
        return last;
    }
    
    public void setlast(String last){
        this.last = last;
    }
    
    public int getgrade(){
        return grade;
    }
    
    public void setfirst(int grade){
        this.grade = grade;
    }
    
    public int getstupid(){
        return stu_id;
    }
    
    public void setstupid(int stu_id){
        this.stu_id = stu_id;
    }
}
