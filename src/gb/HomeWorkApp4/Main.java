package gb.HomeWorkApp4;


import java.util.*;

public class Main {

    public static void main(String[] args) {
   String[] name={"tom","tom","cat","cat","dog","ivan","foot","hoof","ivan","vasa"};
        Map<String,Integer>map=new HashMap<>();
        for (String m:name){
            map.put(m, map.getOrDefault(m,0)+1);
        }
        System.out.println(map);
        Set<String>strings=new HashSet<>(Arrays.asList(name));
          System.out.println(strings);
        }
    }


