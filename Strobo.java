//import java.util.Map;
import java.util.*;

class Strobo{



    public boolean isStrobogrammatic(String num) {

        Map<Character, Character> map = new HashMap<Character, Character>();
        map.put('6', '9');
        map.put('9', '6');
        map.put('0', '0');
        map.put('1', '1');
        map.put('8', '8');
        int l = 0, r = num.length() - 1;
        while (l <= r) {
            if (map.containsKey(num.charAt(l))!=map.containsKey(num.charAt(r))){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[]args){
        Strobo n=new Strobo();
        System.out.println(n.isStrobogrammatic(String.valueOf(69)));
    }
}