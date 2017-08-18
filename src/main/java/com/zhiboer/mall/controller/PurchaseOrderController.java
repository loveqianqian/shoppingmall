package com.zhiboer.mall.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhiboer.mall.model.Provider;
import com.zhiboer.mall.model.PurchaseOrder;
import com.zhiboer.mall.service.PurchaseOrderService;
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
@RequestMapping(value = "/purchaseOrder")
public class PurchaseOrderController {

    @Autowired
    private PurchaseOrderService purchaseOrderService;

    @RequestMapping(value = "/toOrder", method = RequestMethod.GET)
    public String toOrder() {
        return "order";
    }

    @RequestMapping(value = "/toPurOrder", method = RequestMethod.GET)
    public String toPurchaseOrder() {
        return "purchase-order";
    }

    @RequestMapping(value = "/toCount", method = RequestMethod.GET)
    public String toCount() {
        return "purchase-count";
    }

    /**
     * 获取全部数据
     * @param currentPage 当前页
     * @param rows 查询数量
     * @return
     */
    @RequestMapping(value = "/getAll")
    @ResponseBody
    public ResultWithPage getAllWithPage(@RequestParam(value = "page", required = false) String currentPage, @RequestParam(value = "rows", required = false) String rows, PurchaseOrder purchaseOrder) {

        ResultWithPage result = new ResultWithPage();

        Integer pageNumber = null;
        Integer pageSize = null;

        pageNumber = currentPage == null?1:Integer.parseInt(currentPage);
        pageSize = rows == null?20:Integer.parseInt(rows);

        PageHelper.startPage(pageNumber,pageSize);
        List<PurchaseOrder> list = null;
        if (EmptyUtil.isStrEmpty(purchaseOrder.getOrderCode())) {
            list = purchaseOrderService.findAll();
        } else {
            list = purchaseOrderService.findByLike(purchaseOrder);
        }
        //用PageInfo对结果进行包装
        PageInfo<PurchaseOrder> pageInfo = new PageInfo<>(list);

        Iterator<PurchaseOrder> iterator = pageInfo.getList().iterator();
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
    public Map<String, String> addObject(@RequestBody PurchaseOrder purchaseOrder) {
        Map<String, String> map = new HashMap<>();
        purchaseOrderService.addOne(purchaseOrder);
        map.put("flag", "success");
        return map;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    public Map<String, String> updateObject(@RequestBody PurchaseOrder purchaseOrder) {
        Map<String, String> map = new HashMap<>();
        purchaseOrderService.modifyById(purchaseOrder);
        map.put("flag", "success");
        return map;
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, String> deleteObject(@PathVariable String id) {
        Map<String, String> map = new HashMap<>();
        purchaseOrderService.removeById(id);
        map.put("flag", "success");
        return map;
    }
}
