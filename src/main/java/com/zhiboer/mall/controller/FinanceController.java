package com.zhiboer.mall.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhiboer.mall.model.Classify;
import com.zhiboer.mall.model.Finance;
import com.zhiboer.mall.service.ClassifyService;
import com.zhiboer.mall.service.FinanceService;
import com.zhiboer.mall.utils.ResultWithPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * Created by yao on 2017/7/31.
 */
@Controller
@RequestMapping(value = "/finance")
public class FinanceController {

    @Autowired
    private FinanceService financeService;

    @RequestMapping(value = "/toFinance", method = RequestMethod.GET)
    public String toFinance() {
        return "finance";
    }

    /**
     * 获取全部数据
     * @param currentPage 当前页
     * @param rows 查询数量
     * @return
     */
    @RequestMapping(value = "/getAll")
    @ResponseBody
    public ResultWithPage getAllWithPage(@RequestParam(value = "page", required = false) String currentPage, @RequestParam(value = "rows", required = false) String rows, Finance finance) {

        ResultWithPage result = new ResultWithPage();

        Integer pageNumber = null;
        Integer pageSize = null;

        pageNumber = currentPage == null?1:Integer.parseInt(currentPage);
        pageSize = rows == null?20:Integer.parseInt(rows);

        PageHelper.startPage(pageNumber,pageSize);
        List<Finance> list = null;
        if (finance.getShopId() == null || "".equals(finance.getShopId())) {
            list = financeService.findAll();
        } else {
            list = financeService.findByLike(finance);
        }
        //用PageInfo对结果进行包装
        PageInfo<Finance> pageInfo = new PageInfo<>(list);

        Iterator<Finance> userIterator = pageInfo.getList().iterator();
        ArrayList<Object> rowDatas = new ArrayList<>();
        while (userIterator.hasNext()) {
            rowDatas.add(userIterator.next());
        }

        result.setRows(rowDatas);
        result.setTotal(pageInfo.getTotal() + "");
        return result;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    public Map<String, String> addUser(@RequestBody Finance finance) {
        Map<String, String> map = new HashMap<>();
        financeService.addOne(finance);
        map.put("flag", "success");
        return map;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    public Map<String, String> updateUser(@RequestBody Finance finance) {
        Map<String, String> map = new HashMap<>();
        financeService.modifyById(finance);
        map.put("flag", "success");
        return map;
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, String> updateUser(@PathVariable String id) {
        Map<String, String> map = new HashMap<>();
        financeService.removeById(id);
        map.put("flag", "success");
        return map;
    }
}
