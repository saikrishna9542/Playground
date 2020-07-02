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
    cout<<"Base class constructor"<<"\n";
    cout<<"Derived class constructor"<<"\n";
    cout<<"The given input is "<<x;
    } 
}; 

int main() 
{ 
	Derived d; 
	d.fun(); 
	return 0; 
} 
