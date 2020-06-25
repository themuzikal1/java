class Statically {
    //fix this code, so all of the instantiation and console.logs() work.  Try not to change the signature of the class, unless absolutely necessary.
    glue() {
      console.log("Epoxy");
    }
    jello() {
      console.log("Jello");
    }

    moveAndShake() {
        console.log("Never stagnate in life.  Be agile, change, and improve...");
    }

    static stubborn() {
        console.log("Please don't make me change... I just don't like it...");
    }

    static explain() {
      console.log("The static keyword in JS defines a static method for a class.  Static methods aren't called on instances of the class.  Instead, they are called on teh class itself.  In Java, the static keyword is mainly used for memory management and is used to share the same variable or method of a given class.  Static is used for a constant variable or method that is same for every instance of a class.")
        Statically.stubborn();
        console.log(stats.glue());
         //
        //write an explanation for how the keyword static behaves differently in javascript vs. java.
    }

}

//get the below code to run correctly without errors:  Make sure you explain what you did in the the explain() method, defined in the class.  Do NOT remove the 'static' keyword from the explain() method.

const stats = new Statically();

stats.moveAndShake();
Statically.stubborn();
Statically.explain();

console.log(stats.glue());
console.log(stats.jello());

//Once you have finished getting statistically.js to run, refactor the code here in Java.
