#include<iostream>
using namespace std;
int main()
{
  int a;
  float b;
  cin>>a>>b;
  if(((b>=00.00 && b<13.30) || (b>16.30 && b<=24.00)) && a>13)
    cout<<"$8.00";
else if(((b>=00.00 && b<13.30) || (b>16.30 && b<=24.00)) && a<=13)
    cout<<"$4.00";
else if((b>=13.30 && b<=16.30) && a>13)
     cout<<"$5.00";
else if((b>=13.30 && b<=16.30)&& a<=13)
      cout<<"$2.00";
else
  cout<<"Invalid Input";
}