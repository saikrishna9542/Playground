#include<iostream>
using namespace std;
class Test
{
public:
    int factorial(int x) 
    {
        int i, f = 1;
        for (i = 1; i <= x; i++)
        {
            f = f*i;
        }
        return f;
    }
};
int main()
{
int x, f;
cin >> x;
Test obj;
f = obj.factorial(x);
cout<<f;
return 0;
}