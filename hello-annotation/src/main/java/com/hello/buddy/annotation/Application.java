package com.hello.buddy.annotation;

public class Application {

    private final Person person;

    public Application(Person person) {
        this.person = person;
    }

    @ApplicationSecurity(roleType = RoleType.ADMIN)
    @Endpoint(url = "/transaction", type = Endpoint.HttpMethodType.PUT)
    public void modifyTransaction() {
        System.out.println("Transaction is modified");
    }

    @ApplicationSecurity(roleType = {RoleType.ADMIN, RoleType.USER})
    @Endpoint(url = "/transaction", type = Endpoint.HttpMethodType.GET)
    public void viewTransaction() {
        System.out.println("Here is your transaction");
    }

    public Person getPerson() {
        return person;
    }
}
