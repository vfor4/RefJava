package pakageA.Lambda.MethodReferences.StaticMethod;

public class MyStringOps {
     static String staticRevString(String str){
        String result = "";
        for (int i = str.length() -1 ; i >= 0 ; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    String revString(String str){
        String result = "";
        for (int i = str.length() -1 ; i >= 0 ; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}
