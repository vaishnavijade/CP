@FunctionalInterface
Interface greeting{
    public greet(String msg);
}
class test{
    public static void main(String[] args){
    greeting g=msg->System.out.println(msg);//compiler will generate the class internally
    System.out.println(g.getClass().getName());
    g.greet("sabc");
}
}
//predicate --built-in interface  checks whether the expr gives true or false