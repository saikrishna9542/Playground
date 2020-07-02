#include<iostream>
using namespace std;
int main()
{
  int n;
      cin>>n;
        int count=0,s1=0,s2=0;
        while(n>0)
        {
           if(count%2==0)
           {
             s1=s1+(n%10);
             count++;
           }
          else
          {
             s2=s2+(n%10);
              count++;
          }
          n=n/10;
       }
       if(s1==s2)
         cout<<"Yes";
       else
        cout<<"No";
    }