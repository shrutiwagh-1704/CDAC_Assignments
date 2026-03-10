#include<iostream>
#include<cstring>
using namespace std;

class String
{
    char *str;

public:

    String()
    {
        str=new char[1];
        str[0]='\0';
    }

    String(const char *s)
    {
        str=new char[strlen(s)+1];
        strcpy(str,s);
    }

    String(const String &s)
    {
        str=new char[strlen(s.str)+1];
        strcpy(str,s.str);
    }

    ~String()
    {
        delete[] str;
    }

    String& operator=(const String &s)
    {
        delete[] str;

        str=new char[strlen(s.str)+1];
        strcpy(str,s.str);

        return *this;
    }

    String operator+(String &s)
    {
        String temp;

        delete[] temp.str;

        temp.str=new char[strlen(str)+strlen(s.str)+1];

        strcpy(temp.str,str);
        strcat(temp.str,s.str);

        return temp;
    }

    friend istream& operator>>(istream &in,String &s)
    {
        char temp[100];

        in>>temp;

        s=String(temp);

        return in;
    }

    friend ostream& operator<<(ostream &out,String &s)
    {
        out<<s.str;
        return out;
    }
};

int main()
{
    String s1,s2,s3;

    cout<<"Enter two strings"<<endl;

    cin>>s1>>s2;

    s3=s1+s2;

    cout<<"String1 "<<s1<<endl;
    cout<<"String2 "<<s2<<endl;
    cout<<"Concatenated "<<s3<<endl;
}