package com.zhiboer.mall.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhiboer.mall.model.ChuUser;
import com.zhiboer.mall.model.Classify;
import com.zhiboer.mall.service.ClassifyService;
import com.zhiboer.mall.utils.ResultWithPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * Created by yao on 2017/8/1.
 */
@Controller
@RequestMapping(value = "/classify")
public class ClassifyController {

    @Autowired
    private ClassifyService classifyService;

    @RequestMapping(value = "/toClassify", method = RequestMethod.GET)
    public String toStatistics() {
        return "classify";
    }

    /**
     * 获取全部数据
     * @param currentPage 当前页
     * @param rows 查询数量
     * @return
     */
    @RequestMapping(value = "/getAll")
    @ResponseBody
    public ResultWithPage getAllWithPage(@RequestParam(value = "page", required = false) String currentPage, @RequestParam(value = "rows", required = false) String rows, Classify classify) {

        ResultWithPage result = new ResultWithPage();

        Integer pageNumber = null;
        Integer pageSize = null;

        pageNumber = currentPage == null?1:Integer.parseInt(currentPage);
        pageSize = rows == null?20:Integer.parseInt(rows);

        PageHelper.startPage(pageNumber,pageSize);
        List<Classify> list = null;
        if (classify.getName() == null || "".equals(classify.getName())) {
            list = classifyService.findAll();
        } else {
            list = classifyService.findByLike(classify);
        }
        //用PageInfo对结果进行包装
        PageInfo<Classify> pageInfo = new PageInfo<>(list);

        Iterator<Classify> userIterator = pageInfo.getList().iterator();
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
    public Map<String, String> addObject(@RequestBody Classify classify) {
        Map<String, String> map = new HashMap<>();
        classifyService.addOne(classify);
        map.put("flag", "success");
        return map;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    public Map<String, String> updateObject(@RequestBody Classify classify) {
        Map<String, String> map = new HashMap<>();
        classifyService.modifyById(classify);
        map.put("flag", "success");
        return map;
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, String> updateObject(@PathVariable String id) {
        Map<String, String> map = new HashMap<>();
        classifyService.removeById(id);
        map.put("flag", "success");
        return map;
    }
}
