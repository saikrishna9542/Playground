#include<iostream>
using namespace std;
int main()
{
  int x,y,z;
  string s1;
  cin>>x>>y>>z;
  cin>>s1;
   if(s1.compare("L1")== 0)
      {
        if(y<z)
          cout<<"L2";
        else
           cout<<"L3";
      }
      else if(s1.compare("L2")== 0)
      {
        if(x<z)
                    cout<<"L1";
        else
                   cout<<"L3";
      }
     else if(s1.compare("L3")== 0)
      {
        if(x<y)
                   cout<<"L1";
        else
                   cout<<"L2";
      }
  
}