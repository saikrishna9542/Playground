#include<iostream>
using namespace std;
  int fibonacciRecursion(int n){
	if(n == 1){
		return 0;
	}
	if(n == 2 || n == 3){
			return 1;
		}
	return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
	}
int main()
{
  int n;
  cout<<"Enter the value of n"<<endl;
  cin>>n;
  cout<<"The term "<<n<<" in the fibonacci series is "<<fibonacciRecursion(n);
  return 0;
}