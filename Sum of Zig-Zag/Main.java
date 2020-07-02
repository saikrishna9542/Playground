#include<iostream>
using namespace std;
int main()
{
    int a[100][100],ms,msi=0;
    int i,j,r,c,sum=0;
    cin>>r>>c;
    for(i=0;i<r;i++)
    {
        for(j=0;j<c;j++)
        {
            cin>>a[i][j];
        }
    }
    for(i=0;i<r;i++)
    {
        for(j=0;j<c;j++)
        {
            if(i==0 || i==j |(i==(r-1) && (r-1)!=1 ))
            sum=sum+a[i][j];
        }
    }
     cout<<"Sum of Zig-Zag pattern is "<<sum;
    return 0;
}