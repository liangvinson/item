package Number5;
//5.4.6
//使用compareTo()方法比较String对象和参数字符串的字典顺序，大于则返回负整数，少于正整数，相等返回0
public class WordBook {
    public static void main(String[] args){
        String str = new String("b");
        String str2 = new String("a");
        String str3 = new String("c");
        //输出str和str2的字典顺序比较结果
        System.out.println(str+"compareTo "+str2+" "+str.compareTo(str2));
        //输出str和str3的字典顺序比较结果
        System.out.println(str+"compareTo "+str2+" "+str.compareTo(str3));
    }
}