#include<iostream>
using namespace std;
int main()
{
  int x;
  cin>>x;
      if(x==100)
          cout<<"S";
      else if(x>=90 && x<=99)
              cout<<"A";
       else if(x>=80 && x<=89)
             cout<<"B";
       else if(x>=70 && x<=79)
         cout<<"C";
       else if(x>=60 && x<=69)
              cout<<"D";
      else if(x>=50 && x<=59)
             cout<<"E";
      else if(x<50)
             cout<<"F";
      else
        cout<<"Invalid Input";
}