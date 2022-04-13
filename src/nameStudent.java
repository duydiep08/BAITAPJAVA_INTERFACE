import java.util.ArrayList;

public class nameStudent implements IStudent {
    String FullName;
    int ID;
    String DateofBirth;
    String Native;
    String Class1;
    String PhoneNo;
    int Mobile;
   ArrayList<nameStudent> StudentList = new ArrayList<>();
    @Override
    public void Display() {
        System.out.println("FullName: " +this.FullName);
        System.out.println("ID: " +this.ID);
        System.out.println("Date of birth: " +this.DateofBirth);
        System.out.println("Native: " +this.Native);
        System.out.println("Class: " +this.Class1);
        System.out.println("PhoneNo: " +this.PhoneNo);
        System.out.println("Mobile: " +this.Mobile);

    }

    //search: chưa hoàn thành
    void searchStudent(String fullName){
        boolean searched = false;
        for (nameStudent student1 : StudentList){
            if(student1.StudentList.contains(fullName)){
                searched =true;
                System.out.println((student1.StudentList));
                break;
            }
        }
        if (!searched) System.out.println("Not found name" + fullName);
    }

}

