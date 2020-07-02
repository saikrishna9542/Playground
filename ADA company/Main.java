#include <iostream> 
#include <stdexcept> 

using namespace std; 


class Exception : public runtime_error { 
public: 
	Exception() 
		: runtime_error("first round not cleared\n") 
	{ 
	} 
};
int main() 
{ 
	float num; 
     cin>>num;
	try { 
      if (num<=50) 
      {
		throw Exception(); 
      }
      else
      {
		cout<<"first round cleared"<<"\n";
		cout << "eligible for second round"<< endl; 
      }
	} 
	catch (Exception& e) { 
		cout << "first round not cleared" << endl ;
			//<< e.what(); 
	} 

} 
