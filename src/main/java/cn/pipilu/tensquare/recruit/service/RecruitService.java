package cn.pipilu.tensquare.recruit.service;

import cn.pipilu.tensquare.recruit.entity.RecruitEntity;
import cn.pipilu.tensquare.recruit.response.QueryRecruitListResp;

public interface RecruitService {
    QueryRecruitListResp findList(int pageNo,int pageSize);

    RecruitEntity findById(String id);
}
