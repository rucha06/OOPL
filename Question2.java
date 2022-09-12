import java.util.*;
class Question2{

    static void welcomeFunction(String nameOfPerson)
    {
        System.out.println("Hello "+nameOfPerson+", Welcome to Java World!");
    }
    public static void main(String args[])
    {
        System.out.print("Enter the Name of Person: ");
        Scanner sc = new Scanner(System.in);
        String nameOfPerson = sc.next();
        welcomeFunction(nameOfPerson);
    }
}