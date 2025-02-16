
package assigment11;
import java.util.ArrayList;
import java.util.Date;

public class StudenLit {

    private ArrayList<Studen> studentList;

    public StudenLit() {
        studentList = new ArrayList<>();
    }

    public void AllStudents() {
        for (Studen student : studentList) {
            student.display();
            System.out.println("--------------------");
        }
    }

    public Studen findStudentById(String idToFind) {
        for (Studen student : studentList) {
            if (student.getStudentId().equals(idToFind)) {
                return student;
            }
        }
        return null; 
    }

    public boolean deleteStudentById(String idToDelete) {
        for (Studen student : studentList) {
            if (student.getStudentId().equals(idToDelete)) {
                studentList.remove(student);
                return true; 
            }
        }
        return false; 
    }

    public boolean editStudentById(String idToEdit, String newFullName, Date newDateOfBirth, String newMajor, float newGpa) {
        for (Studen student : studentList) {
            if (student.getStudentId().equals(idToEdit)) {
                student.StudentInfo(idToEdit, newFullName, newDateOfBirth, newMajor, newGpa);
                return true; 
            }
        }
        return false; 
    }

    public void addStudent(Studen student) {
        studentList.add(student);
    }
}