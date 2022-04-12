import java.util.ArrayList;
import java.util.Scanner;

public class Main_StudentMark {

        static void menu() {
            System.out.println("1.Insert new student: ");
            System.out.println("2.View list of student: ");
            System.out.println("3.Average mark: ");
            System.out.println("4.Exit: ");
        }

        static void inputStudentMark(StudentMark studentMark) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Insert name: ");
            studentMark.FullName = scanner.nextLine();

            System.out.print("Insert class: ");
            studentMark.Class1 = scanner.nextLine();

            System.out.print("Insert semester: ");
            studentMark.Semester = scanner.nextInt();

            for (int i = 0; i < studentMark.SubjectList.length; i++) {
                do {
                    System.out.format("Subject mark %d:", i + 1);
                    studentMark.SubjectList[i] = scanner.nextInt();
                } while (!(1 <= studentMark.SubjectList[i] && studentMark.SubjectList[i] <= 5));
            }
        }

        public static void main(String[] args) {
            int option;
            Scanner scanner = new Scanner(System.in);
            ArrayList<StudentMark> StudentMarkList = new ArrayList<>();
            menu();
            while (true) {
                while (true) {
                    try {
                        System.out.print("Please enter the selection: ");
                        option = scanner.nextInt();
                        break;
                    } catch (Exception ex) {
                        System.out.println("Selection must be an integer");
                    }
                }
                switch (option) {
                    case 1:
                        StudentMark studentMark = new StudentMark();
                        inputStudentMark(studentMark);
                        studentMark.ID = StudentMarkList.size() + 1;
                        StudentMarkList.add(studentMark);
                        System.out.println("Added student have ID " + studentMark.ID + " input list");
                        break;
                    case 2:
                        System.out.println("List student: ");
                        for (StudentMark studentMark1 : StudentMarkList) {
                            studentMark1.Display();
                        }
                        break;
                    case 3:
                        System.out.println("List after the average mark: ");
                        for (StudentMark studentMark1 : StudentMarkList) {
                            studentMark1.AveCal();
                            studentMark1.Display();
                        }
                        break;
                    case 4:
                        return;
                }
            }
        }
}
