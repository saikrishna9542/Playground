#include<iostream>
using namespace std;
   int count(int n)
    {
       
        if(n == 0)
        {
            return 0;
        }
        else
        {
          return count(n/10)+1;
        }
   }
int main()
{
  int n;
  cout<<"Enter the value of n"<<endl;
  cin>>n;
  cout<<"The number of digits in "<<n<<" is "<<count(n);
  return 0;
}