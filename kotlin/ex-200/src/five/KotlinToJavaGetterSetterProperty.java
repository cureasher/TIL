package five;

import code.five.KotlinGetSetClass;

public class KotlinToJavaGetterSetterProperty {
    public static void main(String[] args) {
        KotlinGetSetClass kotlinGetter = new KotlinGetSetClass();
        kotlinGetter.setNum(16);
        System.out.println(kotlinGetter.getNum());
    }
}
