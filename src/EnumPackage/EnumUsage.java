package EnumPackage;

/*
Enum converts into a class in backend.
Enum can have variables, methods, constructors.
Enum can be declared inside and outside of class
It is used to declare the range of constants, which are nothing but static final objects in backend; like shown in
commented code below
Enum can implement interface but not extend classes.*/
/*
public class EnumUsage{
    static final EnumUsage ADD = new EnumUsage(24.0,2.0);
    static final EnumUsage SUBTRACT = new EnumUsage(10.0,4.0);
    static final EnumUsage MULTIPLY = new EnumUsage();
    static final EnumUsage DIVIDE = new EnumUsage(25.0,5.0);
    double x, y;
    EnumUsage(){
        System.out.println("Default constructor called");
    }
    EnumUsage(double a, double b){
        System.out.println("Parameterised constructor called");
        this.x = a;
        this.y = b;
    }

    double add(){
        return x+y;
    }
    double multiply(){
        return x*y;
    }
    double subtract(){
        return x-y;
    }
    double divide(){
        return x/y;
    }
} */

enum EnumUsage {
    ADD(24.0,2.0),SUBTRACT(10.0,4.0),MULTIPLY(),DIVIDE(25.0,5.0);
    double x, y;
    EnumUsage(){
        System.out.println("Default constructor called");
    }
    EnumUsage(double a, double b){
        System.out.println("Parameterised constructor called");
        this.x = a;
        this.y = b;
    }
    double add(){
        return x+y;
    }
    double multiply(){
        return x*y;
    }
    double subtract(){
        return x-y;
    }
    double divide(){
        return x/y;
    }
}

class EnumMainClass{
    public static void main(String[] args){
        EnumUsage e = EnumUsage.DIVIDE;
        EnumUsage a = EnumUsage.ADD;
        System.out.println(e.ordinal());  //To check index of constant DIVIDE, at position it is declared.
        System.out.println(a.ordinal());  //ADD position would be 0
        EnumUsage[] arr = EnumUsage.values();  //To print all constants declared in Enum
        for(EnumUsage cons: arr){
            System.out.println(cons);
        }
        switch (e){
            case ADD:
                System.out.println("Addition "+ e.add());
                break;
            case SUBTRACT:
                System.out.println("Subtraction "+ e.subtract());
                break;
            case MULTIPLY:
                System.out.println("Multiply "+ e.multiply());
                break;
            case DIVIDE:
                System.out.println("Division "+ e.divide());
                break;
            //case "XYZ":  This will throw compile time error, as we have restricted switch with e which is EnumUsage type
            //No other types will be allowed.

        }
    }
}
