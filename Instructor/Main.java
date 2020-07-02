#include<iostream>
using namespace std;

class Person
{
     int id;
     char name[200];

     public:
          void accept_person_details()
          {
               cout<<"Enter Id  :  "<<"\n";
               cin>>id;
               cout<<"Enter Name : "<<"\n";
               cin>>name;
          }
          void display_person_details()
          {
               cout<<"Id :  "<<id<<"\n";
               cout<<"Name :  "<<name<<"\n";
          }
};
class Teaching : public Person
{
     char subject_name[100];
     char teacher_name[200];

     public:
          void accept_teacher_details()
          {
               accept_person_details();
               cout<<"Enter Subject Name :  "<<"\n";
               cin>>subject_name;
               cout<<"Enter Teacher Name :  "<<"\n";
               cin>>teacher_name;
          }
          void display_teacher_details()
          {
               display_person_details();
               cout<<"Subject Name  :  "<<subject_name<<"\n";
               cout<<"Teacher Name  :  "<<teacher_name<<"\n";
          }
};
class NonTeaching : public Person
{
     char dept_name[200];
     
     public:
          void accept_nonteaching_details()
          {
               cout<<"Enter Department Name :  "<<"\n";
               cin>>dept_name;
          }
          void display_nonteaching_details()
          {
               cout<<"Department Name :  "<<dept_name<<"\n";
          }
};
class Instructor : public NonTeaching, public Teaching
{
     public:
          void accept_instructor_details()
          {
               accept_teacher_details();
               accept_nonteaching_details();
          }
          void display_instructor_details()
          {
               display_teacher_details();
               display_nonteaching_details();
          }
};
int main()
{
     Instructor *inst;
     int cnt, i;
     cout<<"Enter No. of Instructor Details You Want :  "<<"\n";
     cin>>cnt;
     inst=new Instructor[cnt];
     for(i=0; i<cnt; i++)
     {
          inst[i].accept_instructor_details();
     }
     for(i=0; i<cnt; i++)
     {
          inst[i].display_instructor_details();
     }
     return 0;
}