class Child{
    void plays()
    {
        System.out.println("The child is playing");
    }
}

class Student extends Child
{
    void studies()
    {
        System.out.println("The student is studying");
    }
}

public class is_a {
    public static void main(String[] args) {
        Student st=new Student();
        st.plays();
        st.studies();
    }
}
