package cn.pipilu.tensquare.recruit.request;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class QueryRecruitListReq implements Serializable{

    private static final long serialVersionUID = -4886466648818249305L;
    private int pageNo;
    private int pageSize;
}
