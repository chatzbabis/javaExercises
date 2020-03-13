/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;
import java.util.ArrayList;

/**
 *
 * @author chatz
 */
public class Listes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> listOfNames = new ArrayList();
        listOfNames.add("Nick");
        listOfNames.add("Peter");
        listOfNames.add("Mary");
        listOfNames.add("Jack");
        listOfNames.add("Andy");
        
        int size = listOfNames.size();
        System.out.println("the size is"+ size);
                
        if (!listOfNames.contains("Jonathan")) {
            listOfNames.add("jonathan");
                   }
        
        String index3=listOfNames.get(3);
        System.out.println("the value in index 3 is: "+index3);
        listOfNames.remove(2);
        
        if(!listOfNames.isEmpty()){
            listOfNames.clear();
        }
    }

}
