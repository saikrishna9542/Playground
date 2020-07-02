#include<iostream>
using namespace std;
#include<cmath>
int main()
{
    int u,s;
    cin>>u;
    if(u<=200)
    {
        s=(u*0.5);
        cout<<"Rs."<<s;
    }
    else if(u<=400)
    {
        s=(u*0.65)+100;
        cout<<"Rs."<<s;
    }
    else if(u<=600)
    {
        s=(u*0.80)+200;
       cout<<"Rs."<<s;
    }
    
    else if(u>600)
    {
        s=(u*1.25)+425;
       cout<<"Rs."<<s;
    }
    
    //fill the code
    return 0;
}