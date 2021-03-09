package com.tech.biran.br.common.log.dao;

import com.tech.biran.br.common.log.db.tables.SysLog;
import com.tech.biran.br.common.log.entity.SysLogEntity;
import org.jooq.DSLContext;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


@Component
public class MysqlSysLogDaoImpl implements SysLogDao {
    @Resource
    DSLContext create;

    @Override
    public boolean saveSysLog(SysLogEntity sysLogEntity) {
        SysLog SYS_LOG = SysLog.SYS_LOG;
        return create.insertInto(SYS_LOG)
                .columns(
                        SYS_LOG.TITLE,
                        SYS_LOG.CREATE_BY,
                        SYS_LOG.CREATE_TIME,
                        SYS_LOG.REMOTE_IP,
                        SYS_LOG.REQUEST_URI,
                        SYS_LOG.PARAM,
                        SYS_LOG.SERVICE_NAME,
                        SYS_LOG.TRACE_ID,
                        SYS_LOG.SUCCESS,
                        SYS_LOG.TIME,
                        SYS_LOG.DATA,
                        SYS_LOG.EXCEPTION

                ).values(
                        sysLogEntity.getTitle(),
                        sysLogEntity.getCreateBy(),
                        sysLogEntity.getCreateTime(),
                        sysLogEntity.getRemoteIp(),
                        sysLogEntity.getRequestUri(),
                        sysLogEntity.getParam(),
                        sysLogEntity.getServiceName(),
                        sysLogEntity.getTraceId(),
                        sysLogEntity.getSuccess(),
                        sysLogEntity.getTime(),
                        sysLogEntity.getData(),
                        sysLogEntity.getException()
                ).execute() > 0;
    }
}
