package com.devsuperior.dscatalog.lib.dto;

public class UserInsertDTO extends UserDTO{

    private String password;

    UserInsertDTO(){
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
