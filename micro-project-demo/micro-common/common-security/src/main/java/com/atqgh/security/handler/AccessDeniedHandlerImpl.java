package com.atqgh.security.handler;

import com.alibaba.fastjson.JSON;
import com.atqgh.common.utils.ResultObj;
import com.atqgh.security.utils.WebUtils;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

/**
 * 权限不足导致的失败.
 * @author Mubai
 * @date 2022/7/10 4:12 下午
 **/
@Component
public class AccessDeniedHandlerImpl implements AccessDeniedHandler {

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException, ServletException {

        WebUtils.renderString(response, JSON.toJSONString(ResultObj.error(HttpStatus.FORBIDDEN.value(), "权限不足")));
    }
}
