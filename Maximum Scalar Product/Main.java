#include<iostream>
#include<stdlib.h>
using namespace std;
int main()
{
   int n,f[100],g[100],s=0,t,i,j;
    cin>>n;
    for(i=0;i<n;i++)
        cin>>f[i];
    for(i=0;i<n;i++)
    {
        for(j=0;j<n-i-1;j++)
        {
            if(f[j]>f[j+1])
            {
                t=f[j];
                f[j]=f[j+1];
                f[j+1]=t;
            }
        }
    }
  
    for(i=0;i<n;i++)
        cin>>g[i];
    for(i=0;i<n;i++)
    {
        for(j=0;j<n-i-1;j++)
        {
            if(g[j]>g[j+1])
            {
                t=g[j];
                g[j]=g[j+1];
                g[j+1]=t;
            }
        }
    }
    for(i=0;i<n;i++)
    {
        s+=f[i]*g[i];
    }
   cout<<s;
    return 0;
}