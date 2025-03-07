import pack1.subpack.*;
import pack1.tes1;
import pack1.*;
 //to resolve conflict when a class in the package and also a subpack in it has same file name

public class demo{
    public static void main(String[] args){
        pack1.tes1 t=new pack1.tes1();
        t.m1();
        tes2 t2=new tes2();
        t2.m2();
        tes3 t3=new tes3();
        t3.m3();
        
        System.out.println("demo");
    }
}

/*to resolve conflict when a class in the package and also a subpack in 
it has same file name

in reference give full qualified name like import pack1.subpack.tes1; 
then tes1 one subpack will get active

when explicitly refered like tes1 in above context it has more priority than the wildcard one
so the order of import doesnt matter

if u dont want to import at all 
pack1.tes1 t=new pack1.tes1(); use this kinda syntax fully qualified one

but in python
 both have same functions and i exported using *
then last once will get preference  and doesnt give any ambiguity 
from one import *
from two import *
fucntion from 2 gets called

from one import * -----------

This imports all public objects (functions, classes, variables) from one into the current namespace.
You can directly use them without the module prefix.
from one import *

some_function()  # Works directly

how it differs from 
----------------------------------------------------------------------------------------------------
import one ------

This imports the entire module one as a namespace.
You must use one.<object> to access functions, classes, or variables from one.


import one 

one.some_function()  # Correct
some_function()  # Error: NameError: name 'some_function' is not defined

prgrm--
i=1
j=1
print(id(i))
print(id(j))
then both will have same id

if i j are not equal then id of i and j will be diff

also print(id(j),id(j)) prints the two with gap inbtw since ,

all numbers types in data are immutable  (all variables which has same value all tht variables will reference to same value(Addr))

s=hello
s1=hello
print(id(s),id(s1))  # prints same id since both are referencing same value
s1=s1+"world"
print(id(s),id(s1))  #diff ids
print(s,s1) #hello helloworld
print(s[0])  #h
strings numbers etc are immutable in python 

wrapper classes and string in java are immutable but not primitive data types

s[0]="H"  #not allowed, obj doesnt support item assignment
print(s)
 */
