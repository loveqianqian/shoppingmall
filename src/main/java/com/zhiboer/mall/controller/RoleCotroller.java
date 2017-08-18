package com.zhiboer.mall.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhiboer.mall.model.PurchaseOrder;
import com.zhiboer.mall.model.Role;
import com.zhiboer.mall.service.RoleService;
import com.zhiboer.mall.utils.EmptyUtil;
import com.zhiboer.mall.utils.ResultWithPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * Created by yao on 2017/7/25.
 */
@Controller
@RequestMapping(value = "/role")
public class RoleCotroller {

    @Autowired
    private RoleService roleService;

    @RequestMapping(value = "/toRole", method = RequestMethod.GET)
    public String toRole() {
        return "role";
    }

    /**
     * 获取全部数据
     * @param currentPage 当前页
     * @param rows 查询数量
     * @return
     */
    @RequestMapping(value = "/getAll")
    @ResponseBody
    public ResultWithPage getAllWithPage(@RequestParam(value = "page", required = false) String currentPage, @RequestParam(value = "rows", required = false) String rows, Role role) {

        ResultWithPage result = new ResultWithPage();

        Integer pageNumber = null;
        Integer pageSize = null;

        pageNumber = currentPage == null?1:Integer.parseInt(currentPage);
        pageSize = rows == null?20:Integer.parseInt(rows);

        PageHelper.startPage(pageNumber,pageSize);
        List<Role> list = null;
        if (EmptyUtil.isStrEmpty(role.getName())) {
            list = roleService.findAll();
        } else {
            list = roleService.findByLike(role);
        }
        //用PageInfo对结果进行包装
        PageInfo<Role> pageInfo = new PageInfo<>(list);

        Iterator<Role> iterator = pageInfo.getList().iterator();
        ArrayList<Object> rowDatas = new ArrayList<>();
        while (iterator.hasNext()) {
            rowDatas.add(iterator.next());
        }

        result.setRows(rowDatas);
        result.setTotal(pageInfo.getTotal() + "");
        return result;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    public Map<String, String> addObject(@RequestBody Role role) {
        Map<String, String> map = new HashMap<>();
        roleService.addOne(role);
        map.put("flag", "success");
        return map;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    public Map<String, String> updateObject(@RequestBody Role role) {
        Map<String, String> map = new HashMap<>();
        roleService.modifyById(role);
        map.put("flag", "success");
        return map;
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, String> deleteObject(@PathVariable String id) {
        Map<String, String> map = new HashMap<>();
        roleService.removeById(id);
        map.put("flag", "success");
        return map;
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> findAll() {
        Map<String, Object> map = new HashMap<>();
        List<Role> roles = roleService.findAll();
        map.put("flag", "success");
        map.put("roles", roles);
        return map;
    }
}
