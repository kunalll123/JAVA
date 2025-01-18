import java.util.*;

class Player implements Comparable<Player>{

	int jerNo;
	String pName;

	Player(int jerNo,String pName){
		this.jerNo=jerNo;
		this.pName=pName;
	}

	public int compareTo(Player obj){
		return pName.compareTo(obj.pName);
	}

	public String toString(){
		return "{" + jerNo +":" + pName + "}";
	}
}

class TreemapDemo{
	public static void main(String[] args){

		TreeMap tm=new TreeMap();

		Player p1=new Player(18,"Virat");
		Player p2=new Player(45,"Warner");
		Player p3=new Player(17,"ABD");
		Player p4=new Player(6,"Babar");

		tm.put(p1,"Ind");
		tm.put(p2,"Aus");
		tm.put(p3,"SA");
		tm.put(p4,"Pak");

		System.out.println(tm);
	}
}
