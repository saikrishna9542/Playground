#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int t1=0,t2=1,count=0,t3;
for(int i=1;i<=n;i++)
{
  count=count+1;
   if(count==n)
     cout<<t1;
  t3=t1+t2;
  t1=t2;
  t2=t3;
} 
}