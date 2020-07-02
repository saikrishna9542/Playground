#include<iostream>
#include<cmath>
using namespace std;
int main()
{
          int n;
          cin>>n;
int count=0,sq=n*n,copy=sq;
while(copy>0)
{     
  count=count+1;
  copy=copy/10;
} 
if(count>2)
{
  int n1= sq/ (int)(pow(10,(count-2)));
  int n2= sq% (int)(pow(10,(count-2)));
  int sum= n1+n2;
  if(sum==n)
    cout<<"Kaprekar Number";
  else
    cout<<"Not a Kaprekar Number";
}
else
  {
    int sum1= (sq/10)+(sq%10);
    if(sum1==n)
     cout<<"Kaprekar Number";
    else
       cout<<"Not a Kaprekar Number";
   }
}