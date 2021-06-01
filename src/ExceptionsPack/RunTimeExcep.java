package ExceptionsPack;
//Arithmetic, ArrayIndexOutOfBound,ClassCast Exception, NullPointer,

class RunTimeExcep
{
    public static void main(String args[])
    {
        RunTimeExcep et = new RunTimeExcep();
        String arr[] = {"Rahul","Rahul2"};
        et.printResults(arr);
    }
    void printResults(String[] x) throws ArrayIndexOutOfBoundsException
    {
        System.out.println(x[2]);
    }
}
