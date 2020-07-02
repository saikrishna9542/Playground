#include<iostream>
using namespace std;
int main()
{
  int n,m,dsum=0,psum=0;
      cin>>n>>m;
      for(int i=n;i<=m;i++)
      {
         dsum= (i%10)+(i/10);
         psum= (i%10)*(i/10);
        if(i == (psum+dsum))
           cout<<i<<endl;
    }
}