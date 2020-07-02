#include<iostream>
using namespace std;
int main()
{
  
		int m;
        cin>>m;
		int A[m][m];

		// Input the matrix.
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<m;j++)
			{
                cin>>A[i][j];
			}
		}

		
		int p=1;

		for(int i=0;i<m;i++)
		{
			for(int j=i+1;j<m;j++)
			{
				// check for lower matrix or not.
				if(A[i][j]!=0) 
				{
					p=0;
					break;
				}
             }
              if(p==0)
                break;
			}
		if(p==1)
			cout<<"Lower Triangular Matrix";
		else
			cout<<"Not a Lower Triangular Matrix";
}