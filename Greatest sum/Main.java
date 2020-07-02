#include<iostream>
using namespace std;
int main()
{
      int a[100][100],ms,msi=0;
    int i,j,r,c,sum;
    cin>>r>>c;
    for(i=0;i<r;i++)
    {
        for(j=0;j<c;j++)
        {
            cin>>a[i][j];
        }
    }
    cout<<"Sum of rows is ";
 for(i=0;i<r;i++)
    { sum=0;
        for(j=0;j<c;j++)
        {
            sum=sum+a[i][j];
        }
        cout<<sum<<" ";
        if(sum>ms)
        {
            ms=sum;
            msi=i;
        }
    }
   cout<<"\nRow "<<msi+1<<" has maximum sum";
    
    ms=0,msi=0;;
    cout<<"\nSum of columns is ";
     for(j=0;j<c;j++)
    { sum=0;
        for(i=0;i<r;i++)
        {
            sum=sum+a[i][j];
        }
        cout<<sum<<" ";
        if(sum>ms)
        {
            ms=sum;
            msi=j;
        }
    }
    cout<<"\nColumn "<<msi+1<<" has maximum sum";
    return 0;
}