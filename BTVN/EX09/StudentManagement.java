package SS_11.BTVN.EX09;

import java.util.ArrayList;
import java.util.List;

public class StudentManagement {
    List<Student> students = new ArrayList<Student>();

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student ){
        students.add(student);
    }
    public void showAll(){
        System.out.println("In tat ca: ");
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }

//    public void removeStudent(int studentId){
//        int index = 0;
//        for(Student student : students){
//            if(student.getId() == studentId){
//                students.remove(student);
//            }
//            index++;
//        }
//
//        if(index >= students.size()){
//            System.out.println("Student not found");
//        }else {
//            System.out.println("Da xoa!");
//        }
//    }

    public void removeStudent(int studentId ){
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getId() == studentId){
                students.remove(i);
                System.out.println("Deleted student with id: " + studentId);
                return;
            }
        }

        System.out.println("Student not found");
    }

    public Student findStudentById(int studentId) {
        for (Student student : students) {
            if (student.getId() == studentId) {
                return student;
            }
        }
        System.out.println("Khong tim thay");
        return null;
    }
    public double getAverageScore(){
        double sum = 0;
        for (Student student : students) {
            sum=sum+student.getAverageScore();
        }
        return sum/students.size();
    }

    public void sortByScore(){
        Student[] newStudents = students.toArray(new Student[0]);

        for (int i = 0; i < newStudents.length; i++) {
            for (int j = 0; j < newStudents.length-1; j++) {
                if (newStudents[j].getAverageScore() > newStudents[j+1].getAverageScore()) {
                    Student temp = newStudents[j];
                    newStudents[j] = newStudents[j+1];
                    newStudents[j+1] = temp;
                }
            }
        }

        for (Student newStudent : newStudents) {
            System.out.println(newStudent.toString());
        }
    }

}
