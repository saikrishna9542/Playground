#include<iostream>
using namespace std;
const int len=20;
class Employee
{
  private:
  	char firstName[len];
  int idNumber;
  int age;
  float salary;
  public:
  	void Enter_data(void)
  	{
    cout<<"Enter the first name = "<<"\n";
    cin>>firstName;
    cout<<"Enter the identity number = "<<"\n";
    cin>>idNumber;
    cout<<"Enter the age = "<<"\n";
    cin>>age;
    cout<<"Enter the salary = "<<"\n";
    cin>>salary;
  }
  void Display_data(void)
  {
    cout<<"Name = "<<firstName<<"\n";
    cout<<"Identity Number = "<<idNumber<<"\n";
    cout<<"Age = "<<age<<"\n";
    cout<<"Salary = "<<salary<<"\n";
  }
};
class Engineer:public Employee
{
private:
 char design[len];
 public:
 	void Enter_data()
    {
    Employee::Enter_data();
    cout<<"Enter the designation of the Engineer: "<<"\n";
    cin>>design;
    }
    void Display_data(void)
    {
    cout<<"Displaying the particulars of the Engineer"<<"\n";
    Employee::Display_data();
    cout<<"Designition = "<<design;
    }
    };
int main(void)
{
  Engineer er;
  er.Enter_data();
  er.Display_data();
  return 0;
}
    
    
    