package com.dyl.mapper;


import com.dyl.pojo.Brand;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author ：dyl
 * @date ：Created in 2022/11/4
 * @description：
 */
public interface BrandMapper {
    /*
    查询所有
     */
    List<Brand> selectAll();

    /*
    查看详情
     */
    Brand selectById(int id);

//    List<Brand> selectByCondition(@Param("status") int status, @Param("companyName") String companyName, @Param("brandName") String brandName);


//    List<Brand> selectByCondition(Brand brand);
    List<Brand> selectByCondition(Map map);


    List<Brand> selectByConditionSingle(Brand brand);

    void add(Brand brand);

    int update(Brand brand);

    void deleteById(int id);

    void deleteByIds(@Param("ids") int[] ids);
}
