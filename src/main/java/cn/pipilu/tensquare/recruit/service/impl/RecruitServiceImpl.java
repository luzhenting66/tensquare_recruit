package cn.pipilu.tensquare.recruit.service.impl;

import cn.pipilu.tensquare.recruit.entity.RecruitEntity;
import cn.pipilu.tensquare.recruit.mapper.RecruitMapper;
import cn.pipilu.tensquare.recruit.response.QueryRecruitListResp;
import cn.pipilu.tensquare.recruit.service.RecruitService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RecruitServiceImpl implements RecruitService {
    @Autowired
    private RecruitMapper recruitMapper;
    @Override
    public QueryRecruitListResp findList(int pageNo,int pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<RecruitEntity> recruitEntities = recruitMapper.selectAll();
        PageInfo<RecruitEntity> pageInfo = new PageInfo<>(recruitEntities);
        QueryRecruitListResp result = new QueryRecruitListResp();
        result.setTotal(pageInfo.getTotal());
        result.setSize(pageInfo.getSize());
        result.setData(pageInfo.getList());
        return result;
    }

    @Override
    public RecruitEntity findById(String id) {
        RecruitEntity entity = new RecruitEntity();
        entity.setId(id);
        return recruitMapper.selectOne(entity);
    }
}
