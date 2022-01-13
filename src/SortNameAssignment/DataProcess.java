package SortNameAssignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class DataProcess {

	public ArrayList<String> readFile()
	{
		ArrayList<String> listName = new ArrayList<String>();
		try {
			String path = System.getProperty("user.dir");
			String SEPARATOR = System.getProperty("file.separator");

			Scanner scanner = new Scanner(new File(path + SEPARATOR + "sortname.txt"));

			while (scanner.hasNextLine()) {
				String s=scanner.nextLine();
				if(!s.contains(",")) 
					continue;
                listName.add(s);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return listName;
	}
	public static void writeFile(ArrayList<String> al) throws IOException
	{
		String path = System.getProperty("user.dir");
		String SEPARATOR = System.getProperty("file.separator");
		FileWriter fileWriter = new FileWriter(path + SEPARATOR + "names-sorted.txt");
		PrintWriter printWriter = new PrintWriter(fileWriter);
		for (String str: al) {
			printWriter.println(str);
		}
		printWriter.close();
	}
}
