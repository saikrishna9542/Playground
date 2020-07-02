#include<iostream>
using namespace std;
int main()
{
 int n,c,sum=0;
    cin>>n;
    c=n;
    while(n!=0)
    {
        sum=sum+(n%10);
        n=n/10;
    }
    if(c%sum==0)
     cout<<"Harshad Number";
    else
     cout<<"Not Harshad Number";
    //fill the code
    return 0;
}