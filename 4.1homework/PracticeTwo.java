public class PracticeTwo{
//定义一个int类型的整数19，在控制台输出它的2进制数和16进制数和8进制数
public static void main(String[] args){
    int a=19;
System.out.println("2进制数为:"+Integer.toBinaryString(a));
System.out.println("16进制数为:"+Integer.toHexString(a));
System.out.println("8进制数为:"+Integer.toOctalString(a));

}


}