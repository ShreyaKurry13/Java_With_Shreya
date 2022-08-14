package com.company;
class Area
        {
            public int length=10;
            public int breadth=8;
            public int radius=5;
            public int side=6;
        }
        class Rectangle extends Area
        {
            void Rec_areadisplay()
            {
                int Rec_area=length*breadth;
                System.out.println("Area of rectangle:"+Rec_area);
            }
        }
        class Circle extends Rectangle {
            void Cir_areadisplay() {
                float Cir_area = 3.14f * radius * radius;
                System.out.println("Area of circle :" + Cir_area);
            }
        }
            class Square extends Circle
            {
                void Squ_areadisplay() {
                    float Squ_area = side * side;
                    System.out.println("Area of square :" + Squ_area);
                }
                public static void main(String[] arg)
                {
                        Square obj = new Square();
                        obj.Rec_areadisplay();
                        obj.Cir_areadisplay();
                        obj.Squ_areadisplay();
                }
            }
