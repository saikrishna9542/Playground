#include<iostream>
using namespace std;
int main()
{
    int A,B,C,n;
    cin>>A>>B>>C>>n;
    if(A%n==0)
    cout<<"Car 1 goes into road A";
    
    else if(B%n==0)
    cout<<"Car 1 goes into road B";

    else if(C%n==0)
    cout<<"Car 1 goes into road C";

    else
    cout<<"No path exist";
    //Fill the code
    return 0;
}