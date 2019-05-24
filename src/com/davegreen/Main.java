package com.davegreen;

import java.util.Arrays;
import java.util.Scanner;

public class Main
{

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
	    int[] intArrayList = getIntegers(5);
	    int[] sortedArrayNumbers = sortIntegers(intArrayList);
	    printArray(sortedArrayNumbers);
    }

    public static int[] getIntegers(int number)                                                 // This is the getIntegers method that is the value of the variable myIntegers, this then
    {                                                                                           // initially prompts the user to enter x integer values based on the argument that was passed when calling
        System.out.println("Enter " + number + " integer values.\r");                           // the getIntegers method above when setting the myIntegers variable, this then declares a local variable of
        int[] values = new int[number];                                                         // int[] array type called values and sets it to the parameter number.

        for(int i = 0; i < values.length; i ++)                                                 // This for loop then cycles through the amount of times passed as the argument in the getIntegers()
        {                                                                                       // waiting on a new value to be input each time until the termination condition is met which as stated above
            values[i] = scanner.nextInt();                                                      // would be the number passed as the argument.
        }

        return values;                                                                          // This then returns back to where it was called and continues to run the next line of code.
    }

    public static void printArray(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] unsortedArray)           // This is an algorithm to sort the numbers in descending numerical
    {                                                               // order i.e. highest value to lowest value.
        //int[] sortedArray = new int[unsortedArray.length];          // Here we declare a new int[] array variable called sortedArray and we set it to the value
        //for(int i = 0; i < unsortedArray.length; i ++)              // of the unsortedArray length, bearing in mind the unsortedArray will be the argument passed
        //{                                                           // to the parameter when the method sortIntegers is called.
        //    sortedArray[i] = unsortedArray[i];                      // Here we then declare within the for loop another array variable called sortedArray with the array value of
        //}                                                           // whatever iteration the for loop is on, we then set that to the value of unsortedArray, again with the array
                                                                    // value being whatever iteration the for loop is on.

        int[] sortedArray = Arrays.copyOf(unsortedArray, unsortedArray.length);             // This is an alternative method that can be used instead of the for loop above as a means of copying over
                                                                                            // the unsortedArray into a variable called sortedArray, it is a built-in Java function.
        boolean flag = true;
        int temp;

        while(flag == true)                                         // This is the main algorithm that sorts the numbers into descending numerical order.
        {                                                           // We initially declare a while loop with a boolean variable "flag" set to true, this could have also
            flag = false;                                           // been written as, while(flag), and had the same return of true, immediately in the while loop we set the flag back
            for(int i = 0; i < sortedArray.length - 1; i ++)        // to false, we then proceed into the for loop to check each element and its value starting at element zero and then
            {                                                       // eventually terminating at whatever the sortedArray length is minus one, we have to have that as the termination condition
                if(sortedArray[i] < sortedArray[i + 1])             // as when checking the condition within the if statement we are saying that if the value assigned to the sortedArray[at this element value]
                {                                                   // < is less than the value assigned to the sortedArray[element value plus one, i.e. the next element], then run the code block,
                    temp = sortedArray[i];                          // the code block then simply stores the value that was assigned to sortedArray[i] element value into a temp variable called "temp",
                    sortedArray[i] = sortedArray[i + 1];            // we then swap the values that were assigned to each element over with the code "sortedArray[i] = sortedArray[i + 1];", which does the first swap
                    sortedArray[i + 1] = temp;                      // then we say that the higher assigned value is to be placed into the temp variable thereby now being where the original assigned
                    flag = true;                                    // value was.
                }                                                   // We then set the flag back to true and continue iterating around the for loop checking the if condition each time until the for loops
            }                                                       // termination condition is met, at this point we exit the for loop back into the while loop, at the moment it is irrelevant if the
        }                                                           // flag is still set to true with possibly that the last code being executed was that within the if statements code block as the next iteration
        return sortedArray;                                         // around the while loop will reset the flag back to false, how we get out of the while loop is as such, with the flag being set back to
    }                                                               // false during the beginning of each while loop iteration the program then continues on into the for loop AGAIN, the difference eventually
                                                                    // though is that with all the numbers now in descending numerical order the if statements condition will never return true and so therefore
                                                                    // the subsequent code block will never be run and thus never resetting the flag back to true, at this stage once the for loop has met its
                                                                    // termination condition again we exit the for loop having never reset the flag back to true and because at this stage we return once again to the
                                                                    // while loop we then check the while loops condition which at this stage will now return false, it is here we exit the while loop and return
                                                                    // sortedArray back to the method that called it.









}
