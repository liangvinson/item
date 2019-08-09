package Number5;
//5.2.1 连接字符串，使用 + 运算符，连接多个字符串 ，产生新的String对象
public class Join {
    public static void main(String[] args){
        String s1 = new String("hello"); //构造方法创建字符串对象s1，声明对象s1
        String s2 = new String("world");
        String s = s1+" "+s2;  //+号运算符连接两个字符串对象，并赋值给对象s
        System.out.println(s);
    }
}
