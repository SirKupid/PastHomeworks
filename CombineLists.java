package Homework10;
import java.util.*;
public class CombineLists extends RemoveDuplicates{
	public static ArrayList<Integer> union(ArrayList<Integer> one, ArrayList<Integer> two){
		//creates new ArrayList
		ArrayList<Integer> list = new ArrayList<Integer>();
		//adds the first list to new list
		for(int i = 0; i < one.size(); i++) {
			list.add(one.get(i));
		}
		//adds second list to new list
		for(int i = 0; i < two.size(); i++) {
			list.add(two.get(i));
		}
		//removes any duplicates by calling method from removeDuplicates class
		removeDuplicates(list);
		return list;
	}
	
}
