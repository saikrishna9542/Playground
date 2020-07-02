#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int x1,y1,r1,x2,y2,r2;
  cin>>x1>>y1>>r1>>x2>>y2>>r2;
  int d=((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
  int d1=sqrt(d) ;
  int  d2=r1+r2;
if(d1==d2)
  cout<<"Tangential";
else if(d1>d2)
   cout<<"Do not Overlap";
else
  cout<<"Overlap";
}