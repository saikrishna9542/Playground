#include<iostream>
using namespace std;
int main()
{
   int a[100][100],b[100][100],x[100][100];
    int r,c,i,j;
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
            cin>>b[i][j];
        }
        
    }
    for(i=0;i<r;i++)
    {
        for(j=0;j<c;j++)
        {
            x[i][j]= a[i][j]+b[i][j];
        }
        
    }
    for(i=0;i<r;i++)
    {
        for(j=0;j<c;j++)
        {
            cout<<x[i][j]<<" ";
        }
        cout<<"\n";
    }
    //fill your code
    return 0;
}