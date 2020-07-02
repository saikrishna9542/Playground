#include<iostream>
using namespace std;
int main()
{
   int n,a1[100],c;
 int i,j,k;
cin>>n;
 for(i=0;i<n;i++)
 {
     cin>>a1[i];
 }

 for(i=0;i<n;i++)
 { 
    for(j=i+1;j<n;)
      {
          if(a1[j]==a1[i])
          {
              for(k=j;k<n;k++)
              {
                  a1[k]=a1[k+1];
              }
              n--;
          }
          else
          j++;
      }
 }
      for(i=0;i<n;i++)
      {
          cout<<a1[i]<<endl;
      }
    return 0;
}