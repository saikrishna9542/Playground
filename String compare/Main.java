#include<iostream>
using namespace std;
int main()
{
  string s1,s2;
  cin>>s1>>s2;
  if(s1.compare(s2)==0)
    cout<<"Strings are same";
  else
    cout<<"Strings are not same";
}