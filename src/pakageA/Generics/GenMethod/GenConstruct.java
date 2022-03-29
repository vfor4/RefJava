package pakageA.Generics.GenMethod;

public class GenConstruct {
    private double d;

    <T extends Number> GenConstruct(double d){
        this.d = d;
    }

    double getVal(){
        return d;
    }

    public static void main(String[] args) {
        GenConstruct g = new GenConstruct(5);
        GenConstruct g2 = new GenConstruct(5F);
        System.out.println(g.getVal());
    }
}
