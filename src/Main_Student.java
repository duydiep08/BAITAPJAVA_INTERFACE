import java.util.ArrayList;
import java.util.Scanner;

public class Main_Student {

    static void menu() {
        System.out.println("1.Insert new student: ");
        System.out.println("2.View list of student: ");
        System.out.println("3.Search: ");
        System.out.println("4.Exit: ");
    }

    static void searchStudent(nameStudent nameStudent){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Search name: ");
        nameStudent.FullName = scanner.nextLine();

    }

    static void inputStudent(nameStudent nameStudent) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert name: ");
        nameStudent.FullName = scanner.nextLine();

        System.out.print("Insert date of birth: ");
        nameStudent.DateofBirth = scanner.nextLine();

        System.out.print("Insert native: ");
        nameStudent.Native = scanner.nextLine();

        System.out.print("Insert class: ");
        nameStudent.Class1 = scanner.nextLine();

        System.out.print("Insert Phone: ");
        nameStudent.PhoneNo = scanner.nextLine();

        System.out.print("Insert Mobile: ");
        nameStudent.Mobile = scanner.nextInt();
    }

    public static void main(String[] args) {
        int option;
        Scanner scanner = new Scanner(System.in);
        ArrayList<nameStudent> StudentList = new ArrayList<>();
        menu();
        while (true) {
            while (true) {
                try {
                    System.out.print("Please enter the selection: ");
                    option = scanner.nextInt();
                    break;
                } catch (Exception ex) {
                    System.out.println("Selection must be an integer");
                    return;
                }
            }
            switch (option) {
                case 1:
                    nameStudent student = new nameStudent();
                    inputStudent(student);
                    student.ID = StudentList.size() + 1;
                    StudentList.add(student);
                    System.out.println("Added student have ID " + student.ID + " input list");
                    break;
                case 2:
                    System.out.println("List student: ");
                    for (nameStudent student1 : StudentList) {
                        student1.Display();
                    }
                    break;
                case 3: //search: chưa hoàn thành
                   /* System.out.println("Search !!!!!!! ");
                    for (nameStudent student1 : StudentList) {
                        student1.searchStudent("2");
                        student1.Display();
                    }
                    break;*/

                case 4:
                    menu();
            }
        }
    }
}
