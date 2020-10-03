package com.hello.buddy.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnnotationProcessor {

    private final Method[] declaredMethods;
    private final Class<?> applicationClass;
    private Map<Endpoint.HttpMethodType, Map<String, String>> operationsMap = new HashMap<Endpoint.HttpMethodType, Map<String, String>>();
    private Application application;

    public AnnotationProcessor(Application application) {
        this.application = application;
        applicationClass = this.application.getClass();
        declaredMethods = applicationClass.getDeclaredMethods();
    }

    public boolean checkAuthorization(RoleType roleType, String operation) {
        for (Method method : declaredMethods) {
            if (method.getName().equalsIgnoreCase(operation)) {
                Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                if (declaredAnnotations != null) {
                    for (Annotation annotation : declaredAnnotations) {
                        ApplicationSecurity applicationSecurity = (ApplicationSecurity) annotation;
                        return Arrays.asList(applicationSecurity.roleType()).contains(roleType);
                    }
                }
            }
        }
        return false;
    }

    public void invoke(String operation) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method operationMethod = applicationClass.getDeclaredMethod(operation);
        operationMethod.invoke(application);
    }

    public Map<Endpoint.HttpMethodType, Map<String, String>> constructAllOperations() {
        for (Method method : declaredMethods) {
            Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
            if (declaredAnnotations != null) {
                for (Annotation annotation : declaredAnnotations) {
                    if (annotation instanceof Endpoint) {
                        Endpoint endpoint = (Endpoint) annotation;
                        if (operationsMap.get(endpoint.type()) != null) {
                            operationsMap.get(endpoint.type()).put(endpoint.url(), method.getName());
                        } else {
                            Map<String, String> endpointMap = new HashMap<String, String>();
                            endpointMap.put(endpoint.url(), method.getName());
                            operationsMap.put(endpoint.type(), endpointMap);
                        }
                    }
                }
            }
        }
        return operationsMap;
    }
}
