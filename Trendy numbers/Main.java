#include<iostream>
using namespace std;
int main()
{
   int n,mid;
    cin>>n;
int count=0;
int copy=n;
while(copy>0)
{
  copy=copy/10;
  count=count+1;
}
if(count==3)
{
    mid= (n/10)%10;
  if(mid%3==0)
   cout<<"Trendy Number";
  else
    cout<<"Not a Trendy Number";
}   
else
{
  cout<<"Not a Trendy Number";    
}
}