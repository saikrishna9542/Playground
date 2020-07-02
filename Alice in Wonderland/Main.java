#include<iostream>
using namespace std;
int main()
{
  int n,sum=0;
  cin>>n;
  while(n!=0)
  {
    sum=sum+(n%10);
    n=n/10;
  }
  cout<<"Alice must go in path-"<<sum;
  //Type your code here.
}