#include<iostream>
using namespace std;
int main()
{
  int x,y,z,n;
  cin>>x>>y>>z>>n;
   int count=0;
       if(x>=n)
         count++;
        if(y>=n)
         count++;
        if(z>=n)
         count++;
     cout<<count;
  //Type your code here.
}