/*
32.	Modify the above program (no. 30) to count 
 the no of Student objects created. 
[ In this program static variable is required ]
*/


class Student{
	private int rno;
	private String name;
	private static int count;
	
	void setData(int ro, String na)
	{
		rno = ro;
		name = na;
		countObject();
	}
	
	void countObject()
	{
		//System.out.println("in count object");
		count++;

	}
	
	int getObjCount()
	{
		return count;
	}
	
	void showData()
	{
		System.out.println("Name= "+name+ "\nRollNo= "+rno+ "\n");
		
	}
	
	
}

class StudentDataTotal{
	
	public static void main(String args[])
	{	
		Student stu = new Student();
		stu.setData(88,"Sanjit");
		stu.showData();
		
		stu.setData(87,"Sandesh");
		stu.showData();
		
		int total=stu.getObjCount();
		
		//System.out.println("In total");
		System.out.println("Total No of Object = "+total);
	}
	
	
}