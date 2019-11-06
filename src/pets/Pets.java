/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pets;

import java.util.ArrayList;
import java.util.Collections;
import static jdk.nashorn.internal.runtime.regexp.joni.Syntax.Java;

/**
 *
 * @author kokonoula
 */
public class Pets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Cat, dog, turtle, fish, parrot, lizard, rabbit, hamster, canary
        
        ArrayList<String> pets = new ArrayList<String> ();
        
        pets.add("cat");
        pets.add("dog");
        pets.add("turtle");
        pets.add("fish");
        pets.add("parrot");
        pets.add("lizard");
        pets.add("rabbit");
        pets.add("hamster");
        pets.add("canary");
        
        System.out.println(pets);
        System.out.println(" ");
        System.out.println("How would you referenve to the lizard? : pets.get(5)" + pets.get(5));
        System.out.println(" ");
        System.out.println("How would you sort the array? : Collections.sort(pets)");
        System.out.println(" ");
        Collections.sort(pets);
        System.out.println(pets);
        System.out.println(" ");
        System.out.println("How would you insert java at the top of the array list? : pets.add(0,java)");
        System.out.println(" ");
        pets.add(0,"java");
        System.out.println(pets);
        System.out.println(" ");
        System.out.println("How would you get the possition of fish in the array list? : pets.indexOf(fish)");
        System.out.println("The possition of fish is : " + pets.indexOf("fish"));
        
    }
    
}
