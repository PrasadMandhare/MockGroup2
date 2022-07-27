package Stringmethods;

public class test1 {
	public static void main(String[] args) {
		
		String s1 ="velocity";
		String s2 = "VELOCITY";
		String s3 = "CITY";
		String s4 = "";
		
		System.out.println(s1.charAt(2));          //show the index no char
		System.out.println(s2.replace("V", "C"));  //replace the char
		System.out.println(s4.isEmpty());        //show the string empty or not in true and false
		System.out.println(s1.concat(s2));      //join the both string
		System.out.println(s1.substring(4));    //print from index 4
		System.out.println(s2.substring(2, 5)); //print bet length and index
		System.out.println(s2.endsWith("TY"));  //show the result in true and false
		System.out.println(s1.startsWith("v"));  //show the result in true and false
		System.out.println(s3.lastIndexOf("t"));   //show the last index no
		System.out.println(s3.indexOf("t"));      //show the first index no
		System.out.println(s1.contains(s3));      //check the contains in 1 & 3 
		System.out.println(s1.equals(s2));       //check both strings are same or not
		System.out.println(s1.equalsIgnoreCase(s2));  //check both strings are same or not but ignore case
		System.out.println(s1.length());              //show the length(index no)
		System.out.println(s1.toUpperCase());         //convert from lower to upper
		System.out.println(s2.toLowerCase());      //upper to lower
		System.out.println(s2.matches(s1));        //both strings are same or not
		System.out.println(s2.replaceAll(s3, s1));  //same content from s2&s3 replace by s1
		}

}
