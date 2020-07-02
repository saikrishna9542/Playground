#include<iostream>
#include<stdio.h>
#include<string.h>
#include<cstdlib>
using namespace std;
class staff
{
        int staff_id;
        char name[20];
        float salary;
    public:
        staff()
        {

        }
        void accept()
        {
                cout<<"Enter Staff Id : "<<"\n";
                cin>>staff_id;
                cout<<"Enter Staff Name : "<<"\n";
                cin>>name;
                cout<<"Enter Salary : "<<"\n";
                cin>>salary;
        }
        void display();
        friend void sort(char nm[], int n, staff *s);
        void operator =(staff s1);
};
void staff::operator=(staff s1)
{
        staff_id = s1.staff_id;
        strcpy(name,s1.name);
        salary = s1.salary;
}
void staff::display()
{
        cout<<"Staff Id : "<<staff_id<<"\n";
        cout<<"Name : "<<name<<"\n";
        cout<<"Salary : "<<salary<<"\n\n";
}
void sort(char nm[], int n, staff *s)  //Function for sorting the data by employee name
{
        staff temp;
        for(int i=0; i<n; i++)
        {
                for(int j=i+1; j<n; j++)
                {
                        int r = strcmp(s[i].name,s[j].name);
                        if(r>0)
                        {
                                temp=s[i];
                                s[i]=s[j];
                                s[j]=temp;
                        }
                }
        }
}
int main()
{
        int ch;
        staff *s;
        int n;
        cout<<"Enter No.of Records You Want : "<<"\n";
        cin>>n;
        s = new staff[n];
        do
        {
                cout<<"1. Accept Data "<<"\n";
                cout<<"2. Display Data "<<"\n";
                cout<<"3. Sort Data by Name "<<"\n";
                cout<<"4. Exit: "<<"\n";
                cout<<"Enter Your Choice : "<<"\n";
                cin>>ch;
                switch(ch)
                {
                        case 1:
                                for(int i=0; i<n; i++)
                                {
                                        cout<<"Enter Data for Employee " <<i+1<<"\n";
                                        s[i].accept();
                                }
                                break;
                        case 2:
                                for(int i=0; i<n; i++)
                                {
                                        s[i].display();
                                }
                                break;
                        case 3:
                                sort("a", n, s);  //Passing parameter to sort() function
                                cout<<"Data is Sorted!!!"<<"\n\n";
                                break;
                        case 4:
                                exit(0);
                        default:
                                cout<<"Invalid Choice . . .";
        }
        }
        while(ch!=4);
        return 0;
}



