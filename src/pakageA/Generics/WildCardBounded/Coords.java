package pakageA.Generics.WildCardBounded;

public class Coords <T extends TwoD>{
    T[] coords;

    Coords(T[] coords){
        this.coords = coords;
    }

    void showXY(Coords<T> c){
        for (T t: c.coords
             ) {
            System.out.println("showxy -> x: " + t.x);
            System.out.println("showxy -> y: " + t.y);
        }
    }

    void showXYZ(Coords<?extends ThreeD> c){
        for (ThreeD th: c.coords
        ) {
            System.out.println("showxy -> x: " + th.x);
            System.out.println("showxy -> y: " + th.y);
            System.out.println("showxy -> z: " + th.z);
        }
    }
}
