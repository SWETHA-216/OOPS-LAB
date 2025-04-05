import java.util.*;
class Person{
String name;
Person(String name){

this.name= name;
System.out.println(name);


}
}



class Employee extends Person{

Employee(String name)
{
super(name);
}
}
public class MainClass{
public static void main(String [] args){

Employee e1= new Employee("Swetha");
}
}