import java.util.HashMap;
import java.util.Map;

public class reverse_string {

    public static void main(String[] args){
        String s = "Hello";
        string_letterCounter(s);
    }

    public static String reverseString(String s){
        char[] a = new char[s.length()];
        int pos = s.length() - 1;
        for(int i = 0; i < a.length; i++, pos--){
            a[i] = s.charAt(pos);
        }
        return new String(a);
    }

    public static String reverseString_Builder(String s){
        StringBuilder a = new StringBuilder(s.length());
        int pos = s.length() - 1;
        for(int i = 0; i < s.length(); i++, pos--){
            a.append(s.charAt(pos));
        }
        return a.toString();
    }

    public static String reverse_charArray(String s){
        char[] a = s.toCharArray();
        for(int i = 0, j = s.length() - 1; i < j; i++, j--){
            char temp = a[j];
            a[j] = a[i];
            a[i] = temp;
        }
        return new String(a);
    }

    public static void string_letterCounter(String s){
        Map<Character, Integer> m = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(!m.containsKey(s.charAt(i)))
                m.put(s.charAt(i), 1);
            else{
                m.put(s.charAt(i), m.get(s.charAt(i)) + 1);
            }
        }
        System.out.println(m.values().);
    }
}
