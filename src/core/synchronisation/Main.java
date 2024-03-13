package core.synchronisation;

public class Main {

    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.


        Son son = new Son();
        son.synchronizedMethod();
        son.synchronizedMethod2();
        son.nonsynchronizedMethod();

        Daughter daughter = new Daughter();
        daughter.synchronizedMethod();
        daughter.synchronizedMethod2();


        
    }

}