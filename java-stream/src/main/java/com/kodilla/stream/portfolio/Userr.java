package com.kodilla.stream.portfolio;

public final class Userr {

    private final String username;
    private final String realName;

    public Userr(final String username, final String realName) {
        this.username = username;
        this.realName = realName;
    }

    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Userr)) return false;
        Userr user = (Userr) o;
        return username.equals(user.username);
    }
}