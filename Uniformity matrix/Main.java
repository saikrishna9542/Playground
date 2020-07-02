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
  }//input
  int ec=0,oc=0;
  
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<n;j++)
    {
      if(a[i][j] %2 == 0)
        ec++;
      else
        oc++;
    }
  }//end of logic
  
  if(ec==(n*n) || oc==(n*n))
    cout<<"Yes";
  else
  cout<<"No";
 return 0;
}
  