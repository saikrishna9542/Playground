#include<iostream>
using namespace std;
int main()
{
  int w,a,b;
  cin>>w>>a>>b;
  int n= 75*a+30*b;
  if(w>=n)
    cout<<"Boat is stable";
  else
    cout<<"Boat will drow";
}