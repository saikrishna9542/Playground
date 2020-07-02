#include<iostream>
using namespace std;
class sum
{
// hidden data from outside world
private: int a,b,c;

public:
int add()
{
cin>>a>>b;
c=a+b;
cout<<"Sum: "<<c;
}
};
int main()
{
sum s;
s.add();
}
