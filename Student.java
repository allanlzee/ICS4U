public class Student {
    private double height = -1.0; 
    private int grade = -1; 
    private String name = Globals.NULL_STRING; 
    private double averageMark = -1.0; 

    public Student(double height, int grade, String name, double averageMark) {
        this.height = height; 
        this.grade = grade; 
        this.name = name; 
        this.averageMark = averageMark; 
    }

    public String toString() {
        return "Name  :" + getName() + "\n" + 
               "Grade :" + getGrade() + "\n" +
               "Height:" + getHeight() + "\n" +
               "Mark  :" + getAverageMark(); 
    }

    public double getHeight() {
        return this.height; 
    }

    public void setHeight(double height) {
        this.height = height; 
    }

    public int getGrade() {
        return this.grade; 
    }

    public void setGrade(int grade) {
        this.grade = grade; 
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name; 
    }

    public double getAverageMark() {
        return this.averageMark; 
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark; 
    }
}
