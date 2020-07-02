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
private:
public:
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
        int x,sqr,cube;
        cout<<"Enter the side :"<<"\n";
        cin>>x;
        sqr =objS.getSquare(x);
        cout <<"The square value is : "<<sqr<<"\n";
  		cube=objC.getCube(x);
        cout <<"The cube value is : "<< cube; 
        return 0;
}
