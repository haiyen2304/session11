package SS_11.BTVN.EX09;

public class Student {
    private  int id;
    private String name;
    private double averageScore;

    public Student() {

    }

    public Student(int id,String name, double averageScore) {
        this.id = id;
        this.name = name;
        this.averageScore = averageScore;
    }

    public int getId() {
        return id;
    }

    public  void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }


    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.averageScore;
    }
}
