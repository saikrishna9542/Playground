#include<iomanip>
#include<iostream>
using namespace std;
int main()
{ 
    int p,r,n;
    float i,a,d,s;
    cin>>p>>r>>n;
    i=(p*n*r)/100;
    a=p+i;
    d=(2/100.0)*i;
    s=a-d;
   /* cout<<fixed<<setprecision(0)<<i<<endl;
   cout<<fixed<<setprecision(0)<<a<<endl;
   cout<<fixed<<setprecision(0)<<d<<endl;
   cout<<fixed<<setprecision(0)<<s<<endl;*/
  cout<<i<<endl<<a<<endl<<d<<endl<<s;
    return 0;
}