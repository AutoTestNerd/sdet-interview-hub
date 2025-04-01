package com.sdet.designPatterns.BuilderPattern;

//How to Implement BuilderPattern- Step-by-Step Breakdown of the Code
//This is the main class that represents a user registration object.
public class Register {
    private String firstName;
    private String lastName;
    private String email;
    private String tel;
    private String password;
    private String confirmPwd;


   //2. The constructor takes a RegisterBuilder object and initializes the fields from it.
    public Register(RegisterBuilder registerBuilder){
        this.firstName = registerBuilder.firstName;
        this.lastName = registerBuilder.lastName;
        this.email = registerBuilder.email;
        this.tel = registerBuilder.tel;
        this.password = registerBuilder.password;
        this.confirmPwd = registerBuilder.confirmPwd;

    }

    //3. This ensures the object is immutable after creation.

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getTel() {
        return tel;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPwd() {
        return confirmPwd;
    }

    // create static class
    //4. The RegisterBuilder is a nested static class inside Register.
     // It helps to construct a Register object step by step.
    public static class RegisterBuilder{

        private String firstName;
        private String lastName;
        private String email;
        private String tel;
        private String password;
        private String confirmPwd;


        //5.Each setter method sets a value and returns this (the builder itself) to allow method chaining.
        public RegisterBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public RegisterBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public RegisterBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public RegisterBuilder setTel(String tel) {
            this.tel = tel;
            return this;
        }

        public RegisterBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        public RegisterBuilder setConfirmPwd(String confirmPwd) {
            this.confirmPwd = confirmPwd;
            return this;
        }

        // 6. This creates the final Register object using the RegisterBuilder values.

        public Register build(){
            return new Register(this);
        }
    }
}
