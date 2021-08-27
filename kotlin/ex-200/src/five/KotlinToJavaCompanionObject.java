package five;

import code.five.KotlinCompanionObject;

public class KotlinToJavaCompanionObject {
    public static void main(String[] args) {
        KotlinCompanionObject.Companion.setNumber(30);
        System.out.println(KotlinCompanionObject.Companion.getNumber());
        KotlinCompanionObject.Companion.helloPrint();
    }
}
