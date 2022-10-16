#include <iostream>

using namespace std;
class Car{
    public:
        string brand;
        int year;
        int millage;
        string millageUnit = "km";
        
        virtual void carDetails(){};
};



class FastCar : public Car{
    public:
        int maxSpeed;
        string modifications;
        void carDetails() override {
            cout<<"Brand: "<<brand<<endl;
            cout<<"Producition Year: "<<year<<endl;
            cout<<"Car Millage: "<<millage<<endl;
            cout<<"Max Speed: "<<maxSpeed<<endl;
            cout<<"Modifications: "<<modifications<<endl;

        };
};


class Student{
    public:
        string name;
        string lastName;
        string index;
        int age;
        int group;
        int semester;
        FastCar car;
        
        void details(){
            cout<<"Name: "<<name<<endl<<"Last Name: "<<lastName<<endl<<"Index Number: "<<index<<endl;
        }
        
        void flex(){
            car.carDetails();
        };
};

int main(){
    
    FastCar car;
    
    car.brand = "BMW";
    car.year = 2010;
    car.millage = 210000;
    car.maxSpeed = 200;
    car.modifications ="spoiler";

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
