package com.zhiboer.mall.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhiboer.mall.dto.GoodsDto;
import com.zhiboer.mall.model.Finance;
import com.zhiboer.mall.model.ShopGoods;
import com.zhiboer.mall.model.WarehouseGoods;
import com.zhiboer.mall.service.GoodsService;
import com.zhiboer.mall.service.ShopGoodsService;
import com.zhiboer.mall.service.WarehouseGoodsService;
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
@RequestMapping(value = "/goods")
public class GoodsController {

    @Autowired
    private ShopGoodsService shopGoodsService;
    @Autowired
    private WarehouseGoodsService warehouseGoodsService;

    @RequestMapping(value = "/toRequire", method = RequestMethod.GET)
    public String toMessages() {
        return "require";
    }

    @RequestMapping(value = "/toShopGoods", method = RequestMethod.GET)
    public String toShopGoods() {
        return "shop-goods";
    }

    @RequestMapping(value = "/toHouseGoods", method = RequestMethod.GET)
    public String toHouseGoods() {
        return "warehouse-goods";
    }

    @RequestMapping(value = "/toPutin", method = RequestMethod.GET)
    public String toPutin() {
        return "goods-putin";
    }

    @RequestMapping(value = "/toPutout", method = RequestMethod.GET)
    public String toPutout() {
        return "goods-putout";
    }

    /**
     * 获取全部数据
     * @param currentPage 当前页
     * @param rows 查询数量
     * @return
     */
    @RequestMapping(value = "/shop/getAll")
    @ResponseBody
    public ResultWithPage getShopGoodsAllWithPage(@RequestParam(value = "page", required = false) String currentPage, @RequestParam(value = "rows", required = false) String rows, GoodsDto goodsDto) {

        ResultWithPage result = new ResultWithPage();

        Integer pageNumber = null;
        Integer pageSize = null;

        pageNumber = currentPage == null?1:Integer.parseInt(currentPage);
        pageSize = rows == null?20:Integer.parseInt(rows);

        PageHelper.startPage(pageNumber,pageSize);
        List<ShopGoods> list = null;
        if (EmptyUtil.isStrEmpty(goodsDto.getGoodsName()) || EmptyUtil.isStrEmpty(goodsDto.getGoodsCode()) ||
                EmptyUtil.isStrEmpty(goodsDto.getStartTime()) || EmptyUtil.isStrEmpty(goodsDto.getEndTime())) {
            list = shopGoodsService.findAll();
        } else {
            list = shopGoodsService.findByLike(goodsDto);
        }
        //用PageInfo对结果进行包装
        PageInfo<ShopGoods> pageInfo = new PageInfo<>(list);

        Iterator<ShopGoods> iterator = pageInfo.getList().iterator();
        ArrayList<Object> rowDatas = new ArrayList<>();
        while (iterator.hasNext()) {
            rowDatas.add(iterator.next());
        }

        result.setRows(rowDatas);
        result.setTotal(pageInfo.getTotal() + "");
        return result;
    }

    @RequestMapping(value = "/shop/add", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    public Map<String, String> addShopGoods(@RequestBody ShopGoods shopGoods) {
        Map<String, String> map = new HashMap<>();
        shopGoodsService.addOne(shopGoods);
        map.put("flag", "success");
        return map;
    }

    @RequestMapping(value = "/shop/update", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    public Map<String, String> updateShopGoods(@RequestBody ShopGoods shopGoods) {
        Map<String, String> map = new HashMap<>();
        shopGoodsService.modifyById(shopGoods);
        map.put("flag", "success");
        return map;
    }

    @RequestMapping(value = "/shop/delete/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, String> updateShopGoods(@PathVariable String id) {
        Map<String, String> map = new HashMap<>();
        shopGoodsService.removeById(id);
        map.put("flag", "success");
        return map;
    }

    /**
     * 获取全部数据
     * @param currentPage 当前页
     * @param rows 查询数量
     * @return
     */
    @RequestMapping(value = "/warehouse/getAll")
    @ResponseBody
    public ResultWithPage getWarehouseGoodsAllWithPage(@RequestParam(value = "page", required = false) String currentPage, @RequestParam(value = "rows", required = false) String rows, GoodsDto goodsDto) {

        ResultWithPage result = new ResultWithPage();

        Integer pageNumber = null;
        Integer pageSize = null;

        pageNumber = currentPage == null?1:Integer.parseInt(currentPage);
        pageSize = rows == null?20:Integer.parseInt(rows);

        PageHelper.startPage(pageNumber,pageSize);
        List<WarehouseGoods> list = null;
        if (EmptyUtil.isStrEmpty(goodsDto.getGoodsName()) || EmptyUtil.isStrEmpty(goodsDto.getGoodsCode()) ||
                EmptyUtil.isStrEmpty(goodsDto.getStartTime()) || EmptyUtil.isStrEmpty(goodsDto.getEndTime())) {
            list = warehouseGoodsService.findAll();
        } else {
            list = warehouseGoodsService.findByLike(goodsDto);
        }
        //用PageInfo对结果进行包装
        PageInfo<WarehouseGoods> pageInfo = new PageInfo<>(list);

        Iterator<WarehouseGoods> iterator = pageInfo.getList().iterator();
        ArrayList<Object> rowDatas = new ArrayList<>();
        while (iterator.hasNext()) {
            rowDatas.add(iterator.next());
        }

        result.setRows(rowDatas);
        result.setTotal(pageInfo.getTotal() + "");
        return result;
    }

    @RequestMapping(value = "/warehouse/add", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    public Map<String, String> addWarehouseGoods(@RequestBody WarehouseGoods warehouseGoods) {
        Map<String, String> map = new HashMap<>();
        warehouseGoodsService.addOne(warehouseGoods);
        map.put("flag", "success");
        return map;
    }

    @RequestMapping(value = "/warehouse/update", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    public Map<String, String> updateWarehouseGoods(@RequestBody WarehouseGoods warehouseGoods) {
        Map<String, String> map = new HashMap<>();
        warehouseGoodsService.modifyById(warehouseGoods);
        map.put("flag", "success");
        return map;
    }

    @RequestMapping(value = "/warehouse/delete/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, String> updateWarehouseGoods(@PathVariable String id) {
        Map<String, String> map = new HashMap<>();
        warehouseGoodsService.removeById(id);
        map.put("flag", "success");
        return map;
    }
}
