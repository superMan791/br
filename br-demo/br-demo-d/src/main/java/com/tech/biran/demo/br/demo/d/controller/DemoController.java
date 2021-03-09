package com.tech.biran.demo.br.demo.d.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tech.biran.common.br.common.core.base.R;
import com.tech.biran.common.br.common.core.base.ServiceException;
import com.tech.biran.common.br.common.core.constant.CommonConstants;
import com.tech.biran.common.br.common.core.util.idgenerator.IdWorker;
import com.tech.biran.demo.br.demo.d.dao.BscDictInfoDao;
import com.tech.biran.demo.br.demo.d.model.dto.BscDictInfoDto;
import com.tech.biran.demo.br.demo.d.model.entity.BscDictInfo;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.BeanUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @author yzp
 * @date 2021/3/8 11:04
 */

@RestController
@RequestMapping("demo")
public class DemoController {
    @Resource
    private RedissonClient redissonClient;
    @Resource
    private BscDictInfoDao bscDictInfoDao;

    @PostMapping("test")
    public R test(@RequestBody @Validated BscDictInfoDto bscDictInfoDto){
        RLock lock=redissonClient.getLock(bscDictInfoDto.getCode());
        lock.lock(5, TimeUnit.SECONDS);
        if(bscDictInfoDao.selectCount(new LambdaQueryWrapper<BscDictInfo>().eq(BscDictInfo::getCode,bscDictInfoDto.getCode()))>0){
            throw new ServiceException(CommonConstants.FAIL.getCode(),CommonConstants.FAIL.getMessage());
        }
            BscDictInfo bscDictInfo=new BscDictInfo();
            BeanUtils.copyProperties(bscDictInfoDto,bscDictInfo);
            bscDictInfo.setId(IdWorker.getId());
            if(bscDictInfoDao.insert(bscDictInfo)>0){
                lock.unlock();
                return R.ok();
            }
        return R.fail();
    }
    @GetMapping("selectById/{id}")
    public R selectById(@PathVariable Long id){
        return R.ok(bscDictInfoDao.selectById(id));

    }
}
