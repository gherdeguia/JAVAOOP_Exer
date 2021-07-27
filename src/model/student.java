package model;

public class student {

    private String studName;
    private int studAge;
    private String studGender;
    private String IDNo;


    public student(){
        this.studName = null;
        this.studAge = 0;
        this.studGender = null;
        this.IDNo = null;
    }

    public student(String name, int age, String gender, String IDNo){
        this.studName = name;
        this.studAge = age;
        this.studGender = gender;
        this.IDNo = IDNo;
    }

    //Get Methods
    public String getName(){
        if(this.studName == null){
            return null;
        }else {
            return this.studName;
        }
    }

    public int getAge(){
        if(this.studAge < 1){
            return 0;
        }else {
            return this.studAge;
        }
    }

    public String getGender(){
        if(this.studGender == null){
            return null;
        }else {
            return this.studGender;
        }
    }

    public String getID(){
        if(this.IDNo == null){
            return null;
        }else {
            return this.IDNo;
        }
    }

    //Set Methods
    public void setName(String newName){
        this.studName = newName;
    }

    public void setAge(int newAge){
        this.studAge = newAge;
    }

    public void setGender(String newGender){
        this.studGender = newGender;
    }

    public void setID(String newID){
        this.IDNo = newID;
    }

}
