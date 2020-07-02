#include<iostream>
using namespace std;
int main()
{
   int r,c,n;
  cin>>r>>c>>n;
  if( (n>r && n<=2*r) || (n>(r-2)*c && n<=(r-1)*c) )
    cout<<"It is a mango tree";
  else
    cout<<"It is not a mango tree";
}