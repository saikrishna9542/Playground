#include<iostream>
using namespace std;
int main()
{
  int d1,c1,d2,c2;
   int cent,dollar;
   cin>>d1>>c1>>d2>>c2;
   dollar=d1+d2;
   cent=c1+c2;
   if(cent>100)
   {
    dollar= dollar+(cent/100);
    cent=cent%100;
   }
   cout<<dollar<<endl<<cent;
}