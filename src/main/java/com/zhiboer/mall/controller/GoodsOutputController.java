package com.zhiboer.mall.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhiboer.mall.model.GoodsInput;
import com.zhiboer.mall.model.GoodsOutput;
import com.zhiboer.mall.service.GoodsInputService;
import com.zhiboer.mall.service.GoodsOutputService;
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
@RequestMapping(value = "/goodsOutput")
public class GoodsOutputController {

    @Autowired
    private GoodsOutputService goodsOutputService;

    /**
     * 获取全部数据
     * @param currentPage 当前页
     * @param rows 查询数量
     * @return
     */
    @RequestMapping(value = "/getAll")
    @ResponseBody
    public ResultWithPage getAllWithPage(@RequestParam(value = "page", required = false) String currentPage, @RequestParam(value = "rows", required = false) String rows, GoodsOutput goodsOutput) {

        ResultWithPage result = new ResultWithPage();

        Integer pageNumber = null;
        Integer pageSize = null;

        pageNumber = currentPage == null?1:Integer.parseInt(currentPage);
        pageSize = rows == null?20:Integer.parseInt(rows);

        PageHelper.startPage(pageNumber,pageSize);
        List<GoodsOutput> list = null;
        if (EmptyUtil.isStrEmpty(goodsOutput.getOrderCode())) {
            list = goodsOutputService.findAll();
        } else {
            list = goodsOutputService.findByLike(goodsOutput);
        }
        //用PageInfo对结果进行包装
        PageInfo<GoodsOutput> pageInfo = new PageInfo<>(list);

        Iterator<GoodsOutput> userIterator = pageInfo.getList().iterator();
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
    public Map<String, String> addObject(@RequestBody GoodsOutput goodsOutput) {
        Map<String, String> map = new HashMap<>();
        goodsOutputService.addOne(goodsOutput);
        map.put("flag", "success");
        return map;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    public Map<String, String> updateObject(@RequestBody GoodsOutput goodsOutput) {
        Map<String, String> map = new HashMap<>();
        goodsOutputService.modifyById(goodsOutput);
        map.put("flag", "success");
        return map;
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, String> updateObject(@PathVariable String id) {
        Map<String, String> map = new HashMap<>();
        goodsOutputService.removeById(id);
        map.put("flag", "success");
        return map;
    }
}
