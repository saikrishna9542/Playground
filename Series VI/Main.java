#include<iostream>
using namespace std;
int main()
{
   int n;
   cin>>n;
      for(int i=1;i<=n;i++)
      { 
        if(i%2==0)
        cout<<i*i-2 <<" ";
       else
          cout<<i*i-1<<" ";
      }
}