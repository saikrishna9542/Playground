#include <iostream>
using namespace std;
class student
{
	private:
		char  name[30];
		int   rollNo;
		int   total;
		float perc;
	public:
		void getDetails(void);
		void putDetails(void);
};
void student::getDetails(void){
	cout <<"Enter name:"<<"\n";
	cin >> name;
	cout <<"Enter roll number:"<<"\n";
	cin >> rollNo;
	cout <<"Enter total marks outof 500:"<<"\n";
	cin >> total;
	
	perc=(float)total/500*100;
}
void student::putDetails(void){
	cout <<"Student details:\n";
	cout <<"Name: "<< name<<"\n"<<"Roll Number: "<< rollNo<<"\n"<<"Total: "<<total<<"\n"<<"Percentage: " << perc;
}

int main()
{
	student std;		//object creation
	
	std.getDetails();
	std.putDetails();
	
	return 0;
}
