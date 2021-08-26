package five;

public class JavaClass {
    private int value;

    public int getSomething(){
        return value;
    }

    public void setSomething(int value){
        this.value = value;
    }

    public double getDoubleValue(){
        return 3.14;
    }

    public boolean isGood(){
        return true;
    }

    public boolean contains(int any){
        return true;
    }

    public int get(int any){
        return any;
    }

    public static <T> void printClassInfo(Class<T> clazz){
        System.out.println(clazz.getCanonicalName());
    }
}
