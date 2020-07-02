#include<iostream>
using namespace std;
int main()
{
 int n;
     cin>>n;
      int a=5;int x=1;
        for(int i=1;i<=n;i++)
        {
          cout<<a<<" ";
          a=a+(11*x);
          x=x+2;
        }
}