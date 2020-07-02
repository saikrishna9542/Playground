#include<iostream>
using namespace std;
void SumOfEven(int arr[],int i, int sum) 
{ 
    if (i < 0)  
    { 
         cout<<"The sum of the even elements in the array is "<<sum;
        return; 
    } 
  
    if ((arr[i]) % 2 == 0) 
    { 
        sum += (arr[i]); 
    } 
  
    SumOfEven(arr, i - 1, sum); 
} 
  
int main()
{
  int n;
  cout<<"Enter the number of elements in the array"<<endl;
  cin>>n;
  int a[n];
  cout<<"Enter the elements in the array"<<endl;
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  int sum=0;
  SumOfEven(a,n-1,sum);
}