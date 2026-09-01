class Bond
{
    void display()
    {
        System.out.println("Bond");
    }
}
class ConvertibleBond extends Bond
{
    void display()
    {
        System.out.println("ConvertibleBond");
    }
}
class DispatchDemo
{
    public static void main(String args[])
    {
        Bond b;
        b = new Bond();
        b.display();
        b = new ConvertibleBond();
        b.display();
    }
}