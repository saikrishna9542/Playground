#include<iostream>
using namespace std;
int main()
{
  int n,a1[100],f=0,d=0,c;
 int i,j;
 cin>>n;
 for(i=0;i<n;i++)
 {
     cin>>a1[i];
 }
 for(i=0;i<n;i++)
 { c=0;
   for(j=i+1;j<n;j++)
   {
      if(a1[i]==a1[j])
      c=1;
   }
  if(c==0)
  d++;
 }
  cout<<"There are "<<d<<" distinct element in the array.";
    return 0;
}