@FunctionalInterface
Interface greeting{
    public greet(String name){}
}
class test{
    public static void main(String[] args){
    greeting g=(Stringg name)->{return name;};
    System.out.println(g.greet(abc));
}}