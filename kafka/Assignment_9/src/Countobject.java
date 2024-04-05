public class Countobject  
{  
//variable to keep track of objects  
private static int count;  
//constructor of the class  
public Countobject()   
{  
// increase the count variable by 1  
count++;  
}  
public static void main(String args[])   
{  
//creating objects  
Countobject ob1 = new Countobject();  
Countobject ob2 = new Countobject();  
Countobject ob3 = new Countobject();  
Countobject ob4 = new Countobject();  
Countobject ob5 = new Countobject();
Countobject ob6 = new Countobject();  
Countobject ob7 = new Countobject();  
Countobject ob8 = new Countobject();  
Countobject ob9 = new Countobject();  
Countobject ob10 = new Countobject(); 
//prints number of objects  
System.out.print("Total Number of Objects: " + Countobject.count);  
}  
}  
