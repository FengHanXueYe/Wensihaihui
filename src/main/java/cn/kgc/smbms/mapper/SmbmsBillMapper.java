package cn.kgc.smbms.mapper;

import cn.kgc.smbms.entity.SmbmsBill;
import cn.kgc.smbms.entity.SmbmsProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SmbmsBillMapper {

    List<SmbmsBill> queryAllSmbmsBill(@Param("sb") SmbmsBill smbmsBill);

    @Select("select * from Smbms_Provider")
    List<SmbmsProvider> queryAllSmbmsProvider();
}
