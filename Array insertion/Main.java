#include<iostream>
using namespace std;
int main()
{
 int n;
      cin>>n;
      int a[1000];
      for(int i=0;i<n;i++)
      {
        cin>>a[i];
      }
      int pos;
      int val;
  
  cout<<"Enter the number of elements in the array"<<endl<<
"Enter the elements in the array"<<endl<<
"Enter the location where you wish to insert an element"<<endl;
  cin>>pos;
   if(pos>=n)
   {
    cout<<"Invalid Input";
    return 0;
  }
cout<<"Enter the value to insert"<<endl;
cout<<"Array after insertion is"<<endl;
 cin>>val;
  
      for(int i=0;i<n;i++)
      {
        if(i==pos-1)
        {
           cout<<val<<endl;
        }
          cout<<a[i]<<endl;
      }
}