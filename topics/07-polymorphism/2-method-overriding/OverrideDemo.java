class A
{
    void show(int k)
    {
        System.out.println("super class method and data: " + k);
    }
}
class B extends A
{
    void show(int p)
    {
        super.show(10);
        System.out.println("sub class method and data: " + p);
    }
}
class OverrideDemo
{
    public static void main(String args[])
    {
        B b = new B();
        b.show(20);
    }
}