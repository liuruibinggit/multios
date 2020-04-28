package com.qty.multios.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * 优惠券信息
 * 
 * @author leifengyang
 * @email leifengyang@gmail.com
 * @date 2019-10-08 09:36:40
 */
@Data
@TableName("sms_coupon")
public class CouponEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 优惠卷类型[0->全场赠券；1->会员赠券；2->购物赠券；3->注册赠券]
	 */
	@NotNull(message = "优惠卷类型不能为空")
	@Length(max = 1, message = "优惠卷类型不能超过1个字符")
	@Pattern(regexp = "^[\\u4E00-\\u9FA5A-Za-z0-9\\*]*$", message = "优惠卷类型只能是数字")
	private Integer couponType;
	/**
	 * 优惠券图片
	 */
	private String couponImg;
	/**
	 * 优惠卷名字
	 */
	private String couponName;
	/**
	 * 数量
	 */
	private Integer num;
	/**
	 * 金额
	 */
	private BigDecimal amount;
	/**
	 * 每人限领张数
	 */
	private Integer perLimit;
	/**
	 * 使用门槛
	 */
	private BigDecimal minPoint;
	/**
	 * 开始时间
	 */
	private Date startTime;
	/**
	 * 结束时间
	 */
	private Date endTime;
	/**
	 * 使用类型[0->全场通用；1->指定分类；2->指定商品]
	 */
	private Integer useType;
	/**
	 * 备注
	 */
	private String note;
	/**
	 * 发行数量
	 */
	private Integer publishCount;
	/**
	 * 已使用数量
	 */
	private Integer useCount;
	/**
	 * 领取数量
	 */
	private Integer receiveCount;
	/**
	 * 可以领取的开始日期
	 */
	private Date enableStartTime;
	/**
	 * 可以领取的结束日期
	 */
	private Date enableEndTime;
	/**
	 * 优惠码
	 */
	private String code;
	/**
	 * 可以领取的会员等级[0->不限等级，其他-对应等级]
	 */
	private Integer memberLevel;
	/**
	 * 发布状态[0-未发布，1-已发布]
	 */
	private Integer publish;

}
