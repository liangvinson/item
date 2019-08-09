package Number5;
//5.4.2 trim()方法 去除前导空格和尾部空格
public class Blak {
    public static  void main(String[] args){
        String str = "    hello   world    ";
        System.out.println("字符串原来的长度"+str.length());
        //去除前导空格和尾部空格
        System.out.println("去除前导空格和尾部空格后的字符串长度"+str.trim().length());
    }
}
