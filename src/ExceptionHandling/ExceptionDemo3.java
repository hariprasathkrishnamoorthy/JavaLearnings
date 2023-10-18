package ExceptionHandling;



// Java program to demonstrate
// control flow of try-catch clause
// when exception occurs in try block
// but not handled in catch block


class ExceptionDemo3
{
    public static void main (String[] args)
    {

        // array of size 4.
        int[] arr = new int[4];
        try
        {
            int i = arr[4]; //throw

            // this statement will never execute
            // as exception is raised by above statement
            System.out.println("Inside try block");
        }


        catch(Exception ex)
        {
            System.out.println("Exception has been caught");
        }

        System.out.println("Outside try-catch clause");
    }
}
