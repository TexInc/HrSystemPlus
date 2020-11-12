package com.texinc.loytesting.hrsystemplus.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.texinc.loytesting.hrsystemplus.bean.RespBean;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author i@loyio.me
 * @date 2020/11/12 9:06 PM
 */
@Component
public class AuthenticationAccessDeniedHandler implements AccessDeniedHandler {
    @Override
    public void handle(HttpServletRequest httpServletRequest, HttpServletResponse resp,
                       AccessDeniedException e) throws IOException {
        resp.setStatus(HttpServletResponse.SC_FORBIDDEN);
        resp.setContentType("application/json;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        RespBean error = RespBean.error("权限不足，请联系管理员!"+e.getMessage());
        out.write(new ObjectMapper().writeValueAsString(error));
        out.flush();
        out.close();
    }
}
