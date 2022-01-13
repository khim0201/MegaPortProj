package SortNameAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortName {
	public ArrayList<String> sortName(ArrayList<String> al) {
		Collections.sort(al, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				o1=o1.toUpperCase();
				o2=o2.toUpperCase();
				String[] split1 = o1.split(",");
				String[] split2 = o2.split(",");
				String lastName1 = split1[0];
				String lastName2 = split2[0];
				String firstName1=split1[1];
				String firstName2=split2[1];
				if (lastName1.compareTo(lastName2) > 0) {
					return 1;
				} else if(lastName1.equals(lastName2)){
					if(firstName1.compareTo(firstName2)>0)
					return 1;
					else return -1;
				}
				return -1;
			}
		});
		return al;
	}

}
