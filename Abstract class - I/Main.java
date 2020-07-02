#include<iostream> 
using namespace std; 
class Base 
{ 
  private:
	int x; 
  public: 
	int fun() 
    {
       cin>>x; 
    } 
}; 

// This class inherits from Base and implements fun() 
class Derived: public Base 
{ 
	int x; 
public: 
	void fun() { 
    cin>>x;
    cout <<"Rectangle"<<"\n"<<"The given input is "<<x<<"\n";
    cout<<"Circle"<<"\n"<<"The given input is "<<x;
    } 
}; 

int main() 
{ 
	Derived d; 
	d.fun(); 
	return 0; 
} 
