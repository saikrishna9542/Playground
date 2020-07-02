#include <iostream>
using namespace std;
class Math 
{
 private:
int x,y,a,b,c,d,e,f;
int sum,diff,mul,div;
 public:
int process_data();
int display();
 };
 int Math :: process_data()
 {
	cin>>x;
	cin>>y;
   cin>>a;
   cin>>b;
   cin>>c;
   cin>>d;
   cin>>e;
   cin>>f;
	sum= x + y;
    diff=a-b;
   mul=c*d;
div = e/f;
cout<<sum<<"\n";
cout<<diff<<"\n";
   cout<<mul<<"\n";
   cout<<div<<"\n";

 }
 int Math :: display()
 {
 int basic;
 basic = process_data();
 }
 int main()
 {
 Math value;
 value.display();
 }