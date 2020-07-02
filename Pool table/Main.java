#include<iostream>
using namespace std;

class AddData          //Base Class
{
        protected:
                int num1, num2,num3;
        public:
                void accept()
                {
                        cin>>num1;
                        cin>>num2;
                  		cin>>num3;
                }
};
class Addition: public AddData   //Class Addition – Derived Class
{
                int per;
  				float per1;
        public:
                void add()
                {
                        per = 2*num1*num2;
                  		per1=2*3.14*num3;
                }
                void display()
                {
                        cout<<"Perimeter of rectangle: "<<2*(num1+num2)<<endl;
                        cout<<"Perimeter of circle: "<<2*3.14*num3<<endl;
                  
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

