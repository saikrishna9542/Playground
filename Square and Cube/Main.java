#include <iostream>
using namespace std;
class Square
{
public:
    int getSquare(int num)
    {
        int sqr;
        sqr=num*num;
        return sqr;
    }
};
 
class Cube
{
private:public:
    int getCube(int num)
    {
        int cube;
        cube=num*num*num;
        return cube;
    }
};
int main()
{
        Square objS;
        Cube objC;
        int sqr,cube;
        int x,y;
        cin>>x;
        cin>>y;
  cout<<"Enter an integer number: ";
        sqr =objS.getSquare(x);
        cout << "Square of "<<x<< " is: " << sqr  << endl;
    cout<<"Enter an integer number: ";

        cube=objC.getCube(y);
        cout << "Cube of "<<y<< " is: " << cube << endl;
         
        return 0;
}
