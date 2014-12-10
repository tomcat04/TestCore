/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wms.ma.service;

import com.wms.ma.bean.MaterialSrcBean;
import com.wms.util.exception.CustomException;
import java.util.List;

/**
 * 物料数据源管理接口
 * @author cgx1844568
 * @date 2014-10-25
 * @time 11:32:07
 *
 */
public interface MaterialSrcManageService {

    /**
     * 单个查询
     * @param materialCode 料号
     * @return 物料信息
     */
    public MaterialSrcBean querySingleMaterial(String materialCode);
    
    /**
     * 增加一个物料
     * @param list
     */
    public void addMaterial(List<MaterialSrcBean> list);
    
    /**
     * 增加一列物料(测试编程式事务)
     * @param list
     */
    public void addMaterialList(List<MaterialSrcBean> list);
    
    /**
     * 根据料号查询物料(同步)
     * @param materialCode(料号)
     * @return 
     * @throws com.wms.util.exception.CustomException 
     */
    public MaterialSrcBean getMaterial(String materialCode) throws CustomException;
    
    public MaterialSrcBean getMaterialAnsy(String materialCode) throws CustomException;
}
