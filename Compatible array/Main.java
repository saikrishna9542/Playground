#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
      int a[n];
      int b[n];
      for(int i=0;i<n;i++)
      {
        cin>>a[i];
      }
      for(int i=0;i<n;i++)
      {
        cin>>b[i];
      }
      int flag=1;
      for(int i=0;i<n;i++)
      {
         if(a[i]<b[i])
           flag=0;
      }
      if(flag==1)
        cout<<"Compatible";
      else
        cout<<"Incompatible";
    }
