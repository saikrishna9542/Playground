#include<iostream>
using namespace std;
#include<stdio.h>
int main()
{
    int fa,fd,fsc,sa,sd,ssc,aa,ad,asc;
     cin>>fa>>fd>>fsc>>sa>>sd>>ssc>>aa>>ad>>asc;
    int A,S,F;
    F= fa-((fd*fa)/100)+fsc;
    S= sa-((sd*sa)/100)+ssc;
    A= aa-((ad*aa)/100)+asc;
    cout<<"In Flipkart Rs."<<F;
   cout<<"\nIn Snapdeal Rs."<<S;
    cout<<"\nIn Amazon Rs."<<A;
    if(F<S && F<A)
     cout<<"\nHe will prefer Flipkart";
    else if(S<F && S<A)
     cout<<"\nHe will prefer Snapdeal";
    else if(A<F && A<S)
     cout<<"\nHe will prefer Amazon";
    else if(S==F)
     cout<<"\nHe will prefer Flipkart";
    //fill your code
    return 0;
}