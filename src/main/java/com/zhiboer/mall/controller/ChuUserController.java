package com.zhiboer.mall.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhiboer.mall.model.ChuUser;
import com.zhiboer.mall.service.ChuUserService;
import com.zhiboer.mall.service.RoleService;
import com.zhiboer.mall.utils.EZQueryDto;
import com.zhiboer.mall.utils.ResultWithPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.*;

/**
 * Created by yao on 2017/7/21.
 */
@Controller
@RequestMapping(value = "/user")
public class ChuUserController {

    @Autowired
    private ChuUserService chuUserService;

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpServletRequest request){
        HttpSession session = request.getSession();
        session.invalidate();
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(HttpServletRequest request){

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String remember = request.getParameter("remember");

        HttpSession session = request.getSession();
        session.setAttribute("username", username);
        return "index";
    }

    @RequestMapping(value = "/toMessages", method = RequestMethod.GET)
    public String toMessages() {
        return "messages";
    }

    @RequestMapping(value = "/toUser", method = RequestMethod.GET)
    public String toUser() {
        return "user";
    }

    @RequestMapping(value = "/toSetting", method = RequestMethod.GET)
    public String toSetting() {
        return "setting";
    }

    @RequestMapping(value = "/toIndex", method = RequestMethod.GET)
    public String toIndex() {
        return "index";
    }

    /**
     * 获取全部用户
     * @param currentPage 当前页
     * @param rows 查询数量
     * @return
     */
    @RequestMapping(value = "/getAll")
    @ResponseBody
    public ResultWithPage getAllWithPage(@RequestParam(value = "page", required = false) String currentPage, @RequestParam(value = "rows", required = false) String rows, ChuUser chuUser) {
        System.out.println(currentPage);
        System.out.println(rows);

        ResultWithPage result = new ResultWithPage();

        Integer pageNumber = null;
        Integer pageSize = null;

        pageNumber = currentPage == null?1:Integer.parseInt(currentPage);
        pageSize = rows == null?20:Integer.parseInt(rows);

        PageHelper.startPage(pageNumber,pageSize);
        List<ChuUser> list = null;
        if (chuUser.getUserName() == null || "".equals(chuUser.getUserName())) {
            list = chuUserService.findAll();
        } else {
            list = chuUserService.findByLike(chuUser);
        }
        //用PageInfo对结果进行包装
        PageInfo<ChuUser> pageInfo = new PageInfo<>(list);

        Iterator<ChuUser> userIterator = pageInfo.getList().iterator();
        ArrayList<Object> chuUsers = new ArrayList<>();
        while (userIterator.hasNext()) {
            chuUsers.add(userIterator.next());
        }


        result.setRows(chuUsers);
        result.setTotal(pageInfo.getTotal() + "");
        return result;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    public Map<String, String> addObject(@RequestBody ChuUser chuUser) {
        Map<String, String> map = new HashMap<>();
        chuUserService.addOne(chuUser);
        map.put("flag", "success");
        return map;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    public Map<String, String> updateObject(@RequestBody ChuUser chuUser) {
        Map<String, String> map = new HashMap<>();
        chuUserService.modifyById(chuUser);
        map.put("flag", "success");
        return map;
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, String> deleteObject(@PathVariable String id) {
        Map<String, String> map = new HashMap<>();
        chuUserService.removeById(id);
        map.put("flag", "success");
        return map;
    }
}
