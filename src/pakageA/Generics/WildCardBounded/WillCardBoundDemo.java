package pakageA.Generics.WildCardBounded;

public class WillCardBoundDemo {
    public static void main(String[] args) {
        TwoD td[] = {
                new TwoD(5,6),
                new TwoD(7,8.5)
        };

        ThreeD thd[] = {
                new ThreeD(5,6, 5.6),
                new ThreeD(7,4.5,8.5)
        };

        Coords<TwoD> ct = new Coords<>(td);
//        ct.showXY(ct);
        Coords<ThreeD> cth = new Coords<>(thd);
        ct.showXYZ(cth);
    }
}
