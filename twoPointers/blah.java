
public class blah {//oca ch-2
    public static void main(String args[])
    {
        // short x=10;
        // short y=20;
       // short z=x+y-(x*y);  //error-lossy possible conversion (short or byte  is implicitly converted into integer while performing arithmetic operations)
        //System.out.println(z);  //fix this by replacing short z with int 


        // double x=10.5;
        // float y=20.2; //error:loss of data by default float data is treated as double without this 20.2f or (float)20.2
        // double z=x+y; 
        // System.out.println(z); 

        //System.out.println(2*5+3); 

        // int x=10;
        // long y=12;n
        // int z=x*y;   shorter datatype on LHS than right which is long type of  data to solve the error long z on LHS
        // System.out.println(z); 

        // short a=10;
        // float b=12;
        // short z=30; 
        // System.out.println(a+b*z); 
          
        // boolean x=false;
        // System.out.println(x+" "+!x);
        // int y=10; 
        // System.out.println(y+ " "+ ++y+" "+y++); 
       // System.out.println(y+ " "+ --y+" "+ ++y+" "+y--);  


        //when does pre and post increment matters:  

        // int a=3;
        // int b=++a*5/a-- + --a;
        // System.out.println(a+" "+b); 
        // String str="Genesis"; 
         // Integer str=10;  //Incompatible conditional operand types Integer and String
        // System.out.println(str instanceof String);  for string o/p: true true
        // System.out.println(str instanceof Object); 
        // System.out.println(str instanceof Number);  depends on heirarchy object->number->Integer classes
        // System.out.println(str instanceof Object); 
        // instanceof checks if an object belongs to a particular class.
        // String str = "Genesis";
        // System.out.println(str instanceof String); // true
        // System.out.println(str instanceof Object); // true
        // String is a subclass of Object, so instanceof returns true.

        //int x=10;
        //if(x=10) //true means anything non-zero ,false means 0 in c or c++ no need of == for the condition  
        //In java, 
        //System.out.println(true);  //In java, it tries to convert into types (error: int cannot converted into boolean)
       
        //if(100=x) 
        //System.out.println(true); //u cannot assign a value to a constant in c++ . In java error: unexpected type

        //int x=100;
        //if(x=0) 
        //printf("true");
        //printf(x); o/p:0  

        /*
        //short circuit or -if one is true dont evalueate rest of the expresiions

         * int x=10;
         * boolean y=true || x<5; 
         * System.out.println(y); //true
         * 
         * Integer z=20;
         * if(z!=null && z.intValue() <25) //short circuit and -if first exp false dont evaluate remaining
         * {System.out.println(z);  //true
         * } 
         * 
         * //Logical and
         * z=null;
         * if(z!=null & z.intValue() <25) //even it is false it evaluates rest of all which gives null pointer exception
         * {System.out.println(z);  
         * } 
         * 
         * 
         * x=6;
         * y= (x>=6) || (++x<=7)
         * System.out.println(x+" "+y); //output: 6 
         * 
         * 
         * Logical or
         * x=6;
         * y=(x>=6) | (++x<=7) //evaluate every exp
         * System.out.println(x); //output=7  
         * 
         * 
         */
    }
}