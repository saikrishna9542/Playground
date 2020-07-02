#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int a=6,b=1;
      for(int i=1;i<=n;i++)
      {
        cout<<a<<" ";
        a=a+5*i;
      }
}