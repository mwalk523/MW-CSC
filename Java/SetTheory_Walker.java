import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
public class SetTheory_Walker 
{
   public static void main (String args[])
   {  
      //List of Integers for Set A
      List<Integer> numberList = new ArrayList<>();
      numberList.add(1);
      numberList.add(2);
      numberList.add(3);
      numberList.add(4);
      numberList.add(5);
      
      //List of Integers for Set B
      List<Integer> numberList2 = new ArrayList<>();
      numberList2.add(4);
      numberList2.add(5);
      numberList2.add(6);
      numberList2.add(7);
      numberList2.add(8);
      
      //Creation of set A
      Set<Integer> setA = new HashSet<>();
      setA.addAll(numberList);
      //Creation of set B 
      Set<Integer> setB = new HashSet<>();
      setB.addAll(numberList2);//addAll methods adds all elements from the set/list/collection in
                              //parentheses to the existing set (in a random order).
      
      System.out.println("A = " + setA);
      System.out.println("B = " + setB);
      
      //Union
      Set<Integer> union = new HashSet<>(setA);
      union.addAll(setB); 
      System.out.println("A Union B = " + union);
      
      //Intersection 
      Set<Integer> intersection = new HashSet<>(setA);
      intersection.retainAll(setB); //retainAll method retains all elements from the set/list/collection in
                                   //parentheses that are in the existing set.
      System.out.println("A Intersect B = " + intersection);
      
      //Difference 
      Set<Integer> differenceA = new HashSet<>(setA);
      differenceA.removeAll(setB); //removeAll method removes all elements from the set/list/collection
                                  //in parentheses that are present in the existing set.
      System.out.println("A - B = " + differenceA);
      
      Set<Integer> differenceB = new HashSet(setB);
      differenceB.removeAll(setA);
      System.out.println("B - A = " + differenceB);
      
   }
}