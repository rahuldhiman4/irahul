package RegularExpPack;
//Learn about Regx below:
/*
Matcher Class : It implements the MatchResult interface. It is a regex engine which is used to perform match operations
on a character sequence.
Pattern Class : It is the compiled version of a regular expression. It is used to define a pattern for the regex engine.

REGEX Character class:
[abc] : a,b or c only once
[^abc] : any class except a,b,c
[a-zA-Z] : a through z or A through Z (inclusive Range)
[a-z[m-p]]: a through d or m through p (union)
[a-z&&[def]] : d,e,f (intersection)
[a-z&&[^bc]] : a through z except b and c (Subtraction)
[a-z&&[^m-p]] : a though z except m through p (Subtraction)

REGEX Quantifiers:
X? : X occurs once or not at all (0 or 1)
X+ : X occurs more than 1 time
X* : X occurs 0 or more times (0 or many)
X{n} : X occurs n times
X{n,} : X occurs n or more times only
X{y,z} : X occurs atleast y times but less than z times

REGEX Metacharacters:
. : it can be any character only
d : Represents any digit once
D : Represents any non-digit once
s : Represents any whitespace once
S : Non white space character once
w : It can be a word character once
W : can be a non word character once
b : Represents a word boundary once
B : Represents a non word boundary once
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args){
        Pattern pat = Pattern.compile("[a-zA-Z0-7_.]+@[a-z]+[.]com$");
        Matcher mat = pat.matcher("RAHUL_dhi.man2107@gmail.com");
        System.out.println("Verify If Matcher matches the pattern: "+mat.matches());

        //Another example within the same code
        //Enter input as, any word within the string or
        //[a-zA-Z!]+
        //[a-z!]+
        try {
            Scanner sc = new Scanner(System.in);
            while (true){
                System.out.println("Enter Regular Expression : ");
                String regex = sc.nextLine();
                Pattern pat2 = Pattern.compile(regex);
                Matcher mat2 = pat2.matcher("Hello friends! Welcome To my Testing TUTORIAL, Connect : 7989897823");
                boolean found  = false;
                while(mat2.find()){
                    System.out.println("Found the text >>"+mat2.group()+"<< Starting at index: "
                    +mat2.start()+" And Ending at index: "+mat2.end());
                    found = true;
                }
                if(!found){
                    System.out.println("Match not found!");
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
