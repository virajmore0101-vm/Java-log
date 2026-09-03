class AgeException extends Exception
{
    AgeException(String message)
    {
        super(message);
    }
}
class CustomExceptionDemo
{
    public static void main(String args[])
    {
        int age = 16;
        try
        {
            if(age < 18)
            {
                throw new AgeException("Age is less than 18");
            }
            System.out.println("Eligible for voting");
        }
        catch(AgeException e)
        {
            System.out.println(e.getMessage());
        }
    }
}