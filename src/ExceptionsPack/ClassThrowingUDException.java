package ExceptionsPack;

public class ClassThrowingUDException {
    public static void main(String[] args)  {  //you can use throws UserDefineException' here rather than surrounding with try catch
        int age=17;
        try {
            if (age < 18) {
//            throw new UserDefinedException();
                throw new UserDefinedException("Message thrown by user at runtime");
            } else {
                System.out.println("The age of student is " + age);
            }
        }
        catch (UserDefinedException e){
            e.printStackTrace();
        }

    }
}
