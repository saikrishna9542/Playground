#include <iostream> 
#include <stdexcept> 

using namespace std; 


class Exception : public runtime_error { 
public: 
	Exception() 
		: runtime_error("Exception: Division by zero\n") 
	{ 
	} 
}; 

float Division(float num, float den) 
{ 

	
	if (den == 0) 
		throw Exception(); 

	return (num / den); 

} 

int main() 
{ 
	float numerator, denominator, result; 
	numerator ; 
	denominator ; 

	try { 
      cin>>numerator;
      cin>>denominator;
		result = Division(numerator, denominator); 
		cout<<"Enter two numbers:"<<"\n";
		cout << "a/b "<<"= " << result << endl; 
	} 

	
	catch (Exception& e) { 

		
		cout << "Enter two numbers:" << endl 
			<< e.what(); 
	} 

} 
