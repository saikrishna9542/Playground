#include<iostream>
using namespace std;
int main()
{
  int r,c;
  cin>>r>>c;
  int a[r][c];
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      cin>>a[i][j];
    }
  }
  int flag=1;
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
       if(a[i][j]!=a[j][i])
       {
         flag=0;
     } 
    }
   }//end of i loop
    if(flag==1)
    cout<<"Symmetric";
   else
     cout<<"Not Symmetric";
  }
  