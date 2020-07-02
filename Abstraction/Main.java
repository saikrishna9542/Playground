#include<iostream>
using namespace std;
class Base{
     
    int num,num1;  //by default private
    public:
     
    void read();
    void print();
     
};
  
void Base :: read(){
   cin>>num;
  cin>>num1;
     
}
  
void Base :: print(){
    cout<<"a = "<<num<<endl;
  cout<<"b = "<<num1;
}
  
int main(){
    Base obj;
     
    obj.read();
    obj.print();
     
    return 0;
}