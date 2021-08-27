package five;
import code.five.MyKotlin1;
import code.five.MyKotlin2;

public class KotlinClassToJavaClass {
    public static void main(String[] args) {
        System.out.println(MyKotlin1.getA());
        MyKotlin1.func();
        MyKotlin1.extension(100);

        MyKotlin2.func2();
    }
}