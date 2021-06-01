package ExceptionsPack;
/*
ClassNotFoundException, NoSuchMethodException, SQL/IO/Remote Exceptions
FileNotFound, Interrupted etc
 */
public class CheckedExceptions {
    public void newMethod() {
        System.out.println("New Method");
    }

    public static void main(String[] args) throws Exception {
        System.out.println(Class.forName("ABC"));  //ClassNotFoundException
    }
}
