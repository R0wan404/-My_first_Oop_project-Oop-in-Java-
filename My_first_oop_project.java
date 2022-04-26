package my_first_oop_project;
import java.util.Scanner;
public class rectangle {
    static Scanner input = new Scanner(System.in);
    static private double length;
    static private double width;
    public rectangle ()
    {
        length=0;
        width=0;
    }
        public static void set_width (double w)
        {
         width=input.nextDouble();
        }
        public void set_length (double l)
        {
         length=input.nextDouble();
        }
         public double show_attributes(){
          System.out.println("\nthe length is now="+length);
          System.out.println("\nthe width is now="+width);
          return length;
         }
        public double get_width(){
         return width;
        }
        public double calculatearea()
        {
        System.out.println("\nthe area is now="+(length * width)+" m^2");
        return length * width;
        }
        public double calculateparameter()
        {
        System.out.println("\nthe parameter is now="+((2*length) + (2*width))+" meters");
        return ((2*length) + (2*width));
        }
}
