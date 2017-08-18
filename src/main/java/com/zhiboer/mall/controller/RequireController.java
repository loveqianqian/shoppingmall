package com.zhiboer.mall.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhiboer.mall.dto.RequireDto;
import com.zhiboer.mall.model.Order;
import com.zhiboer.mall.model.Require;
import com.zhiboer.mall.service.OrderService;
import com.zhiboer.mall.service.RequireService;
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
@RequestMapping(value = "/require")
public class RequireController {

    @Autowired
    private RequireService requireService;

    /**
     * 获取全部数据
     * @param currentPage 当前页
     * @param rows 查询数量
     * @return
     */
    @RequestMapping(value = "/getAll")
    @ResponseBody
    public ResultWithPage getAllWithPage(@RequestParam(value = "page", required = false) String currentPage, @RequestParam(value = "rows", required = false) String rows, Require require) {

        ResultWithPage result = new ResultWithPage();

        Integer pageNumber = null;
        Integer pageSize = null;

        pageNumber = currentPage == null?1:Integer.parseInt(currentPage);
        pageSize = rows == null?20:Integer.parseInt(rows);

        PageHelper.startPage(pageNumber,pageSize);
        List<Require> list = null;
        if (EmptyUtil.isStrEmpty(require.getShopName())) {
            list = requireService.findAll();
        } else {
            list = requireService.findByLike(require);
        }
        //用PageInfo对结果进行包装
        PageInfo<Require> pageInfo = new PageInfo<>(list);

        Iterator<Require> userIterator = pageInfo.getList().iterator();
        ArrayList<Object> rowDatas = new ArrayList<>();
        while (userIterator.hasNext()) {
            rowDatas.add(userIterator.next());
        }

        result.setRows(rowDatas);
        result.setTotal(pageInfo.getTotal() + "");
        return result;
    }

    @RequestMapping(value = "/addBatch", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    public Map<String, String> addBatchObject(@RequestBody RequireDto dto) {
        Map<String, String> map = new HashMap<>();
        requireService.addBatch(dto);
        map.put("flag", "success");
        return map;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    public Map<String, String> addObject(@RequestBody Require require) {
        Map<String, String> map = new HashMap<>();
        requireService.addOne(require);
        map.put("flag", "success");
        return map;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    public Map<String, String> updateObject(@RequestBody Require require) {
        Map<String, String> map = new HashMap<>();
        requireService.modifyById(require);
        map.put("flag", "success");
        return map;
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, String> updateObject(@PathVariable String id) {
        Map<String, String> map = new HashMap<>();
        requireService.removeById(id);
        map.put("flag", "success");
        return map;
    }
}
