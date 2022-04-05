package pakageA.Lambda.InstanceMethod;

public class InstanceMethodDemo {
    static <T> int counter(T[] arrs, MyFunc<T> mfunc, T t){
        int count = 0;

        for (int i = 0; i < arrs.length; i++) {
            if(mfunc.func(arrs[i], t)) count++;
        }

        return  count;
    }

    public static void main(String[] args) {
        HighTemperature[] h1 = {
                new HighTemperature(97),new HighTemperature(97),new HighTemperature(97),
                new HighTemperature(96), new HighTemperature(90), new HighTemperature(99)
        };

        System.out.println("days had a same 97temperature: "+counter(h1, HighTemperature::sameTemp, new HighTemperature(97)));
        System.out.println("days had a high of less 97temperature: "+counter(h1, HighTemperature::lessThanTemp, new HighTemperature(97)));
    }
}
