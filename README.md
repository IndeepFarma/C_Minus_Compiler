# C Minus Compiler (CIS4650)
Developers: Kristan Samaroo, Indeep Farma

Semester: W22 

## Acknowledgements: 
This code is based off the example provided by Kristan Samaroo and Indeep Farma for the assignment. The 
CFGs created in the ``` cm.cup ``` file are based off of the "Syntatic Rules in BNF"
section of the "Specification for the C-Language" pdf provided by Kristan Samaroo and Indeep Farma for the 
assignment. 

## Documentation
The written documentation project report can be found in the 'documentation' folder.

## Executing Compiler: 
The make file has instructions on how to clean, compile, and run the code. The 
following commands are to be run from the root directory of the project. 

To compile: 

``` make ``` 

To run: 

``` java -cp /usr/share/java/cup.jar:. Main  {testFile}``` 

({testFile} is to be replaced with a .cm filename. testFiles/fac.cm for example)

You can also create just the Lexer with ``` make Lexer.java ``` or just the
parser with ``` make parser.java ```. 

## Running Demo Testing Files (fac.cm, gcd.cm, sort.cm, 1.cm - 5.cm):
In order to run the files used in the demo (as per the marking scheme document), you can use the 
makefile targets to run respective files such as the following:

``` make fac ``` 

``` make gcd ``` 

``` make sort ``` 

``` make ex1 ``` 
(replace 1 with [2,3,4,5] for each x.cm file)

### A Small Caveat: 
 - There is a small issue currently that occurs when generating assembly code for a given file. 
    The file being compiled will get overwritten by an empty file and the code needs to be re-
    added to it. 

## Directory Structure: 

The main components of this project include the following: 

##### /absyn
  This directory contains the classes used to represent grammar rules defined 
  in ``` cm.cup ```. They can be split up into two main groups: Declarations 
  and Expressions. ``` Dec ```  and ``` Exp ``` both inherit from ``` Absyn.java ```. 

##### cm.cup
  Contains the CFGs that are used to recognize syntatical patterns. These CFGs create 
  objects of /absyn classes.

##### cm.flex
  Contains regex for matching text in .cm files. These matched items are then used 
  in cm.cup 

##### ShowTreeVisitor.java
  Shows tree created to represent the structure of a given .cm file. 

