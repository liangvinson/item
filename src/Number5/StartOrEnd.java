package Number5;
//使用startsWith()方法判断字符串对象是否以指定的字符前缀作为开始
//使用endsWith()方法判断字符串对象是否以指定的字符后缀作结尾
public class StartOrEnd {
    public static void main(String[] args){
        String num1 = "220045612";   //定义字符串
        String num2 = "21355678";
        boolean b1 = num1.startsWith("22");
        boolean b2 = num1.endsWith("12");
        boolean b3 = num2.startsWith("22");
        boolean b4 = num2.endsWith("78");
        System.out.println("字符串num1是以\"22\"开头?: "+b1);
    }
}
