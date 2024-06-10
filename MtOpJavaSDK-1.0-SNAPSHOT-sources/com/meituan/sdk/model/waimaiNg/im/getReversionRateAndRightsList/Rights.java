package com.meituan.sdk.model.waimaiNg.im.getReversionRateAndRightsList;

import com.google.gson.annotations.SerializedName;

/**
* 门店权益列表  此次只有1，3，5，6  RIGHTS_UNKNOWN(-1, "未知权益", 1), RIGHTS_COMMENT_CONTACT(1, "评价联系", 1), RIGHTS_HONOR_TAG(2, "荣誉标签", 1), RIGHTS_COMMENT_UPDATE(3, "评价实时更新", 1), RIGHTS_IMPROVE_SCORE(4, "提升店铺评分", 2), RIGHTS_COMMENT_INVITE(5, "邀请顾客评价", 2), RIGHTS_BLOCK_LIST(6, "屏蔽恶意顾客", 2), RIGHTS_POSTER(7, "免费门店海报", 2), RIGHTS_PHONE_RETURN_VISIT(8, "电话回访顾客", 3), RIGHTS_SEND_COUPON(9, "发送优惠券", 3);
* This file was automatically generated.
*/
public class Rights {
    @SerializedName("code")
    private String code;
    @SerializedName("name")
    private String name;

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }




    @Override
    public String toString() {
        return "Rights{" + "code=" + code + "," + "name=" + name + "}";
    }
}
