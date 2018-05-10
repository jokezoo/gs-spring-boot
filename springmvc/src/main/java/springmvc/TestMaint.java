package springmvc;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.google.gson.Gson;

public class TestMaint {

	public static void main(String[] args) {
		ArrayList<String> colorList= new ArrayList<String>();
		colorList.add(null);
		colorList.add("FFFFF0");
		colorList.add("FFFFF1");
		colorList.add("FFFFF2");
		String json = new Gson().toJson(colorList);
		System.out.println("from arraylist to json: "+ json);
		ArrayList<String> colorList2 = new ArrayList<String>();
		colorList2 = new Gson().fromJson(json, ArrayList.class);
		for(String c : colorList2) {
			System.out.println("from json to arraylist: "+ c);
		}
		
	}

}
