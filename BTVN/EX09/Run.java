package SS_11.BTVN.EX09;

public class Run {
    public static void main(String[] args) {
        StudentManagement test=new StudentManagement();
        Student hs=new Student(1,"HY",10);
        test.addStudent(hs);
        //Casch 2
        test.addStudent(new Student(2,"HYL",5.5));
        test.addStudent(new Student(3,"HYLLLL",7.5));
        test.addStudent(new Student(4,"HYLLLL",8.5));
        System.out.println(test.getStudents().size());
        test.showAll();
        test.removeStudent(3);
        test.showAll();
        test.sortByScore();
    }
}
