#include <iostream> 
using namespace std; 

int main() 
{ 
int x ; 

// Some code 
try { 
  cin>>x;
	if (x < 0) 
	{ 
		throw x; 
	} 
} 
catch (int x ) { 
	cout<<"Exception Caught as "<<x; 
} 

return 0; 
} 
