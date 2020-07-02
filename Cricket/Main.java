#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
int tnb1,tnr1,tnr2,tnb2;
cin>>tnb1>>tnr1>>tnr2>>tnb2;
float no1=(tnb1/6)+((tnb1%6)*0.1);
float no2=(tnb2/6)+((tnb2%6)*0.1);

float rr1,rr2;
rr1=(tnr1/no1);
rr2=(tnr2/no2);

cout<<fixed<<setprecision(0)<<no1<<endl;
cout<<fixed<<setprecision(1)<<no2<<endl;
cout<<fixed<<setprecision(1)<<rr2<<endl;
cout<<fixed<<setprecision(1)<<rr1<<endl;

if(rr1>rr2)
cout<<"Not Eligible to Win";
else
cout<<"Eligible to Win";
    return 0;
}