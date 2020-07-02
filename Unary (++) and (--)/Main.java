#include<iostream>
using namespace std;
class NUM
{
  private:
        int n;
  public:
        //function to get number
        void getNum()
        {
            cin>>n;
        }
        //function to display number
        void dispNum(void)
        {
            cout << "value of n is: " << n;
        }
        //unary ++ operator overloading
        void operator ++ (void)
        {
            n=++n;
        }
        //unary -- operator overloading
        void operator -- (void)
        {
            n=--n;
        }
};
int main()
{
    NUM num;
    num.getNum();
     
    ++num;
    cout << "After increment - ";
    num.dispNum();
    cout << endl;
     
    --num;
    cout << "After decrement - ";
    num.dispNum();
    cout << endl;
    return 0;
}
