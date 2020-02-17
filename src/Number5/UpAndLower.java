package Number5;
/*
5.4.7 字母的大小写转换，数字，非字符不影响
toLowerCase() 转小写
toUpperCase() 转大写
*/
public class UpAndLower {
    public static void main(String[] args){
        String str = new String("abc DEF"); //定义字符串对象str
        String newstr = str.toLowerCase();   //小写转换
        String newstr2 = str.toUpperCase();   //大写转换
        System.out.println(newstr);
        System.out.println(newstr2);
    }
}
