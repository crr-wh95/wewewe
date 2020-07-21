package com.crr.controller;

import com.crr.domain.Branches;
import com.crr.domain.Cityarea;
import com.crr.service.BranchesService;
import com.crr.service.CityareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BranchesController {
    @Autowired
    private BranchesService branchesService;
    @Autowired
    private CityareaService cityareaService;

    /**
     * 分页查询
     * @param pageNow
     * @param pageSize
     * @param model
     * @return
     */
    @RequestMapping("/index")
    public String index(@RequestParam(name = "pageNow",defaultValue = "") Integer pageNow,
                        @RequestParam(name = "pageSize",defaultValue = "") Integer pageSize,
                        Model model){
        Page<Branches> page = branchesService.getBranchesPage(pageNow, pageSize);
        //放入到模型中
        model.addAttribute("page",page);

        return "index";
    }

    /**
     * 进入到修改页面
     * @param id
     * @param model
     * @return
     */

    @RequestMapping("/toupdate")
    public String toupdate(@RequestParam("id") Integer id,Model model){
        //根据id查询
        Branches branches = branchesService.getByBranchesId(id);
        model.addAttribute("branches",branches);

        //查询城市
        List<Cityarea> cityareaList = cityareaService.getAllBranches();
        model.addAttribute("cityareaList",cityareaList);
        return "update";
    }

    @RequestMapping("/update")
    public String update(Branches branches) {
        branchesService.updateBranches(branches);
        //重定向到首页
        return "redirect:index";
    }
}
