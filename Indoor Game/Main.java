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
                int sq;
  				int mul;
        public:
                void add()
                {
                        sq = num1*num1;
                  		mul=num2*num3;
                }
                void display()
                {
                        cout<<sq<<"\n";
                  		cout<<mul;
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

