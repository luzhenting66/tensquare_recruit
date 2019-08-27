package cn.pipilu.tensquare.recruit.entity;

import cn.pipilu.plus.common.base.entity.BaseEntity;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Table;

@Data
@ToString
@Table(name = "tb_recruit")
public class RecruitEntity extends BaseEntity {

    private static final long serialVersionUID = -941024927773002554L;
}
