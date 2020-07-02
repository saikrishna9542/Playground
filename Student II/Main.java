#include <iostream>
#include <string.h>

using namespace std;

class Marks
{
	private:
		int rno;
		float perc;
	
	public:
		//constructor
		Marks()
		{rno = 0; perc = 0.0f;}
		
		//input roll numbers and percentage
		void readMarks(void)
		{
			cin>>rno;
			cin>>perc;
		}
		
		//print roll number and percentage
		void printMarks(void)
		{
			cout<<rno<<endl;
			cout<<perc<<"%"<<endl;
		}
};

class Student
{
	private:
		//object to Marks class
		Marks objM;
		char name[30];
	
	public:
		//input student details
		void readStudent(void)
		{
			//Input name
			cin.getline(name, 30);
			//input Marks
			objM.readMarks();			
		}
		
		//print student details
		void printStudent(void)
		{
			//print name
			cout<<name<<endl;
			//print marks
			objM.printMarks();
		}
};

//main code
int main()
{
	//create object to student class
	Student std;
	std.readStudent();
	std.printStudent();
	
	return 0;
}
