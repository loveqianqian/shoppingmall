package com.zhiboer.mall.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhiboer.mall.model.Provider;
import com.zhiboer.mall.model.WarehouseGoods;
import com.zhiboer.mall.service.ProviderService;
import com.zhiboer.mall.utils.EmptyUtil;
import com.zhiboer.mall.utils.ResultWithPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * Created by yao on 2017/7/25.
 */
@Controller
@RequestMapping(value = "/provider")
public class ProviderController {

    @Autowired
    private ProviderService providerService;

    @RequestMapping(value = "/toProvider", method = RequestMethod.GET)
    public String toProvider() {
        return "provider";
    }

    /**
     * 获取全部数据
     * @param currentPage 当前页
     * @param rows 查询数量
     * @return
     */
    @RequestMapping(value = "/getAll")
    @ResponseBody
    public ResultWithPage getAllWithPage(@RequestParam(value = "page", required = false) String currentPage, @RequestParam(value = "rows", required = false) String rows, Provider provider) {

        ResultWithPage result = new ResultWithPage();

        Integer pageNumber = null;
        Integer pageSize = null;

        pageNumber = currentPage == null?1:Integer.parseInt(currentPage);
        pageSize = rows == null?20:Integer.parseInt(rows);

        PageHelper.startPage(pageNumber,pageSize);
        List<Provider> list = null;
        if (EmptyUtil.isStrEmpty(provider.getName())) {
            list = providerService.findAll();
        } else {
            list = providerService.findByLike(provider);
        }
        //用PageInfo对结果进行包装
        PageInfo<Provider> pageInfo = new PageInfo<>(list);

        Iterator<Provider> iterator = pageInfo.getList().iterator();
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
    public Map<String, String> addObject(@RequestBody Provider provider) {
        Map<String, String> map = new HashMap<>();
        providerService.addOne(provider);
        map.put("flag", "success");
        return map;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    public Map<String, String> updateObject(@RequestBody Provider provider) {
        Map<String, String> map = new HashMap<>();
        providerService.modifyById(provider);
        map.put("flag", "success");
        return map;
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, String> deleteObject(@PathVariable String id) {
        Map<String, String> map = new HashMap<>();
        providerService.removeById(id);
        map.put("flag", "success");
        return map;
    }
}
