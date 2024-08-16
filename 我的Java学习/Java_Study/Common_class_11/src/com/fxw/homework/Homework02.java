package com.fxw.homework;

/**
 * @author 冯肖伟
 * @version 1.0
 */
public class Homework02 {
    public static void main(String[] args) {
        Person person = new Person("fxw", "130626", "354783@qq.com");
        System.out.println(person);
    }
}

class Person {
    private String name;
    private String password;
    private String email;

    public Person(String name, String password, String email) {
        setName(name);
        setPassword(password);
        setEmail(email);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 4 || name.length() < 2) {
            throw new RuntimeException();
        }
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() != 6 || !(Person.isNumeric(password))) {
            throw new RuntimeException("格式不对");
        }
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.indexOf("@") < 0 || email.indexOf(".") < 0 || email.indexOf("@") > email.indexOf(".")) {
            throw new RuntimeException("格式不正确");
        }
        this.email = email;
    }


    public static boolean isNumeric(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
