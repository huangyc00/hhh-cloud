package com.hyc.admin.controller;

import com.hyc.admin.ao.OrderItemAO;
import com.hyc.order.dto.OrderItemDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping(value = "/mini/memberProductShard")
@RestController
public class MemberProductShareController {

    @Autowired
    OrderItemAO orderItemAO;

//    @PostMapping(value = "/createProductShare")
//    public AjaxResult<MemberProductShare> createProductShare(@Param("orderItemId") String orderItemId,String memberId) {
//        OrderItemDTO orderItem = orderItemAO.findShareEnabled(orderItemId, memberId);
//        MemberProductShare memberProductShare = new MemberProductShare();
//        memberProductShare.setMemberId(miniProMember.getId());
//        memberProductShare.setOrderId(orderItem.getOrderId());
//        memberProductShare.setOrderItemId(orderItem.getId());
//        return AjaxResult.success(memberProductShareService.defaultSaveOrUpdate(memberProductShare));
//    }

    @GetMapping(value = "/findShareEnabled")
    public OrderItemDTO findShareEnabled(String orderItemId, String memberId) {
        return orderItemAO.findShareEnabled(orderItemId, memberId);
    }


//    @GetMapping(value = "/findPage")
//    public AjaxResult<IPage<MemberProductShareDTO>> findPage(Page<MemberProductShareDTO> page) {
//        MiniProMember miniProMember = tokenComponent.getCurrentMiniProMember();
//        return AjaxResult.success(memberProductShareService.findMemberPage(page,miniProMember.getId()));
//    }

}
