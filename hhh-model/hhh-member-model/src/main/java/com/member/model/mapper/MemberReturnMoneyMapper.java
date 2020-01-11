package com.member.model.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.member.model.entity.MemberReturnMoney;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

public interface MemberReturnMoneyMapper extends BaseMapper<MemberReturnMoney> {

    BigDecimal findTotalAmount(String memberId);
}
