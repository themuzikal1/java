package exercise2;

public class Statically {
    //Once you have finished getting statistically.js to run, refactor the code here in Java.
    public static void glue() {
        System.out.println("Epoxy");
    }
    public static void jello() {
        System.out.println("Jello");
    }

    public static void moveAndShake() {
        System.out.println("Never stagnate in life.  Be agile, change, and improve...");
    }

    public static void stubborn() {
        System.out.println("Please don't make me change... I just don't like it...");
    }

    public static void explain() {
        System.out.println("The static keyword in JS defines a static method for a class.  Static methods aren't called on " +
                "instances of the class.  Instead, they are called on teh class itself.  " +
                "In Java, the static keyword is mainly used for memory management and is used " +
                "to share the same variable or method of a given class.  " +
                "Static is used for a constant variable or method that is same for every instance of a class.");
        Statically.stubborn();
        glue();
        //
        //write an explanation for how the keyword static behaves differently in javascript vs. java.
    }



//get the below code to run correctly without errors:  Make sure you explain what you did in the the explain() method, defined in the class.  Do NOT remove the 'static' keyword from the explain() method.
public static void main(String[] args) {


Statically stats = new Statically();

        stats.moveAndShake();
        Statically.stubborn();
        Statically.explain();

    glue();
    jello();

        }
}
