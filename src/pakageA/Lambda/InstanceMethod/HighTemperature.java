package pakageA.Lambda.InstanceMethod;

public class HighTemperature {
    private  int hTemp;

    HighTemperature(int hTemp){
        this.hTemp = hTemp;
    }

    boolean sameTemp(HighTemperature h2){
        return hTemp == h2.hTemp;
    }

    boolean lessThanTemp(HighTemperature h2){
        return hTemp < h2.hTemp;
    }

}
