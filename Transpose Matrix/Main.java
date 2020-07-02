#include<iostream>
using namespace std;
int main()
{
  int a[100][100];
    int n,i,j;
    cin>>n;
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            cin>>a[i][j];
        }
    }
    
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            cout<<a[i][j]<<" ";
        }
        cout<<"\n";
    }
    cout<<"Transpose matrix is:\n";
     for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            cout<<a[j][i]<<" ";
        }
        cout<<"\n";
    }
    
    //fill your code
    return 0;
}