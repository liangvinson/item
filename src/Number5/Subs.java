package Number5;
//5.4.1 substring(int beginIndex,int endIndex)方法截取指定的字符串
public class Subs {
    public static void main(String[] args){
        String str = "hello world";       //定义字符串
        String substr = str.substring(0,3);               //截取位置0-3的字符串
        System.out.println(substr);
    }
}
