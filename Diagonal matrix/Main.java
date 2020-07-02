#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int a[n][n];
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<n;j++)
    {
      cin>>a[i][j];
    }
  }
  int flag=1;
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<n;j++)
    {
      if(i!=j)
      {
         if(a[i][j]!=0)
         {
           flag=0;
           cout<<"No";
           return 0;
         }
       }
      }
    }//end of i loop
    if(flag==1)
      cout<<"Yes";
}