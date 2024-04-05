package com.string.duplicate;
import java.util.Arrays;   

//Creating RemoveDuplicatesExample1 class  
public class Example_1    
{   
//Creating removeDuplicates() method to remove duplicates from array  
static void removeDuplicate(char str[], int length)   
{   
    //Creating index variable to use it as index in the modified string   
    int index = 0;   

    // Traversing character array  
    for (int i = 0; i < length; i++)   
    {   
          
        // Check whether str[i] is present before or not   
        int j;   
        for (j = 0; j < i; j++)    
        {   
            if (str[i] == str[j])   
            {   
                break;   
            }   
        }   

        // If the character is not present before, add it to resulting string   
        if (j == i)    
        {   
            str[index++] = str[i];   
        }   
    }   
    System.out.println(String.valueOf(Arrays.copyOf(str, index)));   
}   

  }  