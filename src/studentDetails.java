import model.student;

public class studentDetails {

    public static void main(String[] args) {
        student stud = new student();

        //display default values
        System.out.println("-------------------------------------");
        System.out.println("Student Name: "+stud.getName());
        System.out.println("Student Age: "+stud.getAge());
        System.out.println("Student Gender: "+stud.getGender());
        System.out.println("Student ID: "+stud.getID());
        System.out.println("-------------------------------------");

        //set new values
        stud.setName("Rex Lapis");
        stud.setAge(5000);
        stud.setGender("Male");
        stud.setID("2021-00001");

        //display new values
        System.out.println("-------------------------------------");
        System.out.println("Student Name: "+stud.getName());
        System.out.println("Student Age: "+stud.getAge());
        System.out.println("Student Gender: "+stud.getGender());
        System.out.println("Student ID: "+stud.getID());
        System.out.println("-------------------------------------");

    }

}
