package cn.kgc.smbms.service;

import cn.kgc.smbms.entity.SmbmsBill;
import cn.kgc.smbms.entity.SmbmsProvider;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface SmbmsBillService {


    PageInfo<SmbmsBill> queryAllSmbmsBill(SmbmsBill smbmsBill, Integer pageNum, Integer pageSize);

    List<SmbmsProvider> queryAllSmbmsProvider();
}
