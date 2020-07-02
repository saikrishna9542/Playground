#include<iostream>
using namespace std;
int main()
{
int target,n;
  cin>>target;
int sum=0,count=0;
while(1)
{
  cin>>n;
  count=count+1;
  sum=sum+n;
  if(sum>= target)
  {
    cout<<"The number of turns is "<<count;
    break;
   }
}
}