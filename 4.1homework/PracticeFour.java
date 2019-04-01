import java.util.Random;
public class PracticeFour{
/*每运行一次程序，随机生成A~Z 之间的某个字母
整型（int）数 97代表的字符是什么？
字符‘0’代表整型数是多少？*/
public static void main(String[] args){

   Random r=new Random();
   int rInt=r.nextInt(26);
   char a=(char)('A'+rInt);
   char b=97;
   char c='0';
   System.out.println(a);
   System.out.println(b);
   System.out.println((int)c);
}

}