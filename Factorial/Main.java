#include<iostream>
using namespace std;
long int multiplyNumbers(int n);

int main()
{
    int n;
    cout<<"Enter the value of n"<<endl;
    cin>>n;
    cout<<"The factorial of "<<n<<" is "<<multiplyNumbers(n);
    return 0;
}
long int multiplyNumbers(int n)
{
    if(n<0)
     return 0;
    else 
    {
        if (n >= 1)
        return n*multiplyNumbers(n-1);
        else
        return 1;
    }
}