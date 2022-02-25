import java.io.*;
import static java.lang.System.*;
import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;

class Main{
  public static void main (String str[]) throws IOException {
		
    int[] elements = {21, 17, 60, 20, 56, 12};
		System.out.println("Printing first unsorted int Array:");
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
		System.out.println("Printing second unsorted int Array:");
		
		for (int nums: elements2)
			{
				System.out.print(nums + " ");
			}

		System.out.println("\n");
		System.out.println("Printing each pass through the insertion sort:");
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

		System.out.println("Printing sorted array with insertion sort:");
    for (int num : elements2)
    {
      System.out.print(num + " ");
    }
		System.out.println("\n");

		//STEP 2

		String[] words = {"strawberry", "banana", "apple", "watermelon", "fig", "cantelope"};
		System.out.println("Printing first unsorted String Array:");
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
		System.out.println("Printing second unsorted String Array:");
		
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
			
      while (possibleIndex > 0 && temp.substring(0, 1).compareTo(words2[possibleIndex-1].substring(0, 1)) < 0 )
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

		System.out.println("Printing sorted array with insertion sort:");
    for (String num : words2)
    {
      System.out.print(num + " ");
    }
		System.out.println("\n");
		

				//SORTING ARRAYLISTS


		ArrayList<Integer> el = new ArrayList<Integer>();
		el.add(21);
		el.add(17);
		el.add(60);
		el.add(20);
		el.add(56);
		el.add(12);
		
		System.out.println("Printing first unsorted int ArrayList:");
		System.out.print(el);
		System.out.println("\n");
		System.out.println("Printing each pass through the selection sort:");
		
    //Selection Sort
    for (int j = 0; j < el.size() -1; j++)
    {
      int minIndex = j;
      for (int k = j + 1; k < el.size(); k++)
      {
        if (el.get(k)<el.get(minIndex))
        {
          minIndex = k;
        }
      }

			
      int temp = el.get(j);
			el.set(j, el.get(minIndex));
			el.set(minIndex, temp);
      
			System.out.println(el);
    }
    

		System.out.println();

		System.out.println("Printing sorted array with selection sort:");
    System.out.println(el);

		
//Insertion Sort
ArrayList<Integer> el2 = new ArrayList<Integer>();
		el2.add(21);
		el2.add(17);
		el2.add(60);
		el2.add(20);
		el2.add(56);
		el2.add(12);
		System.out.println("Printing second unsorted int ArrayList:");
		
		System.out.println(el2);

		System.out.println();

		System.out.println("Printing each pass through the insertion sort:");
    for (int j = 1; j < el2.size(); j++)
    {
      int temp = el2.get(j);
      int possibleIndex = j;
      while (possibleIndex > 0 && temp < el2.get(possibleIndex - 1))
      {
				el2.set(possibleIndex, el2.get(possibleIndex - 1));
        possibleIndex--;
        
      }
			el2.set(possibleIndex, temp);
			System.out.println(el2);
    }
		System.out.println();

		System.out.println("Printing sorted array with insertion sort:");
    System.out.println(el2);
		System.out.println();



		//STEP 2

		ArrayList<String> el3 = new ArrayList<String>();
		el3.add("strawberry");
		el3.add("banana");
		el3.add("apple");
		el3.add("watermelon");
		el3.add("fig");
		el3.add("cantelope");


		System.out.println("Printing first unsorted String ArrayList:");
		System.out.println(el3);
		
		System.out.println();
		System.out.println("Printing each pass through the selection sort:");
		
    //Selection Sort
    for (int j = 0; j < el3.size() -1; j++)
    {
      int minIndex = j;
      for (int k = j + 1; k < el2.size(); k++)
      {
				int compare = el3.get(k).substring(0, 1).compareTo(el3.get(minIndex).substring(0, 1));
        if (compare < 0)
        {
          minIndex = k;
        }
      }
      String temp = el3.get(j);
			el3.set(j, el3.get(minIndex));
      el3.set(minIndex, temp);

			System.out.println(el3);

    }
System.out.println();
		System.out.println("Printing sorted array with selection sort:");
    System.out.println(el3);
		System.out.println();


//Insertion Sort
ArrayList<String> el4 = new ArrayList<String>();
		el4.add("strawberry");
		el4.add("banana");
		el4.add("apple");
		el4.add("watermelon");
		el4.add("fig");
		el4.add("cantelope");

		System.out.println("Printing second unsorted String ArrayList:");
		
		System.out.println(el4);
		System.out.println();

		System.out.println("Printing each pass through the insertion sort");
    for (int j = 1; j < el4.size(); j++)
    {
      String temp = el4.get(j);
      int possibleIndex = j;

      while (possibleIndex > 0 && temp.substring(0, 1).compareTo(el4.get(possibleIndex-1).substring(0, 1)) < 0 )
      {
				el4.set(possibleIndex, el4.get(possibleIndex - 1));
        possibleIndex--;
        
      }
			el4.set(possibleIndex, temp);
      
			System.out.println(el4);
    }
		System.out.println();

		System.out.println("Printing sorted array with insertion sort:");
    System.out.println(el4);





		
  }
}
