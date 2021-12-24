package Student;


import java.util.Scanner;

public class Student_details {

    private String id;
    private String name;
    private int total_marks=100;
    private int sub1_marks;
    private int sub2_marks;
    private int sub3_marks;
    private String sub1;
    private String sub2;
    private String sub3;

    Student_details(String id,String name,int marks,int marks1,int marks2){
        this.id=id;
        this.name=name;
        sub1_marks=marks;
        sub2_marks=marks1;
        sub3_marks=marks2;
    }

    public String get_Details(){

        if(sub1 !=null && sub2 !=null && sub3 !=null){
            int total=sub1_marks+sub2_marks+sub3_marks;
            return "Student Id: "+id+" Student Name: "+name+"\n"+"subject 1: "+sub1+" Marks"+sub1_marks+"\n"+
                    "subject 2: "+sub2+" Marks"+sub2_marks+"\n"+"subject 3: "+sub3+" Marks"+sub3_marks+"\n"+"Total Marks: "+total;
        }
        else if(sub1 !=null && sub2 !=null){
            int total1=sub1_marks+sub2_marks;
            return "Student Id: "+id+" Student Name: "+name+"\n"+"subject 1: "+sub1+" Marks"+sub1_marks+"\n"+
                    "subject 2: "+sub2+" Marks"+sub2_marks+"\n"+"Total Marks: "+total1;
        }
        return "Please select 3 or 2 subjects";
    }

    public void set_subjects(String ...sub){
       if(sub.length==3){
           sub1=sub[0];
           sub2=sub[1];
           sub3=sub[2];
       }
       else if(sub.length==2)
       {
           sub1=sub[0];
           sub2=sub[1];
       }
       else{
           System.out.println("please select 3 or 2 subjects...");
       }
    }

    public String get_subjects() {
        if (sub1 != null && sub2 != null && sub3 != null) {
            return "Student id: " + id + " student Name: " + name + "\n" + "Subject 1: " + sub1 + "\n" + "Subject 2: " + sub2 + "\n"
                    + "Subject 3: " + sub3;
        } else if (sub1 != null && sub2 != null) {
            return "Student id: " + id + " student Name: " + name + "\n" + "Subject 1: " + sub1 + "\n" + "Subject 2: " + sub2;

        }
        return "Please select atleast 2 or 3 subjects...";
    }
}
