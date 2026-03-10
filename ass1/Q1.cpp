#include<iostream>
using namespace std;


class Student{
    string name;
    int rollNumber;
    float marks=-1.0f;
    char grade='N';

    public:
        void AcceptInfo()
        {
            cout<<"Enter name"<<endl;
            cin>>name;

            cout<<"Enter rollNumber (1-200)"<<endl;
            cin>>rollNumber;
            while(rollNumber>200 || rollNumber<=0)
            {
                cout<<"Invalid rollNumber.."<<endl;
                cout<<"ENter again"<<endl;
                cin>>rollNumber;
            }
            

            cout<<"Enter marks"<<endl;
            cin>>marks;
            while(marks>=100 || marks<0)
            {
                cout<<"Invalid Marks.."<<endl;
                cout<<"ENter again"<<endl;
                cin>>marks;
            }
        }

        void calculateGrade()
        {
            // cout<<marks<<endl;
            if(marks==-1.0f)
            {
                cout<<"Wrong choice..Enter choice 1"<<endl;
                return;
            }

            else if(marks>=90)
            {
                grade='A';
            }
            else if(marks>=80 && marks<90)
            {
                grade='B';
            }
            else if(marks>=70 && marks<80)
            {
                grade='C';
            }
            else if(marks>=60 && marks<70)
            {
                grade='D';
            }
            else{
                grade='F';
            }
        }

        void Displayinfo()
        {   
            // cout<<grade<<endl;
            if(grade=='N')
            {
                cout<<"!! Wrong choice calculate grade first.. Enter choice 3"<<endl;
                return;
            }
            cout<<"Name of Student is: "<<name<<endl;
            cout<<"RollNumber: "<<rollNumber<<endl;
            cout<<"Marks: "<<marks<<endl;
            cout<<"Grade: "<<grade<<endl;
        }


};

int main()
{
    int choice=0;
    Student s1;

    while(choice<4)
    {

        cout<<"1. Accept Information "<<endl;
        cout<<"2. Display information "<<endl;
        cout<<"3. Calculate Grade " <<endl;
        cout<<"4. Exit the program."<<endl;

        cout<<"Enter choice"<<endl;
        cin>>choice;

        switch(choice)
        {
            case 1:
                s1.AcceptInfo();
                break;

            case 2:
                s1.Displayinfo();
                break;

            case 3:
                s1.calculateGrade();
                break;

        


        }
    }
}