class MultipleCatchDemo
{
    public static void main(String args[])
    {
        try
        {
            int a[] = {10, 20, 30};
            int x = 10 / 0;
            System.out.println(a[5]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index Out Of Bounds Exception");
        }
        catch(Exception e)
        {
            System.out.println("Some other exception");
        }
    }
}