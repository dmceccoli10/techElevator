package com.techelevator.accessmodifiers.packageB;


import com.techelevator.accessmodifiers.packageA.ClassA;

public class ClassB extends ClassA {

   public boolean methodB() {
           methodA();
          // anotherMethodA(); //wont work because it has default/package access
           return true;
       }
   }

