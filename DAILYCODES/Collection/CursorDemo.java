import java.util.*;

class CursorDemo extends Vector{
	public static void main(String[] args){

		CursorDemo v=new CursorDemo();

		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);

		Enumeration cursor = v.Elements();

		while(cursor.hasMoreElements()){
			System.out.println(cursor.nextElement());
		}
	}
}
