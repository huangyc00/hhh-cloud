package com.member.model.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.member.model.entity.ReturnMoneyHandleLog;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ReturnMoneyHandleLogMapper extends BaseMapper<ReturnMoneyHandleLog> {

    List<ReturnMoneyHandleLog> findListByMemberIdAndReturnMoneyId(@Param("memberId") String memberId, @Param("memberReturnMoneyId") String memberReturnMoneyId);
}
