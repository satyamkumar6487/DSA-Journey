import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class PrintAnagram {

    public static  void main(String []args){
        String  []str = {"act", "god", "cat", "dog", "tac"};

        ArrayList<ArrayList<String>> result = anagrams(str);

System.out.println(result);
    }

    static ArrayList<ArrayList< String>> anagrams(String []str){

        HashMap<String , ArrayList<String>> map = new HashMap<>();


for (String arr : str){
    char [] ch  = arr.toCharArray();

    Arrays.sort(ch);
    String key =  new String(ch);

if(!map.containsKey(key)){

    map.put(key , new ArrayList<>());
}

map.get(key) .add(arr);

    }

return new ArrayList<>(map.values());

}}
