package com.member.model.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.member.model.entity.MemberDeliveryAddress;
import org.apache.ibatis.annotations.Param;

public interface MemberDeliveryAddressMapper extends BaseMapper<MemberDeliveryAddress> {

    int updateMemberIsDefaultByNotEqId(@Param("id") String id, @Param("memberId") String memberId, @Param("isDefault") Integer isDefault);

}
