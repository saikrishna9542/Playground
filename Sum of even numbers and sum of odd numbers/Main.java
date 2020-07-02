#include<iostream>
using namespace std;
int main()
{
   int n;
  cin>>n;
      int a[n];
      for(int i=0;i<n;i++)
      {
        cin>>a[i];
      }
      int ecount=0,ocount=0;
      for(int i=0;i<n;i++)
      { 
          if(a[i]%2==0)
            ecount=ecount+a[i];
          else
            ocount=ocount+a[i];
      }
      cout<<"The sum of the even numbers in the array is "<<ecount<<endl;
      cout<<"The sum of the odd numbers in the array is "<<ocount<<endl;
    }


  