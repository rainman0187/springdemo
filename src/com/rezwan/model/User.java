package com.rezwan.model; 

import java.io.Serializable;

public class User implements Serializable{

    private static final long serialVersionUID = 3647233284813657927L;

    private String id;
    private String name = null;
    private String standard = null;
    private String age;
    private String sex = null;

    //setter and getter have been omitted to make the code short

    @Override
    public String toString() {
        return "User [name=" + name + ", standard=" + standard + ", age=" + age
        + ", sex=" + sex + "]";
    }
}