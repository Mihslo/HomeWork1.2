package gb.HomeWorkApp4;


import java.util.*;

public class Main {




    public static void main(String[] args) {
        task1();
        task2();




    }

    private static void task1() {
        String[] name = {"tom", "tom", "cat", "cat", "dog", "ivan", "foot", "hoof", "ivan", "vasa"};
        Map<String, Integer> map = new HashMap<>();
        for (String m : name) {
            map.put(m, map.getOrDefault(m, 0) + 1);
        }
        System.out.println(map);
        Set<String>strings=new HashSet<>(Arrays.asList(name));
          System.out.println(strings);
        }
     private static void task2(){
        PhoneBook phoneBook=new PhoneBook();
       phoneBook.add("Ivan","8029 555 444 555");
         phoneBook.add("Ivan","8029 555 444 555");
         phoneBook.add("Max","8029 565 454 545");
         phoneBook.add("Max","8029 565 454 545");
         phoneBook.add("Alex","8029 332 054 549");
       phoneBook.get("Ivan");
         phoneBook.get("Max");
         phoneBook.get("Alex");
    }

}








