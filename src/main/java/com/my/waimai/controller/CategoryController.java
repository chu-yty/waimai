package com.my.waimai.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.my.waimai.common.R;
import com.my.waimai.entity.Category;
import com.my.waimai.servlice.CategoryService;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;


    /**
     * 新增分类
     * @param category
     * @return
     */
    /**
     * 添加操作
     * @param category
     * @return
     */
    @PostMapping
    public R<String > getCategorylist(@RequestBody Category category)
    {
        log.info("category {}",category);
        boolean save = categoryService.save(category);

        return R.success("添加成功 ");


    }

    /**
     * 分页查询
     * @param page
     * @param pageSize
     * @return
     */
    @GetMapping("/page")
    public R<Page> getcategoryList(int page,int pageSize)
    {
        //分页构造器 查询结果会在pageinfo中
        Page<Category> pageInfo=new Page<>(page,pageSize);
        //条件构造器
        LambdaQueryWrapper<Category> queryWrapper=new LambdaQueryWrapper<>();
        //排序构造器
        queryWrapper.orderByAsc(Category::getSort);
        //执行分页查询
        categoryService.page(pageInfo,queryWrapper);

        return  R.success(pageInfo);
    }
    /**
     * 修改操作
     */
    @PutMapping
    public  R<String > updata(@RequestBody Category category)
    {
        categoryService.updateById(category);
        return R.success("修改成功");
    }
    @DeleteMapping
    public R<String > delCategory(Long ids)
    {
        log.info("删除的分类的id为{}",ids);
        categoryService.removeById(ids);
        return R.success("删除成功");
    }
    @GetMapping("/list")
    public R<List<Category>> getCategoryList(Integer type)
    {
        //创建构造器
        LambdaQueryWrapper<Category> lambdaQueryWrapper=new LambdaQueryWrapper<>();
        //条件查询
        lambdaQueryWrapper.eq(type!=null,Category::getType,type );
        //排序
        lambdaQueryWrapper.orderByAsc(Category::getSort).orderByDesc(Category::getUpdateTime);
        List<Category> categoryList=categoryService.list(lambdaQueryWrapper);
        return R.success(categoryList);

    }




}
