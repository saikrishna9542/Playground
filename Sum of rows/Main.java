#include<iostream>
using namespace std;
int main()
{
  int a[100][100];
    int i,j,r,c,sum;
    cin>>r>>c;
    for(i=0;i<r;i++)
    {
        for(j=0;j<c;j++)
        {
            cin>>a[i][j];
        }
    }
    
 for(i=0;i<r;i++)
    { sum=0;
        for(j=0;j<c;j++)
        {
            sum=sum+a[i][j];
        }
        cout<<sum<<endl;
    }
    
    return 0;
}