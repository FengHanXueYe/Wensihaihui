package cn.kgc.smbms.controller;

import cn.kgc.smbms.entity.SmbmsBill;
import cn.kgc.smbms.entity.SmbmsProvider;
import cn.kgc.smbms.service.SmbmsBillService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class SmbmsBillController {
    @Resource
    private SmbmsBillService smbmsBillService;

    @RequestMapping(value = "queriAllSmbmsBill", method = RequestMethod.GET)
    public String queriAllSmbmsBill(SmbmsBill smbmsBill, Integer pageNum, Integer pageSize, Model model){
        System.out.println(">>>>>>>>>>>"+smbmsBill);
        if(pageNum==null){
            pageNum = 1;
        }
        pageSize = 5;
        List<SmbmsProvider> smbmsProviders = smbmsBillService.queryAllSmbmsProvider();
        PageInfo<SmbmsBill> smbmsBillPageInfo = smbmsBillService.queryAllSmbmsBill(smbmsBill, pageNum, pageSize);
        model.addAttribute("listSmbmsProvider", smbmsProviders);
        model.addAttribute("listSmbmsBill", smbmsBillPageInfo);
        model.addAttribute("smbmsBill", smbmsBill);
        return "listSmbmsBill";
    }




}
