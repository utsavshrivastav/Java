#include<iostream>
using namespace std;
class A
{
  protected:
  int a,b;
  public:
  void set()
   {
    cout<<"Enter the value of a,b";
    cin>>a>>b;
   }
};.
class B:public A
{
  int c;
  public:
  void add()
   {
     c=a+b;
     cout<<"sum="<<c<<endl;
   } 
};
int main()
{
 B ob;
 ob.set();
 ob.add();
}
