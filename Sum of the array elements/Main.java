#include<iostream>
using namespace std;
int sum(int arr[], int start, int len) ;
int main()
{
    int arr[100];
    int N, i, sumofarray;
    cin>>N;
    for(i=0; i<N; i++)
    {
        cin>>arr[i];
    }    
    sumofarray = sum(arr, 0, N);
    cout<<sumofarray;
    return 0;
}

int sum(int arr[], int start, int len) 
{
    /* Recursion base condition */
    if(start >= len)
        return 0;
        
    return (arr[start] + sum(arr, start + 1, len));
}