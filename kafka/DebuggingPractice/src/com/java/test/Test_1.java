package com.java.test;

/*Debugging is the routine process of locating and 
 * removing bugs, errors or abnormalities from programs.
 * a.Breakpoint:Execution pause point/Execution start point (CTRL+SHIFT+B(at given line))
 * Start debug:run menu:debug option:(F11 |FN+F11)
 * Step Over:(F6):Execute current line and go to next line
 * Inspect(CTRL+SHIFT+I):Check selected expression value
 * >select expression >rigt click>inspect
 * Stop\resume:(F8):To finish current execution.
 * Step Into:(F5):When we have called another fn in current fn and we want to debug it line by line
 * Step Return(F7):When we want to return the calling function.
 */
public class Test_1 {

	public static void main(String[] args) {
		System.out.println("start debugging");
		show();
		int a=20;
		a=a++ +  ++a - a-- + ++a - a-- + ++a;
		System.out.println(a);
		if(a>20) {
			System.out.println("valid output");
		}else {
			System.out.println("invalid output");
		}
		
		}
	public static void show() {
		System.out.println("this is from show method");
		int j=20;
		j=j++ + j-- - ++j;
		System.out.println(j);
		if(j<20) {
			System.out.println("valid input");
		}else {
			System.out.println("invalid input");
		}
	}

}
