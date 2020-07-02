#include<iostream>
using namespace std;
int main()
{
   int n,m;
  cin>>n>>m;
  cout<<"Enter n"<<endl;
  cout<<"Enter m"<<endl;
  cout<<"The multiplication table of "<<n<<" is"<<endl;
        for(int i=1;i<=m;i++)
        {
          cout<<i<<"*"<<n<<"="<<n*i<<endl;
        }
   }