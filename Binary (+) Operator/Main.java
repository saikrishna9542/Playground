
#include<iostream>
using namespace std;
 
class NUM
{
    private:
        int n,m;
         
    public:
        //function to get number
        void getNum()
        {
            cin>>n;
            cin>>m;
        }
        //function to display number
        void dispNum(void)
        {
            cout <<"Number is: " << n+m;
        }
        //unary - operator overloading
        void operator + (void)
        {
            n=+n;
        }
};

int main()
{
    NUM num;
    num.getNum();
    +num;
    num.dispNum();
    cout << endl;
    return 0;
     
}
