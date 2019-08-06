package Number4;
//4.3.3.2 forseach循环语句，用于遍历数组
public class Repetition {
    public static void main(String[] args){
        int arr[] = {7,10,1}; //声明一维数组
        System.out.println("一维数组中的元素分别为：");
        for(int x : arr){
            //foreach语句，int x 引用的变量，arr指定要循环遍历的数组，最后将x输出
            System.out.println(x);
        }
    }
}
