package com.atqgh.auth.properties;

import lombok.Data;

/**
 * @author Mubai
 * @date 2022/6/30 3:40 下午
 **/
@Data
public class ClientsProperties {

    private String client;

    private String secret;

    private String grantType = "password,authorization_code,refresh_token";

    private String scope = "all";
}
