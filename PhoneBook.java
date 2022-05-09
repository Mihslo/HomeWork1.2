package gb.HomeWorkApp4;

import java.util.*;


public class PhoneBook {
private Map<String,List<String>>hm=new HashMap<>();
private List<String> phone_namber;
       public void add(String name,String number) {

           if (hm.containsKey(name)) {
               phone_namber = hm.get(name);
               phone_namber.add(number);
               hm.put(name, phone_namber);
           } else {
              phone_namber = new ArrayList<>();
             phone_namber.add(number);
               hm.put(name, phone_namber);
           }
       }

        public List<String> get(String surname) {
            return hm.get(surname);

        }

            }










