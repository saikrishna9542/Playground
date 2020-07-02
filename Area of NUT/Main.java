#include <iostream>
using namespace std;

class Rectangle 
{
  public:
    int area(int a,int b)
      { return a*b; }
};

class Triangle
{
  public:
    int area(int a,int b)
      { return (a*b)/2; }
};

int main () {
  Rectangle rect;
  Triangle trgl;
  int x,y;
  cin>>x>>y;
  cout << rect.area(x,y) << '\n';
  cout << trgl.area(x,y) << '\n';
  return 0;
}