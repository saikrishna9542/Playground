#include<iostream>
using namespace std;
int main()
{
  string s1;
  cin>>s1;
  cout<<"The output string is ";
  for(int i=0;i<s1.size();i++)
  {
    if(s1[i]>='A' && s1[i]<='Z')
        cout<<char(s1[i]+32);
    else
      cout<<s1[i];
  }
}