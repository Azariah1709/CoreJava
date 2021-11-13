package com.variable.arguments;

public class VariableArguments {

	
    static void displayPassengers(int a, String ...str)
    {
        System.out.println("Airplane No " + a);
        System.out.println("Number of arguments is: "+ str.length);
  
        
        for (String i: str)
            System.out.print(i + " ");
  
        System.out.println();
    }
  
    public static void main(String args[])
    {
    	displayPassengers(1,"Rama","laxama","Bharatha","Bau");
    	
    	String[] passengers = {"Ravana","RishiBana","Kumbhakarna","Shoorpanakha"};
    	
    	displayPassengers(1,passengers);
    	
       
    }


}
