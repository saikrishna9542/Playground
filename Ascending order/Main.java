#include<iostream>
using namespace std;
int main()
{
  int n,a1[100];
 int i,t,j;
 cin>>n;
 for(i=0;i<n;i++)
 {
     cin>>a1[i];
 }
 for(i=0;i<n;i++)
 {
     for(j=i+1;j<n;j++)
     {
         if(a1[i]>a1[j])
         {
             t=a1[i];
             a1[i]=a1[j];
             a1[j]=t;
         }
     }
 }
 cout<<"Sorted array is:\n";
 for(i=0;i<n;i++)
 {
     cout<<a1[i]<<endl;
 }
    //fill the code;
    return 0;
}