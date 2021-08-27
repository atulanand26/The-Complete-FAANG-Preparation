package Divivsion_A;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Nineteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str.toLowerCase();
        Map<Character, Integer> map = new HashMap<>();

        map.put('n', 0);
        map.put('i', 0);
        map.put('e', 0);
        map.put('t', 0);
        //map.put('N',3);  // N3 I1 E3 T1
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch=='n' || ch=='i' || ch == 'e' || ch=='t'){
                map.put(ch, map.get(ch)+1);
            }
        }
        int n = (map.get('n')-1)/2;
        int i = map.get('i');
        int e = map.get('e')/3;
        int t = map.get('t');

        int res = Math.min(n,i);
        int res2 = Math.min(e,t);
        System.out.println(Math.min(res, res2));

    }
}
