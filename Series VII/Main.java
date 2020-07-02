#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
   int n;
       cin>>n;
       float a=1;
        float prev=a;
cout<<fixed<<setprecision(0)<<a<<" ";
for(int i=2;i<=n;i++)
{
    if(i%2==0)
    {
        float sum=prev*2;
        cout<<sum<<" ";
        a=prev;
        prev=sum;
    }    
    else
     {
        float sum=a+prev;
        cout<<sum<<" ";
        a=prev;
        prev=sum;
	}
 }
}