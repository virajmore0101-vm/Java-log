class Interest
{
    public void findInterest(int p, int r)
    {
        System.out.println("The interest for one year is: "
                           + (p * r / 100));
    }
    public void findInterest(int p, int r, int y)
    {
        System.out.println("The interest for " + y +
                           " year is: " + (p * r * y / 100));
    }
}
class InterestDemo
{
    public static void main(String args[])
    {
        Interest i = new Interest();
        i.findInterest(1000, 5);
        i.findInterest(1000, 5, 3);
    }
}