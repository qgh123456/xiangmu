package com.atqgh.security.jwt;

import com.alibaba.fastjson.JSONObject;
import com.atqgh.common.utils.ResultObj;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

public class JWTAuthenticationEntryPoint implements AuthenticationEntryPoint {

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        response.setStatus(HttpServletResponse.SC_FORBIDDEN);
        String reason = authException.getMessage();
        response.getWriter().write(JSONObject.toJSONString(ResultObj.error(HttpServletResponse.SC_FORBIDDEN, reason)));
    }
}
