package Number5;
//5.4.3使用replace()方法替换字符串
public class NewStr {
    public static void main(String[] args){
        String str = "add ress";
        //将字符串中的 a 替换成A，并生成新的字符对象
        String newstr = str.replace("a","A");
        System.out.println(newstr);
    }
}
