#include <iostream>
using namespace std;
class std_basic_info
{
  private:
        char name[30];
        int  age;
        char gender;
  public:
        void getBasicInfo(void);
        void putBasicInfo(void);
};
void std_basic_info::getBasicInfo(void)
{
    cout << "Enter student's basic information:" << endl;
    cout << "Name: "<<"\n";
  	cin >> name;
    cout << "Age: "<<"\n";
  	cin >> age;
    cout << "Gender: "<<"\n";
  	cin >> gender;
}
 
void std_basic_info::putBasicInfo(void)
{
    cout << "Name: "<< name <<"\n"<< "Age: " << age <<"\n"<< "Gender: " << gender <<"\n";
}
 
//Derived class
class std_result_info:public std_basic_info
{
private:
        int     totalM;
        float   perc;
        char    grade;
        public:
        void getResultInfo(void);
        void putResultInfo(void);
};
 
//function definitions
void std_result_info::getResultInfo(void)
{
    cout <<"\nEnter student's result information:" << endl;
    cout << "Total Marks: "<<"\n";    
  	cin >> totalM;
    perc= (float)((totalM*100)/500);
    cout << "Grade: "<<"\n";
  cin >> grade;
}
 
void std_result_info::putResultInfo(void)
{
    cout << "Total Marks: " << totalM<<"\n"<< "Percentage: " << perc <<"\n"<< "Grade: " << grade << endl;
}
 
int main()
{
    //create object of derived class
    std_result_info std;
 
    //read student basic and result information
    std.getBasicInfo();
    std.getResultInfo();
 
    //print student basic and result information
    std.putBasicInfo();
    std.putResultInfo();
     
    return 0;
}
