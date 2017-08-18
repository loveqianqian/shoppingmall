package com.zhiboer.mall.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhiboer.mall.model.Require;
import com.zhiboer.mall.model.Statistics;
import com.zhiboer.mall.service.RequireService;
import com.zhiboer.mall.service.StatisticsService;
import com.zhiboer.mall.utils.EmptyUtil;
import com.zhiboer.mall.utils.ResultWithPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * Created by yao on 2017/8/14.
 */
@Controller
@RequestMapping(value = "/statistics")
public class StatisticsController {

    @Autowired
    private StatisticsService statisticsService;

    /**
     * 获取全部数据
     * @param currentPage 当前页
     * @param rows 查询数量
     * @return
     */
    @RequestMapping(value = "/getAll")
    @ResponseBody
    public ResultWithPage getAllWithPage(@RequestParam(value = "page", required = false) String currentPage, @RequestParam(value = "rows", required = false) String rows, Statistics statistics) {

        ResultWithPage result = new ResultWithPage();

        Integer pageNumber = null;
        Integer pageSize = null;

        pageNumber = currentPage == null?1:Integer.parseInt(currentPage);
        pageSize = rows == null?20:Integer.parseInt(rows);

        PageHelper.startPage(pageNumber,pageSize);
        List<Statistics> list = null;
        if (EmptyUtil.isStrEmpty(statistics.getShopCode())) {
            list = statisticsService.findAll();
        } else {
            list = statisticsService.findByLike(statistics);
        }
        //用PageInfo对结果进行包装
        PageInfo<Statistics> pageInfo = new PageInfo<>(list);

        Iterator<Statistics> userIterator = pageInfo.getList().iterator();
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
    public Map<String, String> addObject(@RequestBody Statistics statistics) {
        Map<String, String> map = new HashMap<>();
        statisticsService.addOne(statistics);
        map.put("flag", "success");
        return map;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    public Map<String, String> updateObject(@RequestBody Statistics statistics) {
        Map<String, String> map = new HashMap<>();
        statisticsService.modifyById(statistics);
        map.put("flag", "success");
        return map;
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, String> updateObject(@PathVariable String id) {
        Map<String, String> map = new HashMap<>();
        statisticsService.removeById(id);
        map.put("flag", "success");
        return map;
    }
}
