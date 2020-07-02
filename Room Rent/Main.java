#include <iostream>
using namespace std;
#define MAX 10
class rent
{
  private:
        int tamount;
  		int rsalary;
  		int ssalary;
  public:
        void getDetails(void);
        void putDetails(void);
};
 
void rent::getDetails(void)
{
    cin >>tamount;
    cin >>rsalary;
    cin >>ssalary;
}
 
void rent::putDetails(void){
    cout<<"The total amount of the rent is :"<<"\n";
  	cout<<"Remaining money from Ram's salary:"<<"\n";
  	cout<<"Remaining money from Sathish's salary:"<<"\n";
  	cout<<"To pay the rent amount they need to arrange : "<<tamount-(rsalary+ssalary)<<"Rs";
}
 
int main()
{
    rent r;
  	r.getDetails();
    r.putDetails();

  
    return 0;
}