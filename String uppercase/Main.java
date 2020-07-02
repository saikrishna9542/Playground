#include<iostream>
using namespace std;
int main()
{
  string s1;
  cin>>s1;
  cout<<"String in uppercase is ";
  for(int i=0;i<s1.size();i++)
    cout<<char(s1[i]-32);
}