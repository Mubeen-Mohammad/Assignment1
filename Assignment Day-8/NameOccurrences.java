//Assignment-2 :
//Create a list of names and find the number of occurences of each name.

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class NameOccurrences {
    public static void main(String[] args) {

        
        List<String> names = new ArrayList<>();
        names.add("mubeen");
        names.add("faheem");
        names.add("faheem");
        names.add("nahina");
        names.add("faheem");
        names.add("mubeen");
        
                
        Map<String, Integer> nameCount = new HashMap<>();
        
        //counting the names 
        for(String name : names){
            if(!nameCount.containsKey(name)){
                int count = Collections.frequency(names, name);
                nameCount.put(name, count);
            }
        } 
        
        //printing the names and its count.
        for (Map.Entry<String, Integer> entry : nameCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
