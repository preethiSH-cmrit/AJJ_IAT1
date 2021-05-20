
package ajj.iat1;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface info { String author_name(); double version(); }

public class annotationsAuthor {
    // Annotate a method.
    @info(author_name = "Herbert Schildt", version = 1.0)
    public void myMeth() {
    annotationsAuthor ob = this;
    // Obtain the annotation for this method and display the values of the members.
    try {
        // First, get a Class object that represents this class.
        Class c = ob.getClass();
        // Now, get a Method object that represents this method.
        Method m = c.getMethod("myMeth");
        // Next, get the annotation for this class.
        info anno = m.getAnnotation(info.class);
        // Display the values.
        System.out.println(anno.author_name() + " " + anno.version()); 
    }catch (NoSuchMethodException exc) {
        System.out.println("Method Not Found."); }
    }

    public annotationsAuthor() {
        myMeth();
    }
    
}
