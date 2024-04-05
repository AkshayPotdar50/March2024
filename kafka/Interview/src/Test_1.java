
public class Test_1 {
	

	public static void main(String[] args) {
		try {			
			System.out.println("First statement execution start >>");
			double p =100.0, q=0.0, d;
			d = p/q;
			System.out.println("Double outpt >>" + d);
			 System.out.println("Second statement execution start >>");
			 float x=100, y=0.0f,f;
			 f=x/y;
			System.out.println("float outpt >>" + f);
			System.out.println("Third statement execution start >>");
			System.exit(0);
			int a =100, b=0,i;
			i= a/b;
			System.out.println("int outpt >>" + i);
			} catch (Exception e) {
			System.out.println("All Exceptions will handel >>" +e);
			} finally {
			System.out.println("This is finaly block>>");
			}
		// TODO Auto-generated method stub

	}

}
