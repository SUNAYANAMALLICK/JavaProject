package core;

public class StringProblems {

    public static void equalCompair(){
        String str1 = "First"; // String Literal
        // 1. Java checks the string pool first
        // 2. If the string is already present in the pool, a reference to the existing string is returned.
        // 3. If the string is not in the pool, a new string is created in the pool, and its reference is returned.
        String str2 = new String("First"); //  explicitly creates a new String
        // This creates a new string object in the heap memory, regardless of whether the string with the same value already exists in the string pool.
        System.out.println(String.format(" String1 : %s , String2 : %s , == : %s ,  equals = %s", str1, str2, str1.equals(str2), str1==str2));

        str1 = "NewValue";
        str2 = "NewValue";

        System.out.println(String.format(" New : String1 : %s , String2 : %s , == : %s ,  equals = %s", str1, str2, str1.equals(str2), str1==str2));

        System.out.println(str1.intern());

        StringBuilder stringBuilder = new StringBuilder(str1);

        System.out.println(stringBuilder.reverse());

        StringBuffer stringBuffer = new StringBuffer(str1);

        System.out.println(stringBuffer.reverse());



    }

    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        equalCompair();


    }
}
