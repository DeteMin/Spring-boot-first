package com.sell.utils;

import com.sell.VO.ResultVO;

/**
 * @Auther: SuperJ
 * @Date: 2018/10/17 22:59
 * @Description:
 */
public class ResultVOUtil {
    public static ResultVO success(Object object){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(200);
        resultVO.setMeg("操作成功！");
        resultVO.setData(object);
        return resultVO;
    }

    /**
     * 对success方法进行重载，处理没有传递参数的情况
     * @return
     */
    public static ResultVO success(){return success(null);}

    public static ResultVO error(Integer code,String msg){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMeg(msg);
        return resultVO;
    }
}
