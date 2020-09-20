/*
31.	Create a class Student with 2 data members rno and name.
Create one method setData() that takes roll number and student name
as parameter and stores them in data members rno and name. 
Create one more method showData() to print the data member values. 
Create another class ( main class) StudentDemo that creates Student 
class object and calls setData() and showData() methods.
*/


class Student{
	private int rno;
	private String name;
	
	void setData(int ro, String na)
	{
		rno = ro;
		name = na;
	}
	
	void showData()
	{
		System.out.println("Name= "+name+ "\nRollNo= "+rno+ "\n");
	}
	
	
	
}
class StudentData{
	
	public static void main(String args[])
	{	
		Student stu = new Student();
		stu.setData(88,"Sanjit");
		stu.showData();
		
		stu.setData(87,"Sandesh");
		stu.showData();
	}
}