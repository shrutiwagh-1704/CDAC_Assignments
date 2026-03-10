#include<iostream>
using namespace std;

class Student
{
    int rollNo;
    string name;
    float marks;

public:

    Student()
    {
        rollNo = 0;
        name = "NA";
        marks = 0;
    }

    Student(int r, string n, float m)
    {
        rollNo = r;
        name = n;
        marks = m;
    }

    Student(int rollNo, string name)
    {
        this->rollNo = rollNo;
        this->name = name;
        marks = 0;
    }

    void display()
    {
        cout<<"Roll No: "<<rollNo<<endl;
        cout<<"Name: "<<name<<endl;
        cout<<"Marks: "<<marks<<endl;
        cout<<endl;
    }
};

int main()
{
    Student s1;

    Student s2(1,"Shruti",85);

    Student s3(2,"Amit",90);

    s1.display();
    s2.display();
    s3.display();

    return 0;
}


// When does the compiler generate a default constructor?
// If the programmer does not define any constructor in the class, the compiler automatically creates a default constructor.

// When does it NOT generate one?
// If the programmer defines any constructor, the compiler will not automatically create a default constructor.

// Can constructors be overloaded?
// Yes.
// A class can have multiple constructors with different parameter lists