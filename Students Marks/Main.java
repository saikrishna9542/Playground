#include <iostream>
using namespace std;
#define MAX 10
class student
{
  private:
        int rollNo;
  		int sub1;
  		int sub2;
        int total;
  public:
        void getDetails(void);
        void putDetails(void);
};
 
void student::getDetails(void)
{
    cin >> rollNo;
    cin >>sub1;
    cin >>sub2;
    total=sub1+sub2;
  cin>>total;
}
 
void student::putDetails(void){
    cout<<"Roll Number Is:"<<"\n"<<rollNo<<"\n";
  	cout<<"Subject 1:"<<sub1<<"\n";
    cout<<"Subject 2:"<<sub2<<"\n";
	cout<<"Total:" << total;
}
 
int main()
{
    student stud;
  	stud.getDetails();
    stud.putDetails();
    return 0;
}