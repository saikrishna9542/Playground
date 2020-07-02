#include<iostream>
#include<algorithm>
using namespace std;
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
     sort(a,a+n);
     cout<<"The range of the array is "<<( a[n-1]-a[0] );
}