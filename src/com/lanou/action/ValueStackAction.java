package com.lanou.action;

import com.lanou.domain.Person;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by dllo on 17/10/26.
 */
public class ValueStackAction extends ActionSupport{
    private String username;
    private String password;
    @Override
    public String execute() throws Exception {

        ActionContext ctx = ActionContext.getContext();

        ctx.put("book","李白");
        //把值存到session中
        Map<String,Object> session = ctx.getSession();
        session.put("author","韩信");
        //存放到application中
        Map<String, Object> app = ctx.getApplication();
        app.put("price",18);
        //
        HttpServletRequest req = ServletActionContext.getRequest();
        req.setAttribute("attr","赵云");
        // 获取值栈(ValueStack)对象的方式
        // 1.
        ValueStack vs1 = ctx.getValueStack();
        Person p = new Person("zw",16);
        vs1.push(p);


        // 2.
        Map<String, Object> reqAttrs = (Map<String, Object>) ctx.get("request");
        ValueStack vs2 = (ValueStack) reqAttrs.get("struts.valueStack");

        // 3. 实际上就是第一种方式的方法体  (点进去看看  就不写了)


        return super.execute();
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
