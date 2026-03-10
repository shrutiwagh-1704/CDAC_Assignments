// Create a C++ program to model a Student Result System.

// Create a base class Student that contains:
// A protected data member rollNo
// A constructor that initializes rollNo
// A virtual function display() that prints the roll number.

// Create a derived class Result that:
// Inherits from Student
// Has an additional data member marks
// Uses a constructor to initialize both rollNo and marks
// Overrides the display() function to print both roll number and marks.

// In the main() function:
// Create an object of the Result class.
// Use a base class pointer to refer to the derived object (Upcasting).
// Call the display() function using the base class pointer.

// Answer the following questions:
// Which constructor will be called first: Student or Result?
// Does the program demonstrate early binding or late binding?
// Why is the display() function declared as virtual


#include<iostream>
using namespace std;

class student
{
    protected:
        int rollNo;

    public:
        student()
        {

        }
        student(int rno)
        {
            this->rollNo=rno;
        }  
        
        virtual void display()
        {
            cout<<"RollNo: "<<rollNo<<endl;
        }


};

class Result:public student
{
    int marks;

    public:
        Result()
        {

        }
        Result(int rollno,int marks):student(rollno),marks(marks)
        {

        }

        void display()
        {
            cout<<"RollNo"<<rollNo<<endl;
            cout<<"marks"<<marks<<endl;
        }


};

int main()
{

    Result r1(21,50);
    student *s1;

    s1=&r1;
    s1->display();


    return 0;
}

// Which constructor will be called first: Student or Result?
// First parent class constructor will called means student class constructor will call then Result 

// Does the program demonstrate early binding or late binding?
// Program is acheiving the late binding
