import java.util.*;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> hash = new HashMap<>();
        hash.put(1, "ONE");
        hash.put(2, "TWO");
        hash.put(3, "THREE");
        hash.put(4, "FOUR");
        hash.put(5, "FIVE");

        Set<Integer> hashKeys = hash.keySet();
        for (Integer i : hashKeys){
            System.out.println(i + " : " + hash.get(i));
        }

        Random rd = new Random();
        HashMap<Integer, String> hash1 = new HashMap<>();
        int firstRd = rd.nextInt(10-1)+1;
        hash1.put(firstRd,"digit" + firstRd);
        int i = 1;
        while (i != 0){
            int rand = rd.nextInt(11-1)+1;
            if(hash1.containsKey(rand)){
            } else {
                hash1.put(rand,"digit"+rand);
                i++;
                if (i==10){
                    break;
                }
            }
        }



        Set<Integer> hashKeys1 = hash.keySet();
        for (Integer j : hashKeys1){
            if(j<=5){
                hash.put(j,"digit"+j);
            }
        }

        HashMap<String, Integer> hash2 = new HashMap<>();

        Set<Integer> hashKeys5 = hash1.keySet();
        for (Integer o : hashKeys5){
            hash2.put(hash1.get(o),o);
            System.out.println("digits"+ hash2.get("digit"+o) + " : " + o);
        }

        System.out.println(hash2.size());
        System.out.println(hash2.keySet());
        System.out.println(hash2.values());

        Set<Integer> hashKeys4 = hash1.keySet();
        for (Integer l : hashKeys4){
            System.out.println(l + " : " + hash1.get(l));
        }
    }
}
