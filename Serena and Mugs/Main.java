#include<iostream>
using namespace std;
int main()
{
  
    int nm,vc,a[100],i,sum=0;
    cin>>nm>>vc;
    for(i=0;i<nm;i++)
    {
        cin>>a[i];
    }
    for(i=0;i<nm;i++)
    {
        sum+=a[i];
    }
    if(sum<=vc)
    {
        cout<<"YES";
    }
    else
    {
        cout<<"NO";
    }
    return 0;
}