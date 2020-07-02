#include<iostream>
using namespace std;
int main()
{
 int r,c,n;
 cin>>r>>c>>n;
   if(n<=r || n%r==1 ||( n>(r-1)*c && n<= (r*c) ) )
        cout<<"Yes";
      else
        cout<<"No";
  //Type your code here.
}