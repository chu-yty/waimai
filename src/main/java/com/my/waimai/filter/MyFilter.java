package com.my.waimai.filter;

import com.alibaba.fastjson.JSON;
import com.my.waimai.Factory.MySession;
import com.my.waimai.common.MyBaseContext;
import com.my.waimai.common.R;
import com.my.waimai.entity.Employee;
import com.my.waimai.mapper.yonghuMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.DigestUtils;

import javax.servlet.*;

import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName = "myfilter", urlPatterns = "/*")
@Slf4j
public class MyFilter implements Filter {


    public static final AntPathMatcher PATH_MATCHER = new AntPathMatcher();
    @Override
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;
        HttpSession session = req.getSession();
//        "/backend/page/login/login.html",
        String[] uris = {
                "/user/**",
                "/employee/login",
                "/backend/**",
                "/front/**"};

        String requestURI = req.getRequestURI();
        log.info("请求URI{}",requestURI);
        for (String uri : uris) {
            if (PATH_MATCHER.match(uri, requestURI)) {
                filterChain.doFilter(req, resp);
                return;
            }
        }

        Long id= (Long) session.getAttribute("employee");
        if (session.getAttribute("employee")!= null) {
            log.info("后台已登录");
            MyBaseContext.setThreadLocal(id);
            filterChain.doFilter(req, resp);
            return;
        }
        log.info("用户未登录");
        Long yonghuid= (Long) session.getAttribute("user");
        if (session.getAttribute("user")!= null) {
            log.info("客户已登录");
            MyBaseContext.setThreadLocal(yonghuid);
            filterChain.doFilter(req, resp);
            return;
        }
        //5、如果未登录则返回未登录结果，通过输出流方式向客户端页面响应数据
        resp.getWriter().write(JSON.toJSONString(R.error("NOTLOGIN")));
        return;
    }

//    public static final AntPathMatcher PATH_MATCHER = new AntPathMatcher();

//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        HttpServletRequest request = (HttpServletRequest) servletRequest;
//        HttpServletResponse response = (HttpServletResponse) servletResponse;
//
//        //1、获取本次请求的URI
//        String requestURI = request.getRequestURI();// /backend/index.html
//
//        log.info("拦截到请求：{}",requestURI);
//
//        //定义不需要处理的请求路径
//        String[] urls = new String[]{
//                "/employee/login",
//                "/employee/logout",
//                "/backend/**",
//                "/front/**"
//        };
//
//
//        //2、判断本次请求是否需要处理
//        boolean check = check(urls, requestURI);
//
//        //3、如果不需要处理，则直接放行
//        if(check){
//            log.info("本次请求{}不需要处理",requestURI);
//            filterChain.doFilter(request,response);
//            return;
//        }
//
//        //4、判断登录状态，如果已登录，则直接放行
//
//        if(request.getSession().getAttribute("employee") != null){
//            log.info("用户已登录，用户id为：{}",request.getSession().getAttribute("employee"));
//            filterChain.doFilter(request,response);
//            return;
//        }
//
//        log.info("用户未登录");
//        //5、如果未登录则返回未登录结果，通过输出流方式向客户端页面响应数据
//        response.getWriter().write(JSON.toJSONString(R.error("NOTLOGIN")));
//        return;
//
//    }
//
//    /**
//     * 路径匹配，检查本次请求是否需要放行
//     * @param urls
//     * @param requestURI
//     * @return
//     */
//    public boolean check(String[] urls,String requestURI){
//        for (String url : urls) {
//            boolean match = PATH_MATCHER.match(url, requestURI);
//            if(match){
//                return true;
//            }
//        }
//        return false;
//    }
}
