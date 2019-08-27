package cn.pipilu.tensquare.recruit.entity;

import cn.pipilu.plus.common.base.entity.BaseEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Table;
import java.util.Date;

@Data
@NoArgsConstructor
@Table(name = "tb_recruit")
public class RecruitEntity extends BaseEntity {

    private static final long serialVersionUID = -941024927773002554L;
    private String jobName;
    private String salary;//薪资范围
    private String jobYear;//经验要求
    private String education;//学历要求
    private String  type;//任职方式
    private String address;//办公地址
    private String eid;//企业ID
    private Date createTime;//创建日期
    private String state;//状态
    private String url;//网址
    private String label;//标签
    private String contentA;//职位描述
    private String contentB;
}
