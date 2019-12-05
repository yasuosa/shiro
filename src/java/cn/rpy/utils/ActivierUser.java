package cn.rpy.utils;

import cn.rpy.domain.User;

import java.util.List;

public class ActivierUser {


    private User user;

    private List<String> roles;

    private List<String> persmissions;

    public ActivierUser(){}
    public ActivierUser(User user, List<String> roles, List<String> persmissions) {
        this.user = user;
        this.roles = roles;
        this.persmissions = persmissions;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public List<String> getPersmissions() {
        return persmissions;
    }

    public void setPersmissions(List<String> persmissions) {
        this.persmissions = persmissions;
    }
}
