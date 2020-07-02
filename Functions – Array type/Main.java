#include<iostream>
using namespace std;
 void sai(int a[], int n);
int main()
{
     int n;
     cin>>n;
    int a[n];
    cout<<"Enter the number of elements in the array"<<endl<<
           "Enter the elements in the array"<<endl;
    for(int i=0;i<n;i++)
    {
      cin>>a[i];
    }
    sai(a,n);
  }
  void sai(int a[], int n)
  { 
    int ec=0,oc=0;
    for(int i=0;i<n;i++)
    {
      if(a[i]%2==0)
        ec++;
      else
        oc++;
    }
    if(ec==n)
      cout<<"The array is Even";
    else if(oc==n)
       cout<<"The array is Odd";
    else
         cout<<"The array is Mixed";
 }
  