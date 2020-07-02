#include<iostream>
using namespace std;
int main()
{
  int n,sum=0,copy;
  cin>>n;
  int a[n][n];
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<n;j++)
    {
      cin>>a[i][j];
    }
  }// input
  
  for(int i=0;i<n;i++)
  { sum=0;
    for(int j=0;j<n;j++)
    {
     sum=sum+a[i][j]; 
    }
    if(i==0)
      copy=sum;
   else if(sum!=copy)
    {
     cout<<"No";
     return 0;
    }
  }//sum of each row
  
  for(int j=0;j<n;j++)
  {  sum=0;
    for(int i=0;i<n;i++)
    {
      sum=sum+a[i][j];
    }
   if(sum!=copy)
   {
     cout<<"No";
     return 0;
   }
  }//sum of columns
  int sum1=0;
  sum=0;
  for(int i=0;i<n;i++)
  { 
    for(int j=0;j<n;j++)
    {
     if(i==j)
       sum=sum+a[i][j];
      if(i+j==n)
        sum1=sum1+a[i][j];
    }
  }
   
   if(sum!=copy && sum1!=copy)
     cout<<"No";
  else
    cout<<"Yes";
     
}