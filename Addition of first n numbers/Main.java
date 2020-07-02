#include<iostream>
using namespace std;
int addNumbers(int n);
int main()
{
    int num;
    cin>>num;
    cout<<addNumbers(num);
    return 0;
}

int addNumbers(int n)
{
    if(n == 0)
      return n;
    else
       return n + addNumbers(n-1);

}