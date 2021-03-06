package cn.ztuo.bitrade.constant;

import com.fasterxml.jackson.annotation.JsonValue;
import cn.ztuo.bitrade.core.BaseEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author GuoShuai
 * @date 2018年03月08日
 */
@AllArgsConstructor
@Getter
public enum ActivityRewardType implements BaseEnum {
    /**
     * 注册奖励
     */
    REGISTER("注册奖励"),
    /**
     * 交易奖励
     */
    TRANSACTION("交易奖励"),
    /**
    /**
     * 充值奖励
     */
    RECHARGE("充值奖励");
    @Setter
    private String cnName;

    @Override
    @JsonValue
    public int getOrdinal() {
        return ordinal();
    }

    public static ActivityRewardType valueOfOrdinal(int ordinal){
        if(ordinal==0){
            return ActivityRewardType.REGISTER;
        }else if(ordinal == 1){
            return ActivityRewardType.TRANSACTION;
        }else if(ordinal ==2){
            return ActivityRewardType.RECHARGE;
        }else {
            return null;
        }
    }
}
