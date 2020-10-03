package com.hello.buddy.annotation;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class ApplicationContainer {

    private Application application;
    private final AnnotationProcessor annotationProcessor;
    private Map<Endpoint.HttpMethodType, Map<String, String>> operationMap;

    public ApplicationContainer(Application application) {
        this.application = application;
        this.annotationProcessor = new AnnotationProcessor(application);
        constructAllOperations();
    }

    private void constructAllOperations() {
        this.operationMap = this.annotationProcessor.constructAllOperations();
    }

    public void execute(String endPoint, Endpoint.HttpMethodType methodType) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        if (checkAuthorization(application.getPerson().getRole(), findOperation(endPoint, methodType))) {
            invoke(findOperation(endPoint, methodType));
        } else {
            deny();
        }
    }

    private void invoke(String operation) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        this.annotationProcessor.invoke(operation);
    }

    private void deny() {
        System.out.println("You are not authorized to do this operation");
    }

    private String findOperation(String endPoint, Endpoint.HttpMethodType methodType) {
        return operationMap.get(methodType).get(endPoint);
    }

    private boolean checkAuthorization(RoleType roleType, String operation) {
        return this.annotationProcessor.checkAuthorization(roleType, operation);
    }
}
