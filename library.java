import java.util.*;

public class library
{
String author;
int price ;
String book_name;

public library(String author, int price ,String book_name)
{

this.author=author;
this.price=price;
this. book_name=book_name;
}
public library(String author,String book_name)
{

this.author=author;
this. book_name=book_name;
}

public void info(){
 System.out.println("Author:"+author+"  "+"Book name:"+book_name+"  "+"Price:"+ price);
}
public static void main(String[] args){
library l=new library("Chetan Baghat",299,"five point someone");
library l1=new library("Ravindhar Singh ","Can love happen twice");
l.info();
l1.info();
}
}

