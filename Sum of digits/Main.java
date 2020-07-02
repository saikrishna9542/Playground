#include<iostream>
using namespace std;
 int add(int n)
    {
        int sum = n % 10;
        if(n == 0)
        {
            return 0;
        }
        else
        {
             return sum + add(n / 10);
        }  
   }
int main()
{
  int n;
  cout<<"Enter the value of n"<<endl;
  cin>>n;
  cout<<"The sum of digits in "<<n<<" is "<<add(n);
  return 0;
}