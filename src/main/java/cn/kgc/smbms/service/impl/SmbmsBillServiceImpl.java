package cn.kgc.smbms.service.impl;

import cn.kgc.smbms.entity.SmbmsBill;
import cn.kgc.smbms.entity.SmbmsProvider;
import cn.kgc.smbms.mapper.SmbmsBillMapper;
import cn.kgc.smbms.service.SmbmsBillService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SmbmsBillServiceImpl implements SmbmsBillService {

    @Resource
    private SmbmsBillMapper smbmsBillMapper;

    @Override
    public PageInfo<SmbmsBill> queryAllSmbmsBill(SmbmsBill smbmsBill, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<SmbmsBill> smbmsBills = smbmsBillMapper.queryAllSmbmsBill(smbmsBill);
        PageInfo<SmbmsBill> pageInfo = new PageInfo<>(smbmsBills);
        return pageInfo;
    }

    @Override
    public List<SmbmsProvider> queryAllSmbmsProvider() {
        return smbmsBillMapper.queryAllSmbmsProvider();
    }
}
