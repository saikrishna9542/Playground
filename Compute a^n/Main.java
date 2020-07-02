#include<iostream>
using namespace std;

 int power(int base, int powerRaised) 
 {
        if (powerRaised != 0)
            return (base * power(base, powerRaised - 1));
        else
            return 1;
 }
int main()
{
  int a,n;
  cout<<"Enter the value of a"<<endl;
  cin>>a;
  cout<<"Enter the value of n"<<endl;
  cin>>n;
  cout<<"The value of "<<a<<" power "<<n<<" is "<<power(a,n);
  return 0;
}