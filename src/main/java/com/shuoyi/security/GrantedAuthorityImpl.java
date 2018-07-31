package com.shuoyi.security;

import org.springframework.security.core.GrantedAuthority;

/**
 * Created by zhaosy-c on 2018/7/30.
 */
public class GrantedAuthorityImpl implements GrantedAuthority {

    private String authority;

    public GrantedAuthorityImpl(String authority) {
        this.authority = authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return this.authority;
    }
}
