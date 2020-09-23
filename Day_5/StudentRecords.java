/*
40.	Create a class Student having data members name, roll no.,
age and score. 
Write a program to accept 10 records of student and 
store them in an array. 
And then arrange the student records based on the score 
group [0-50], [50-65], [65-80], [80-100].
*/

import java.util.Scanner;
class Student{
	private String name;
	private int rollNo;
	private int age;
	private int score;

	Student(String name, int rollNo, int age, int score){
		this.name = name;
		this.rollNo = rollNo;
		this.age = age;
		this.score = score;
	}

	void Show(){
		System.out.println("Name: "+this.name+" Rollno: "+this.rollNo+" Age: "+this.age+" score: "+this.score);
	}

	public static Student[] sortScore( Student s[]){

		Student temp ;
		for(int i=0; i<s.length; i++){
			for(int j=i+1; j<s.length;j++)
				if(s[i].score > s[j].score){
					temp = s[i];
					s[i] = s[j];
					s[j]= temp;
				} 			
			}
		



		System.out.println("Students with score<50 are: ");
		for(int i=0; i<s.length;i++){
			if(s[i].score<50){
			s[i].Show();
			}
		}

		System.out.println("Students with score>=50 and <65 are: ");
		for(int i=0; i<s.length;i++){
			if(s[i].score>=50 && s[i].score<65){
			s[i].Show();
			}
		}
		
		System.out.println("Students with score>=65 and <80 are: ");
		for(int i=0; i<s.length;i++){
			if(s[i].score>=65 && s[i].score<80){
			s[i].Show();
			}
		}

		System.out.println("Students with score>=80 and <100 are: ");
		for(int i=0; i<s.length;i++){
			if(s[i].score>=80 && s[i].score<=100){
			s[i].Show();
			}
		}
		return s;


	}
	
	
	
}

class StudentRecords{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		Student s[] = new Student[3];

		for(int i=0; i<s.length; i++){
			System.out.print("Enter the student name: ");
			String name = sc.next();
			System.out.print("Enter the student Roll number: ");
			int rollno = sc.nextInt();
			System.out.print("Enter the student Age: ");
			int age = sc.nextInt();
			System.out.print("Enter the student's Score: ");
			int score = sc.nextInt();

			Student s1 = new Student(name, rollno, age, score);
			s[i]=s1;
			
		
		}

		for(Student st : s){
			st.Show();
		}

		 Student.sortScore(s);


		

	}
	
}
