package Student;

import java.util.Scanner;

public class Results {
    public static void main(String args[]){

        Student_details sd[]= new Student_details[4];
         sd[0]=new Student_details("1","veera",60,50,65);
         sd[1]=new Student_details("2","soujanya",70,65,60);
         sd[2]=new Student_details("3","sony",75,80,46);
         sd[3]=new Student_details("4","rafi",73,75,80);

         sd[0].set_subjects("JAVA","web","python");
         sd[1].set_subjects("JAVA","web");
         sd[2].set_subjects("web","python");
         sd[3].set_subjects("JAVA","python");


        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter u r password");
        int valid=sc.nextInt();
        if(valid==1234){
            System.out.println("What u want to see subjects and marks  or total details for subjects please " +"\n"+
                    "Enter 'sub' total details please enter 'total'");
            Scanner sc1=new Scanner(System.in);
            String enter=sc1.nextLine();
            if(enter.equalsIgnoreCase("total")){
                System.out.println("Enter id to find details:");
                int id=sc1.nextInt();
                try{
                    System.out.println(sd[id-1].get_Details());
                }catch(Exception e){
                    System.err.println("Please enter correct student id");
                }

            }
            else if(enter.equalsIgnoreCase("sub")){
                System.out.println("Enter id to find subjects:");
                int id=sc1.nextInt();
                try{
                    System.out.println(sd[id-1].get_subjects());
                }catch(Exception e){
                    System.err.println("Please enter correct student id");
                }
            }
            else{
                System.out.println("please select correct input...");
            }
        }
        else{
            System.out.println("Wrong Password please enter correct password...");
        }

    }
}
