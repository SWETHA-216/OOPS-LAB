import java.util.*;
class Headache{

public void pain1(){
System.out.println("pain: I have head ache");
}

public void reason1(){
System.out.println("reason: i have damage inside my brain");
}


}

public class Cold extends Headache{
public void pain2(){

System.out.println("pain: I have cold and sore throat");

}
public void reason2(){
System.out.println(" reason: 2 ice creams form mess and 1 from canteen ");
}
public static void main(String[]args){
Cold c=new Cold();
c.pain1();
c.reason1();
c.pain2();
c.reason2();
}
}



 