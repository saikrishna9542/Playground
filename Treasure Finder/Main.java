#include<iostream>
using namespace std;
int main()
{
   int a,b,c;
  cin>>a>>b>>c;
    int s,i,gcd,sg;
    if(a<b && a<c)
     s=a;
    else if(b<a && b<c)
     s=b;
    else
     s=c;
     
     for(i=s;i>=1;i--)
     {
         if(a%i==0 && b%i==0 && c%i==0)
         { 
           gcd=i;
           break;
         }
     }
     if((a>b && a<c) || (a>c && a<b))
        sg=a;
     else if((b>a && b<c) || (b>c && b<a))
        sg=b;
     else
        sg=c;
  if(gcd==1)
    cout<<"The code to open the box is "<<gcd;
  else{
    cout<<"The treasure is in box which has number "<<sg;       
    cout<<"\nThe code to open the box is "<<gcd;
       }
  return 0;
}