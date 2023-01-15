package chapter6;

 class Box {
    double width;
    double height;
    double depth;

    Box(){
        System.out.println("Конструирование объекта Box");
        width = 10;
        height = 10;
        depth = 10;
    }
    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

     void volumer(){
         System.out.print("Объем равен ");
         System.out.println(width * height * depth);
     }
     double volume(){
         return width * height * depth;
     }
     void setDim(double w, double h, double d){
         width = w;
         height = h;
         depth = d;
     }


 }

