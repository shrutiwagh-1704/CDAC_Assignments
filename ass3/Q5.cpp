#include<iostream>
using namespace std;

class Number;

class Inspector
{
public:
    void show(Number &n);
};

class Number
{
    int value;

public:

    Number(int v=0)
    {
        value=v;
    }

    friend bool operator>(Number a,Number b);

    friend class Inspector;

    Number& operator++()
    {
        value++;
        return *this;
    }

    Number operator++(int)
    {
        Number temp=*this;
        value++;
        return temp;
    }

    Number& operator=(Number n)
    {
        value=n.value;
        return *this;
    }
};

bool operator>(Number a,Number b)
{
    return a.value>b.value;
}

void Inspector::show(Number &n)
{
    cout<<"Value "<<n.value<<endl;
}

int main()
{
    Number n1(10),n2(20);

    ++n1;
    n2++;

    Inspector i;
    i.show(n1);
    i.show(n2);

    if(n1>n2)
        cout<<"n1 greater"<<endl;
    else
        cout<<"n2 greater"<<endl;
}