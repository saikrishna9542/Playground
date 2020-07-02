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
  
  
   for(int j=0;j<c;j++)
  { int max=a[0][j];
    for(int i=0;i<r;i++)
    {
      if(a[i][j]>max)
        max=a[i][j];
    }
   cout<<max<<endl;
  }
  return 0;
}