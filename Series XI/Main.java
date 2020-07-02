#include<iostream>
using namespace std;
int main()
{
       int n ;
       cin>>n;
       double a= 95.0;
      for(int i=1;i<=n;i++)
      {
        cout<<a<<" ";
        a=a+(20.5+2*(i-1));
      }
}