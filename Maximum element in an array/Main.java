#include<iostream>
using namespace std;
int findLargest(int a[], int index)
{
	    if (index > 0)
        {
	        return std::max(a[index], findLargest(a, index-1));
	    }
        else 
        {
	        return a[0];
	    }
}
int main()
{
  int n;
  cout<<"Enter the size of the array"<<endl;
  cin>>n;
  int a[n];
  cout<<"Enter "<<n<<" elements of an array"<<endl;
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  cout<<"Maximum element in the array is "<<findLargest(a,n-1);
  return 0;
}