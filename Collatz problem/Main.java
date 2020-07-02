#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  
  int count=0;
         cout<<n<<endl;
while(1)
{
  if(n==1)
    break;
  else if(n%2==0)
  {
    n=n/2;
    cout<<n<<endl;
    count=count+1;
  }
  else
  {
    n= 3*n+1;
      cout<<n<<endl;
    count=count+1;
  }
}
  cout<<count<<endl;
}