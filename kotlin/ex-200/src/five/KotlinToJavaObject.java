package five;

import code.five.KotlinObject;

public class KotlinToJavaObject {
    public static void main(String[] args) {
        System.out.println(KotlinObject.INSTANCE.getNumber());
        KotlinObject.INSTANCE.setNumber(75);
        System.out.println(KotlinObject.INSTANCE.getNumber());
        KotlinObject.INSTANCE.helloPrint();
    }
}
