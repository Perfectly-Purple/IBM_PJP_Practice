class Pen{
    private String brand;
    Pen(String brand)
    {
        this.brand=brand;
    }
    String getBrand(){
        return brand;
    }
}

class Student{
    private Pen pen;
    Student(Pen pen){
        this.pen=pen;
    }
    void writes(){
        System.out.println("Student writes with "+pen.getBrand()+" pen");
    }
}

class uses_a{
    public static void main(String args[])
    {
        Student student=new Student(new Pen("Parker"));
        student.writes();
    }
}