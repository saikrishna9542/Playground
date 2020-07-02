#include<iostream>
using namespace std;
int main()
{
  int n;
   cin>>n;;
    int sum=0,i;
    for(i=1;i<n;i++)
    {
        if(n%i==0)
        sum=sum+i;
    }
    if(sum>n)
      cout<<"Abundant Number";
    else
     cout<<"Not Abundant Number";
     
    //fill the code
    return 0;
}