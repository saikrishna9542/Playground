#include<iostream>
using namespace std;
class ebill
{
     public:
     int cno;
     char cname[20];
     int units;
     int bill;
     public:
                void get()
        {
                 cin>>cno;
                 cin>>cname;
                 cin>>units;
         }
                void put()
         {
                cout<<cno<<"\n";
                cout<<cname<<"\n";
                cout<<units<<"\n";
                cout<<bill;
         }
                void calc()
        {
                if(units<=100)
                       bill=units*1.20;
               else if(units<=300)
                       bill=100*1.20+(units-100)*2;
               else
                       bill=100*1.20+200*2+(units-300)*3;
         }
};
             int main()
     {
             ebill p1;
             p1.get();
             p1.calc();
             p1.put();
      }
