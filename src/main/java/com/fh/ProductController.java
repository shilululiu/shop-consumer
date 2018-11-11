package com.fh;

import com.fh.shop.Product;
import com.fh.shop.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ProductController {


    @Autowired
    private ProductServer productServer;

    //查询
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public ServerResponse getProduct(){
        return  productServer.getList();
    }
    //新增
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public ServerResponse add(Product product){

        return productServer.add(product);
    }

    //删除
    @RequestMapping(value = "/delete/{ids}")
    public ServerResponse delete(@PathVariable String ids ){
        return  productServer.delete(ids);
    }

    //修改

    @RequestMapping(value = "/products",method = RequestMethod.PUT)
    public  ServerResponse put(@RequestBody Product product){

        return  productServer.update(product);
    }


    //单个属性get
    @RequestMapping(value = "/get2",method = RequestMethod.GET)
    public  ServerResponse  get2( Integer id){


        return productServer.get2(id);
    }






}
