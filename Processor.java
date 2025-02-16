
package assigment11;
import java.util.Date;

public class Processor {
    public static void main(String[] args) {
        StudenLit studentList = new StudenLit();

        Studen student1 = new Studen("02", "Ngoc", new Date(2006, 3, 2, "Computer Science", 4.0f);
        Studen student2 = new Studen("01", "Kieu", new Date(2006, 3, 3), "Mathematics", 4.0f);

        studentList.addStudent(student1);
        studentList.addStudent(student2);

        studentList.AllStudents();

        Studen foundStudent = studentList.findStudentById("01");
        if (foundStudent != null) {
            foundStudent.display();
        } else {
            System.out.println("Student not found.");
        }
        boolean editSuccess = studentList.editStudentById("01", "Kieu", new Date(2006, 3, 2, "Computer Science", 4.0f);
        if (editSuccess) {
            System.out.println("Student information updated.");
        } else {
            System.out.println("Failed to update student information.");
        }

        boolean deleteSuccess = studentList.deleteStudentById("02");
        if (deleteSuccess) {
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Failed to delete student.");
        }

        studentList.AllStudents();
    }
}
