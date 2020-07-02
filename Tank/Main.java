#include<iostream>
using namespace std;
int main()
{
    float r,h,l,t;
    cin>>r>>h>>l>>t;
    float v=(3.14*r*r*h);
    if(v<=(t*l))
      cout<<"The tank can be filled within "<<t<<" hours";
    else
       cout<<"The tank cannot be filled within "<<t<<" hours";

    
    //fill your code
    return 0;
}
