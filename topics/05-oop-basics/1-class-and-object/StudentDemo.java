class Student
{
    int rollno;
    String name;
    void display()
    {
        System.out.println("Roll No : " + rollno);
        System.out.println("Name : " + name);
    }
}
class StudentDemo
{
    public static void main(String args[])
    {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.rollno = 1;
        s1.name = "Raj";
        s2.rollno = 2;
        s2.name = "Rahul";
        s1.display();
        s2.display();
    }
}