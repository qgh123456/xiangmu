package com.atqgh.auth.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author Mubai
 * @description
 * @date 2022/6/18 5:41 下午
 **/
@Data
public class MicroAuthUser implements Serializable {

    private static final long serialVersionUID = -1748289340320186418L;

    private String username;

    private String password;

    private boolean accountNonExpired = true;

    private boolean accountNonLocked= true;

    private boolean credentialsNonExpired= true;

    private boolean enabled= true;

}
