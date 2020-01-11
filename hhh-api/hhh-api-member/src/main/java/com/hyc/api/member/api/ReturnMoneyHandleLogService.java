package com.hyc.api.member.api;


import com.hyc.common.bean.BaseService;
import com.member.model.entity.ReturnMoneyHandleLog;
import com.member.model.mapper.ReturnMoneyHandleLogMapper;

import java.util.List;

public interface ReturnMoneyHandleLogService extends BaseService<ReturnMoneyHandleLogMapper, ReturnMoneyHandleLog> {

    List<ReturnMoneyHandleLog> findListByMemberIdAndReturnMoneyId(String memberId, String memberReturnMoneyId);
}
