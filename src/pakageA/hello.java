package pakageA;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public abstract class hello {
    int val;
    public void hello(){
        System.out.println("hi there");
    }

    public abstract void goodBye();
}
