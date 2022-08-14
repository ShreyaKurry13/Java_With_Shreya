package com.company;
class Research_Students
{
    String name,spec;
    int age,exp;
    Research_Students(String name,int age,int exp,String spec)
    {
        this.name=name;
        this.age=age;
        this.exp=exp;
        this.spec=spec;
    }
    void Display_student()
    {
        System.out.println("Information of Research Students");
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Experience:"+exp);
        System.out.println("Specialization:"+spec);
    }
}
    class Graduate_Students extends Research_Students
    {
        String field;
        float percentage;
        Graduate_Students(String name,int age,int exp,String spec,String field,float percentage)
        {
            super(name,age,exp,spec);
            this.field=field;
            this.percentage=percentage;
        }
        void Display_student()
        {
            System.out.println("Information of Graduated Students");
            System.out.println("Name:"+name);
            System.out.println("Age:"+age);
            System.out.println("Experience:"+exp);
            System.out.println("Specialization:"+spec);
            System.out.println("Field:"+field);
            System.out.println("Percentage:"+percentage);
        }
    }
    class Students
    {
        public static void main(String args[])
        {
            Research_Students obj=new Research_Students
                    ("Shreya Kurry",19,2,"Android");
            obj.Display_student();
            Graduate_Students objj=new Graduate_Students
                    ("Pratham",18,3,"ANDROID","JAVA",89);
            objj.Display_student();
        }
    }
