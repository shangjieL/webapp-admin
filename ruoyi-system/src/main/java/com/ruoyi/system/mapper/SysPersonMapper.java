package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysPerson;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2020-06-19
 */
public interface SysPersonMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param personId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public SysPerson selectSysPersonById(Long personId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param sysPerson 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<SysPerson> selectSysPersonList(SysPerson sysPerson);

    /**
     * 新增【请填写功能名称】
     * 
     * @param sysPerson 【请填写功能名称】
     * @return 结果
     */
    public int insertSysPerson(SysPerson sysPerson);

    /**
     * 修改【请填写功能名称】
     * 
     * @param sysPerson 【请填写功能名称】
     * @return 结果
     */
    public int updateSysPerson(SysPerson sysPerson);

    /**
     * 删除【请填写功能名称】
     * 
     * @param personId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteSysPersonById(Long personId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param personIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteSysPersonByIds(String[] personIds);
}
