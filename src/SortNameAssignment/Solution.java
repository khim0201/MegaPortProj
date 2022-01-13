package SortNameAssignment;

import java.io.IOException;
import java.util.ArrayList;

public class Solution {
	public static void main (String[] args) throws IOException
	{
		DataProcess dataprocess=new DataProcess();
		SortName sortname=new SortName();
		ArrayList <String> InputNameList=new ArrayList<>();
		InputNameList=dataprocess.readFile();
		InputNameList=sortname.sortName(InputNameList);
		dataprocess.writeFile(InputNameList);	
	}
}

