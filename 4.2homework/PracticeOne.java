import java.util.*;

public class PracticeOne{

public static void main(String[] args){

 /* int x=48;
  
 System.out.println(toChar(x));
  char a='中';
System.out.println(toInt(a));
8*/
Scanner sc=new Scanner(System.in);
System.out.println("请输入一个字符串：");
String x=sc.next();


System.out.println("您输入的第一个字符转化的整数为"+toInt(x.charAt(0)));

}
public static char toChar(int y){

    char result=(char)y;
    return result;

}
public static int toInt(char b){


   
     return b;

}



}