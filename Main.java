import java.io.*;
import static java.lang.System.*;
import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;

class Main{
  public static void main (String str[]) throws IOException {
		
    int[] elements = {21, 17, 60, 20, 56, 12};
		System.out.println("Printing unsorted int Array:");
		for (int nums: elements)
			{
				System.out.print(nums + " ");
			}
		System.out.println("\n");
		System.out.println("Printing each pass through the selection sort:");
		
    //Selection Sort
    for (int j = 0; j < elements.length -1; j++)
    {
      int minIndex = j;
      for (int k = j + 1; k < elements.length; k++)
      {
        if (elements[k] < elements[minIndex])
        {
          minIndex = k;
        }
      }
      int temp = elements[j];
      elements[j] = elements[minIndex];
      elements[minIndex] = temp;
			for (int num : elements)
    {
      System.out.print(num + " ");
    }
		System.out.println();
    }
		System.out.println();

		System.out.println("Printing sorted array with selection sort:");
    for (int num : elements)
    {
      System.out.print(num + " ");
    }
		System.out.println("\n");

//Insertion Sort
int[] elements2 = {21, 17, 60, 20, 56, 12};
		System.out.println("Printing unsorted int Array");
		
		for (int nums: elements2)
			{
				System.out.print(nums + " ");
			}

		System.out.println("\n");
		System.out.println("Printing each pass through the insertion sort");
    for (int j = 1; j < elements2.length; j++)
    {
      int temp = elements2[j];
      int possibleIndex = j;
      while (possibleIndex > 0 && temp < elements2[possibleIndex - 1])
      {
        elements2[possibleIndex] = elements2[possibleIndex - 1];
        possibleIndex--;
        
      }
      elements2[possibleIndex] = temp;
			for (int num : elements2)
  	  {
 	     System.out.print(num + " ");
 	    }
		System.out.println();
    }
		System.out.println();

		System.out.println("Printing sorted array with insertion sort");
    for (int num : elements2)
    {
      System.out.print(num + " ");
    }
		System.out.println("\n");

		//STEP 2

		String[] words = {"strawberry", "banana", "apple", "watermelon", "fig", "cantelope"};
		System.out.println("Printing unsorted String Array:");
		for (String word: words)
			{
				System.out.print(word + " ");
			}
		
		System.out.println("\n");
		System.out.println("Printing each pass through the selection sort:");
		
    //Selection Sort
    for (int j = 0; j < words.length -1; j++)
    {
      int minIndex = j;
      for (int k = j + 1; k < words.length; k++)
      {
				int compare = words[k].substring(0, 1).compareTo(words[minIndex].substring(0, 1));
        if (compare < 0)
        {
          minIndex = k;
        }
      }
      String temp = words[j];
      words[j] = words[minIndex];
      words[minIndex] = temp;
			for (String num : words)
    {
      System.out.print(num + " ");
    }
		System.out.println();
    }
System.out.println();
		System.out.println("Printing sorted array with selection sort:");
    for (String num : words)
    {
      System.out.print(num + " ");
    }
		System.out.println("\n");

//Insertion Sort
String[] words2 = {"strawberry", "banana", "apple", "watermelon", "fig", "cantelope"};
		System.out.println("Printing unsorted int Array");
		
		for (String nums: words2)
			{
				System.out.print(nums + " ");
			}

		System.out.println("\n");
		System.out.println("Printing each pass through the insertion sort");
    for (int j = 1; j < words2.length; j++)
    {
      String temp = words2[j];
      int possibleIndex = j;
			
      while (possibleIndex > 0 && temp.substring(0, 1).compareTo(words2[possibleIndex-1].substring(0, 1)) > 0 )
      {
        words2[possibleIndex] = words2[possibleIndex - 1];
        possibleIndex--;
        
      }
      words2[possibleIndex] = temp;
			for (String num : words2)
  	  {
 	     System.out.print(num + " ");
 	    }
		System.out.println();
    }
		System.out.println();

		System.out.println("Printing sorted array with insertion sort");
    for (String num : words2)
    {
      System.out.print(num + " ");
    }
		System.out.println("\n");
		









		
  }
}
