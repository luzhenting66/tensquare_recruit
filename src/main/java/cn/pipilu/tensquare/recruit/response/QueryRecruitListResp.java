package cn.pipilu.tensquare.recruit.response;

import cn.pipilu.tensquare.recruit.entity.RecruitEntity;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Data
@ToString
public class QueryRecruitListResp implements Serializable{

    private static final long serialVersionUID = -8519318219167410741L;
    private long total;
    private int size;
    private List<RecruitEntity> data;
}
