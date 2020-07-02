# include <iostream>
# include <string>
using namespace std;
int main()
{
    int i=1, u=1, sum=0,n;
cin >> n;
   while(u<=n)
   {                              
     if(u<n)
     {
      if(n%u==0 )
      sum=sum+u;
     }                         
     u++;
   }                           
   if(sum==n)
   {
    cout<<"Yes"<<"\n";
   }
   else
   {
     cout<<"No"<<"\n";  
   }
}
