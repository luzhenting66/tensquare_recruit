package cn.pipilu.tensquare.recruit.controller;

import cn.pipilu.plus.common.request.Request;
import cn.pipilu.plus.common.response.Response;
import cn.pipilu.plus.common.util.ResponseUtil;
import cn.pipilu.tensquare.recruit.entity.RecruitEntity;
import cn.pipilu.tensquare.recruit.request.QueryRecruitListReq;
import cn.pipilu.tensquare.recruit.response.QueryRecruitListResp;
import cn.pipilu.tensquare.recruit.service.RecruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "tensquare-recruit/recruit")
public class RecruitController {
   @Autowired
   private RecruitService recruitService;
   @Autowired
   private ResponseUtil responseUtil;
    @RequestMapping(method = RequestMethod.GET,value = "/{pageNo}/{pageSize}")
    public Response<QueryRecruitListResp> findList(@PathVariable("pageNo")int pageNo,@PathVariable("pageSize")int pageSize){
        Response<QueryRecruitListResp> response = new Response();
        try {
            response.setRespData(recruitService.findList(pageNo,pageSize));
            responseUtil.setRespParam(response);
        }catch (Exception e){
            responseUtil.setRespParam(response,e);
        }

        return response;

    }

    @RequestMapping(method = RequestMethod.GET,value = "/{id}")
    public Response<RecruitEntity> findById(@PathVariable("id") String id){
        Response<RecruitEntity> response = new Response();
        try {
            response.setRespData(recruitService.findById(id));
            responseUtil.setRespParam(response);
        }catch (Exception e){
            responseUtil.setRespParam(response,e);
        }

        return response;

    }
}
