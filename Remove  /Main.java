#include<iostream>
#include<string>
using namespace std;
int main()
{
  string s1;
  getline(cin,s1);
  for(int i=0;i<s1.size();i++)
  {
     if(s1[i]=='t')
     {
            if(s1[i+1]=='h' && s1[i+2]=='e')
            {
              i=i+4;
            }
     }
    cout<<s1[i];
  }
  return 0;
}