package cn.xhb.controller;

import cn.xhb.domain.Role;
import cn.xhb.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import java.util.List;

@Controller
@RequestMapping("/role")
public class roleController {

    @Autowired
    private RoleService roleService;

    @RequestMapping("/list")
    public ModelAndView list(){
        ModelAndView modelAndView=new ModelAndView();
        List<Role> roleList=roleService.list();
        modelAndView.addObject("roleList",roleList);
        modelAndView.setViewName("role-list");
        return modelAndView;
    }

    @RequestMapping("/save")
    public String save(Role role){
        roleService.save(role);
        return "redirect:/role/list";
    }

    @RequestMapping("/del/{roleId}")
    public String del(@PathVariable("roleId") Long roleId){

        roleService.del(roleId);

        return "redirect:/role/list";
    }
}
