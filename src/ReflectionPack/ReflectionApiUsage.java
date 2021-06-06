package ReflectionPack;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class SampleClass{
    int x, y;
    SampleClass(){
        x=2;
        y=3;
        System.out.println("Default Constructor");
    }
    SampleClass(int a, int b){
        x=a;
        y=b;
        System.out.println("Parametized Constructor");
    }

    int getMethod(){
        return x*y;
    }
    void setMethod(int z){
        x=z;
    }
}

public class ReflectionApiUsage {

    public static void main(String[] args){
        try {
            Class c = Class.forName("ReflectionPack.SampleClass");
            System.out.println("======Printing details of class separately=====");
            //getDeclaredMethods used to get all methods of the particular class where getMethods used to get all methods
            //of inherited classes, in this case Object class methods
            Method[] m = c.getDeclaredMethods();
            Field[] f = c.getDeclaredFields();
            Constructor[] con = c.getDeclaredConstructors();
            System.out.println("======All Methods=====");
            for(Method meth: m){
                System.out.println(meth);
            }
            System.out.println("======All Fields=====");
            for(Field field: f){
                System.out.println(field);
            }
            System.out.println("======All Constructors=====");
            for(Constructor constructor: con){
                System.out.println(constructor);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
