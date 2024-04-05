package com.java.except;

import java.io.FileOutputStream;

/*In Java, the try-with-resources statement is a try statement that 
 * declares one or more resources. The resource is as an object 
 * that must be closed after finishing the program. The try-with-resources
 *  statement ensures that each resource is closed at the end of the statement execution.
You can pass any object that implements java.lang.AutoCloseable, 
which includes all objects which implement java.io.Closeable.
The following example writes a string into a file. It uses an instance
 of FileOutputStream to write data into the file. FileOutputStream is a resource that must
  be closed after the program is finished with it. So, in this example, closing of resource 
  is done by itself try.
 * */

public class TryWithResources {    
public static void main(String args[]){      
        // Using try-with-resources  
try(FileOutputStream fileOutputStream =new FileOutputStream("C://Users//potda//Desktop//storeObject.txt")){      
String msg = "This is test messge for try with resources";      
byte byteArray[] = msg.getBytes(); //converting string into byte array      
fileOutputStream.write(byteArray);  
System.out.println("Message written to file successfuly!");      
}catch(Exception exception){  
       System.out.println(exception);  
}      
}      
}    
