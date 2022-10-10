#include <iostream>

using namespace std;
class Car{
    public:
        string brand;
        int year;
        int millage;
        string millageUnit = "km";
};


class Student{
    public:
        string name;
        string lastName;
        string index;
        int age;
        int group;
        int semester;
        Car car;
        
        void details(){
            cout<<"Name: "<<name<<endl<<"Last Name: "<<lastName<<endl<<"Index Number: "<<index<<endl;
        }
        
        void flex(){
            cout<<"Brand: "<<car.brand<<endl;
            cout<<"Producition Year: "<<car.year<<endl;
            cout<<"Car Millage: "<<car.millage<<endl;
        };
};

int main(){
    
    Car car;
    
    car.brand = "BMW";
    car.year = 2010;
    car.millage = 210000;
    
    Student student;
    student.name = "Jan";
    student.lastName = "Kowalski";
    student.index = "000000";
    student.age = 21;
    student.group = 2;
    student.semester = 4;
    student.car = car;
    
    
    student.details();
    student.flex();
    return 0;
}
