#include<iostream>
#include<fstream>
using namespace std;

class Student
{
    int roll;
    string name;
    float marks;

public:

    Student(int r=0,string n="",float m=0)
    {
        roll=r;
        name=n;
        marks=m;
    }

    ~Student()
    {
        cout<<"Destroying student "<<name<<endl;
    }

    void display()
    {
        cout<<roll<<" "<<name<<" "<<marks<<endl;
    }

    void write(ofstream &f)
    {
        f<<roll<<" "<<name<<" "<<marks<<endl;
    }
};

int main()
{
    Student s[3]={{1,"shreya",80},{2,"Shruti",85},{3,"gauri",78}};

    ofstream fout("students.txt");

    for(int i=0;i<3;i++)
        s[i].write(fout);

    fout.close();

    ifstream fin("students.txt");

    string line;

    cout<<"File contents:"<<endl;

    while(getline(fin,line))
        cout<<line<<endl;

    fin.close();
}