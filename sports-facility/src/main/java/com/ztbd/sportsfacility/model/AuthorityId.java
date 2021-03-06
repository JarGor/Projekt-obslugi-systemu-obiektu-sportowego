package com.ztbd.sportsfacility.model;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AuthorityId implements Serializable {

    @ManyToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE,
                           CascadeType.PERSIST, CascadeType.REFRESH })
    private User user;

    private String authority;

    public AuthorityId() {}

    public AuthorityId(User user, String authority) {
        this.user = user;
        this.authority = authority;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AuthorityId that = (AuthorityId) o;
        return Objects.equals(user, that.user) &&
                authority.equalsIgnoreCase(that.authority);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, authority);
    }
}