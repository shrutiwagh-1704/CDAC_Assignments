#include<iostream>
using namespace std;

class Box
{
    int length;
    int width;
    int height;

public:

    
    Box(int l, int w, int h)
    {
        length = l;
        width = w;
        height = h;
    }

    void setDimensions(int length, int width, int height)
    {
        this->length = length;
        this->width = width;
        this->height = height;
    }

    int volume()
    {
        return length * width * height;
    }
};

int main()
{
    Box b1(2,3,4);

    cout<<"Volume using constructor: "<<b1.volume()<<endl;

    b1.setDimensions(5,6,7);

    cout<<"Volume after setDimensions: "<<b1.volume()<<endl;
}

// Why must initialization happen before assignment?

// When an object is created, its variables first need some starting value.
// Initialization gives that starting value at the time the object is created.
// Assignment happens later, after the object already exists. So first the variable must be initialized, then its value can be changed using assignment.

// When is initialization preferred over assignment?

// Initialization is better when the object is created because the values are set immediately.
// It is also required for const variables and reference variables, because their values cannot be changed later.
// So they must be initialized at the beginning itself.