package java_4;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class remove_Duplicate {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(3);
		list.add(1);
		list.add(8);
		list.add(3);
		list.add(7);
		System.out.println(list);
		
		Set set=new LinkedHashSet();
		set.addAll(list);
		System.out.println(set);
	}
}
