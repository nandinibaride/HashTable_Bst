package hashtableandbst.com;

import java.util.HashMap;
import  java.util.Map;

public class FindFrequency {
	/*
	 * @purpose: To Find The frequency of word
	 * @return: No return value
	 * @input: "To be or not to be"
	 * @output: not 1 , be 2, or 1, To 1, to 1. 
	 */
	  public void Findfrequency() {
	      String str = "To be or not to be";

	        String [] strArray = str.split(" ");
	         Map<String,Integer> map = new HashMap<String,Integer>();

	        for (String word : strArray){
	            Integer number = map.get(word);
	            if (number == null){
	                number = 1;
	            }
	         else {
	        	 number++;
	            }
	            map.put(word,number);
	        }
	        for (Map.Entry<String, Integer> entry : map.entrySet()){
	            System.out.println(entry.getKey() + "  "+ entry.getValue());
	        }
	    }
	    public static void main(String args[]) {
		  FindFrequency freq = new FindFrequency();
		  freq.Findfrequency();
	  }
	}


