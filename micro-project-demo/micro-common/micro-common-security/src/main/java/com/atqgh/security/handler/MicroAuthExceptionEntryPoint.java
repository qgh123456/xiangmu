package com.atqgh.security.handler;

import com.atqgh.common.utils.ResultObj;
import com.atqgh.common.utils.WebUtil;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.http.MediaType;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

/**
 * 处理资源服务器异常.
 * 令牌不正确返回401
 * @author Mubai
 * @date 2022/6/30 4:35 下午
 **/
public class MicroAuthExceptionEntryPoint implements AuthenticationEntryPoint {

    @Override
    public void commence(HttpServletRequest httpServletRequest, HttpServletResponse response, AuthenticationException e)
            throws IOException{

        WebUtil.makeResponse(response, MediaType.APPLICATION_JSON_UTF8_VALUE,HttpServletResponse.SC_UNAUTHORIZED, ResultObj.error("token无效"));
    }
}
