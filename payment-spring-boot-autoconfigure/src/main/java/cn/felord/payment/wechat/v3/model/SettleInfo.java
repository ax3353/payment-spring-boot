package cn.felord.payment.wechat.v3.model;

import lombok.Data;

/**
 *
 * @author felord.cn
 * @since 1.0.0.RELEASE
 */
@Data
public class SettleInfo {
    /**
     * 是否指定分账
     */
    private boolean profitSharing;
    /**
     * 补差金额
     */
    private int subsidyAmount;
}
