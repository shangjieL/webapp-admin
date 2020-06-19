package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysPersonMapper;
import com.ruoyi.system.domain.SysPerson;
import com.ruoyi.system.service.ISysPersonService;
import com.ruoyi.common.core.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-06-19
 */
@Service
public class SysPersonServiceImpl implements ISysPersonService 
{
    @Autowired
    private SysPersonMapper sysPersonMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param personId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public SysPerson selectSysPersonById(Long personId)
    {
        return sysPersonMapper.selectSysPersonById(personId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param sysPerson 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<SysPerson> selectSysPersonList(SysPerson sysPerson)
    {
        return sysPersonMapper.selectSysPersonList(sysPerson);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param sysPerson 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertSysPerson(SysPerson sysPerson)
    {
        sysPerson.setCreateTime(DateUtils.getNowDate());
        return sysPersonMapper.insertSysPerson(sysPerson);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param sysPerson 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateSysPerson(SysPerson sysPerson)
    {
        sysPerson.setUpdateTime(DateUtils.getNowDate());
        return sysPersonMapper.updateSysPerson(sysPerson);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSysPersonByIds(String ids)
    {
        return sysPersonMapper.deleteSysPersonByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param personId 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteSysPersonById(Long personId)
    {
        return sysPersonMapper.deleteSysPersonById(personId);
    }
}
