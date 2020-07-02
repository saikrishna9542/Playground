#include<iostream>
using namespace std;

class circle
{
        float radius, area;   //data members
    public:
        circle()
        {
                cout<<"Enter the value of Radius :\n";
                cin>>radius;
        }
        void calculate();   //member function
        void display();     //member function
};
inline void circle :: calculate()  //accessing data members of a class circle
{
        area = 3.14 * radius * radius;
}
inline void circle :: display()
{
        cout<<"Area of Circle : "<<area;
}
int main()
{
        circle cr;   //object created
        cr.calculate();   //calling function
        cr.display();  //calling function
        return 0;
}



