package com.commandline.arguments;

import java.util.Arrays;

public class CommandLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[args.length];
		
	
		for(int i=0;i<args.length;i++) {
			arr[i]=Integer.parseInt(args[i]);
			
		}
		
		Arrays.sort(arr);
		
//		for(int i=0;i<arr.length;i++)     
//        {
//            for(int j=i+1;j<arr.length;j++)    
//            {
//                if(arr[i]<arr[j])     
//                {
//                    int temp=arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//                }
//            }
//        }
        
        System.out.println("Second Smallest element is "+arr[1]);   //Display second largest element.
        System.out.println("Second Largest element is  "+arr[args.length-2]);  //Display second smallest element.

	}

}
