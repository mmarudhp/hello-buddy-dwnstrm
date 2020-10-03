package com.hello.buddy.annotation;

import java.lang.reflect.InvocationTargetException;

public class Client {

    public static void main(String args[]) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        ApplicationContainer applicationContainer = new ApplicationContainer(getApplication());
        applicationContainer.execute("/transaction", Endpoint.HttpMethodType.PUT);
    }

    private static Application getApplication() {
        return new Application(loginPerson());
    }

    private static Person loginPerson() {
        return new Person("Marudhu", RoleType.USER);
    }
}
