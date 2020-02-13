package com.xinycloud.modules.demo2.web;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.xinycloud.modules.demo2.entity.SysUser;
import com.xinycloud.modules.demo2.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Xiny
 * @since 2020-02-13
 */
@RestController
@RequestMapping("/demo2/sysUser")
public class SysUserController {
    @Autowired
    private ISysUserService sysUserService;

    @RequestMapping("/getById")
    public Object list(Integer num, Integer size) {
        Wrapper wrapper = new EntityWrapper<SysUser>();
        Page<SysUser> page = new Page<>((num-1) * size, size);
        return sysUserService.selectPage(page, wrapper);
    }
}
