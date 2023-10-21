package com.org.epam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EPAMJavaTest {
	
	public static void main(String[] args) {
		
		List<Integer> numbers=new ArrayList<>();
		Collections.addAll(numbers, 5,6,8,9);
		numbers.forEach(e->System.out.println(e*e));
		numbers.stream().map(e->e*e).forEach(System.out::println);
		
		String str="mississipi";
		
		Arrays.stream(str.split(""))
		       .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		       .entrySet()
		       .stream()
		       .filter(e->e.getKey().equalsIgnoreCase("i")).forEach(e->System.out.print(e));
	
	System.out.println("");
	String inputString="Shiva is thinking";	
	System.out.println(getStringWithEachWordByReversing(inputString));	
	
	Map<String,Integer> map=new LinkedHashMap<>();
	map.put("Hindi", 10);
	map.put("Kannda", 20);
	map.put("Telugu", 30);
	
	for(Map.Entry<String, Integer> entry:map.entrySet())
		   System.out.println(entry.getKey()+" "+entry.getValue());
		
	}

	private static String getStringWithEachWordByReversing(String inputString) {

		String words[]=inputString.split(" ");
		
		String outputString="";
		
        for(String temp:words)
        {
        	for(int i=temp.length()-1;i>=0;i--)
        	{
        		outputString=outputString+temp.charAt(i);
        	}
        	outputString=outputString+" ";
        }
		
		return outputString;
	}

}
