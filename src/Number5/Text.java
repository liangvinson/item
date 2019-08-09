package Number5;
//5.3.2 使用lastIndexOf()方法查找字符串中空字符的位置，使用length()方法计算字符串长度
public class Text {
    public static void main(String[] args){
        String str = "We are students";
        //将str中空字符的索引位置赋值给变量size
        int size = str.lastIndexOf("");
        //输出变量size
        System.out.println(size);
        //输出字符串str的长度
        System.out.println(str.length());
    }
}
