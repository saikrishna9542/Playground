#include <iostream> 
using namespace std; 
class Parent 
{
  public: 
  char son[20];
  char father[20];
  char grandp[20];
}; 
int main() 
{ 
	
		Parent obj1; 
		
		// An object of class child has all data members 
		// and member functions of class parent 
		obj1.son; 
		obj1.father;
  		obj1.grandp;
		cout<<"Enter the son name:"<<"\n"; 
		cout<<"Enter the father name:"<<"\n";
  		cout<<"Enter the grand parent name:";
		
		return 0; 
} 
