package com.zhiboer.mall.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhiboer.mall.model.Classify;
import com.zhiboer.mall.model.GoodsInput;
import com.zhiboer.mall.service.GoodsInputService;
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
@RequestMapping(value = "/goodsInput")
public class GoodsInputController {

    @Autowired
    private GoodsInputService goodsInputService;

    /**
     * 获取全部数据
     * @param currentPage 当前页
     * @param rows 查询数量
     * @return
     */
    @RequestMapping(value = "/getAll")
    @ResponseBody
    public ResultWithPage getAllWithPage(@RequestParam(value = "page", required = false) String currentPage, @RequestParam(value = "rows", required = false) String rows, GoodsInput goodsInput) {

        ResultWithPage result = new ResultWithPage();

        Integer pageNumber = null;
        Integer pageSize = null;

        pageNumber = currentPage == null?1:Integer.parseInt(currentPage);
        pageSize = rows == null?20:Integer.parseInt(rows);

        PageHelper.startPage(pageNumber,pageSize);
        List<GoodsInput> list = null;
        if (EmptyUtil.isStrEmpty(goodsInput.getOrderCode())) {
            list = goodsInputService.findAll();
        } else {
            list = goodsInputService.findByLike(goodsInput);
        }
        //用PageInfo对结果进行包装
        PageInfo<GoodsInput> pageInfo = new PageInfo<>(list);

        Iterator<GoodsInput> userIterator = pageInfo.getList().iterator();
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
    public Map<String, String> addObject(@RequestBody GoodsInput goodsInput) {
        Map<String, String> map = new HashMap<>();
        goodsInputService.addOne(goodsInput);
        map.put("flag", "success");
        return map;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    public Map<String, String> updateObject(@RequestBody GoodsInput goodsInput) {
        Map<String, String> map = new HashMap<>();
        goodsInputService.modifyById(goodsInput);
        map.put("flag", "success");
        return map;
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, String> updateObject(@PathVariable String id) {
        Map<String, String> map = new HashMap<>();
        goodsInputService.removeById(id);
        map.put("flag", "success");
        return map;
    }
}
