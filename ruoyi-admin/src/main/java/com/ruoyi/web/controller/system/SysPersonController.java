package com.ruoyi.web.controller.system;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.SysPerson;
import com.ruoyi.system.service.ISysPersonService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2020-06-19
 */
@Controller
@RequestMapping("/system/person")
public class SysPersonController extends BaseController
{
    private String prefix = "system/person";

    @Autowired
    private ISysPersonService sysPersonService;

    @RequiresPermissions("system:person:view")
    @GetMapping()
    public String person()
    {
        return prefix + "/person";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("system:person:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SysPerson sysPerson)
    {
        startPage();
        List<SysPerson> list = sysPersonService.selectSysPersonList(sysPerson);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("system:person:export")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SysPerson sysPerson)
    {
        List<SysPerson> list = sysPersonService.selectSysPersonList(sysPerson);
        ExcelUtil<SysPerson> util = new ExcelUtil<SysPerson>(SysPerson.class);
        return util.exportExcel(list, "person");
    }

    /**
     * 新增【请填写功能名称】
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存【请填写功能名称】
     */
    @RequiresPermissions("system:person:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SysPerson sysPerson)
    {
        return toAjax(sysPersonService.insertSysPerson(sysPerson));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{personId}")
    public String edit(@PathVariable("personId") Long personId, ModelMap mmap)
    {
        SysPerson sysPerson = sysPersonService.selectSysPersonById(personId);
        mmap.put("sysPerson", sysPerson);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("system:person:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SysPerson sysPerson)
    {
        return toAjax(sysPersonService.updateSysPerson(sysPerson));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("system:person:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(sysPersonService.deleteSysPersonByIds(ids));
    }
}
