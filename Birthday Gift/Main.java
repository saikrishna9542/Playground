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
                int sum;
  				int sum1;
        public:
                void add()
                {
                        sum = num1 + num2;
                  		sum1=sum+num3;
                }
                void display()
                {
                        cout<<sum<<"\n";
                  		cout<<sum1;
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

