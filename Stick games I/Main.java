#include<iostream>
using namespace std;
int main()
{
   int  n,m,x;
    cin>>n>>m;
    if(n<m)
    {
        x=n;
    }
    else
    {
        x=m;
    }
    if(x%2==0)
    {
        cout<<"Mani Iyer";
    }
    else
    {
        cout<<"Arun Gupta";
    }
    return 0;
}