import java.util.LinkedList;
import java.util.List;

/**
 * Created by Krishnakanth on 11/5/2016.
 */

public class findingPowerset  {
    public static String getPresentElements(String s, int n) {
        StringBuilder sb = new StringBuilder();
        int strlen = s.length();
        for (int i = strlen - 1; i >= 0 ; i--) {
            if ((n & 1) == 1) { // The last bit is enabled
                sb.append(s.charAt(i));
            }
            n = n >>> 1;
        }
        sb.reverse();
        return sb.toString();
    }

    public static List<String> getPowerSet(String s) {
        List<String> comboList = new LinkedList<String>();
        int n = (int )Math.pow(2, s.length()) - 1;

        for (int i = 0; i<=n; i++) {
            comboList.add(getPresentElements(s, i));
        }
        java.util.Collections.sort(comboList);
        return comboList;
    }

    public static void main(String[] args) {
        String s = "abc";
        List<String> comboList = getPowerSet(s);
        for (String combo : comboList) {
            System.out.println(combo);
        }
    }
}
