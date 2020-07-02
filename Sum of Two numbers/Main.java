#include<iostream>
using namespace std;

class AddData          //Base Class
{
        protected:
                int num1, num2;
        public:
                void accept()
                {
                        cout<<"Enter the integer value of class A: "<<"\n";
                        cin>>num1;
                        cout<<"Enter the integer value of class B: "<<"\n";
                        cin>>num2;
                }
};
class Addition: public AddData   //Class Addition – Derived Class
{
                int sum;
        public:
                void add()
                {
                        sum = num1 + num2;
                }
                void display()
                {
                        cout<<"The sum of two numbers: "<<sum;
                }
};
int main()
{
        Addition a;
        a.accept();
        a.add();
        a.display();
        return 0;
}