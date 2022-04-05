package pakageA.Lambda.ConstructorsRef;

public class MyClass {
    Integer val;
    public MyClass(){
        val = 0;
    }

    public MyClass(Integer val){
        this.val  = val;
    }

    public Integer getVal(){
        return val;
    }
}
