package com.hello.buddy.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionSession {

    public static void main(String args[]) throws Exception {
        Member member = new Member();

        // Reflection : 1 - To get the name of the class from its instance object
        Class personClazz = member.getClass();
        System.out.println("PersonClazz : " + personClazz);

        // Reflection : 2 - To get all the constructors available for a class
        Constructor[] constructors = personClazz.getConstructors();
        System.out.println("Count of Constructors : " + constructors.length);

        // Reflection : 3 - To get all the methods available for a class
        Method[] methods = personClazz.getMethods();
        for (Method method : methods) {
            System.out.println("Method name : " + method.getName());
        }

        // Reflection : 4 - Modify the behaviour of a method in runtime
        Method printAge = personClazz.getDeclaredMethod("printAge", int.class);
        printAge.invoke(member, 10);

        // Reflection : 5 - To get all the fields available for a call.
        Field[] declaredFields = personClazz.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println("Field Name : " + field);
        }

        // Reflection : 6 - Modify the state of the private variable
        Field privateField = personClazz.getDeclaredField("name");
        privateField.setAccessible(true);
        privateField.set(member, "Java");
        Method printNameMethod = personClazz.getDeclaredMethod("printName");
        printNameMethod.invoke(member);

        // Reflection : 7 - Access private method
        Method generateIdentifier = personClazz.getDeclaredMethod("generateIdentifier");
        generateIdentifier.setAccessible(true);
        generateIdentifier.invoke(member);
    }
}
