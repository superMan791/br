package com.tech.biran.br.common.log.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tech.biran.br.common.log.contanst.SysLogColumnEnum;
import com.tech.biran.br.common.log.entity.SysLogEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Objects;

/**
 * TODO 日志收集工具类
 *
 * @author yzp
 * @date 2020/4/13 0013 8:34
 */
@Component
public class SysLogUtil {
    /**
     * 方法执行前记录方法参数
     *
     * @param sysLogEntity
     * @param title
     * @param serviceName
     * @param traceId
     * @param column
     * @param columnHidden
     * @return
     * @throws
     * @author yzp
     * @date 2020/4/13 0013 8:33
     */
    public static void before(SysLogEntity sysLogEntity, String title, String serviceName, String traceId, List<String> column, List<String> columnHidden) throws JsonProcessingException {
        HttpServletRequest request = ((ServletRequestAttributes) Objects
                .requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
        if (column.contains(SysLogColumnEnum.TITLE) && !columnHidden.contains(SysLogColumnEnum.TITLE)) {
            sysLogEntity.setTitle(title);
        }
        if (column.contains(SysLogColumnEnum.CREATE_BY) && !columnHidden.contains(SysLogColumnEnum.CREATE_BY)) {

            sysLogEntity.setCreateBy("");

        }
        if (column.contains(SysLogColumnEnum.CREATE_TIME) && !columnHidden.contains(SysLogColumnEnum.CREATE_TIME)) {
            sysLogEntity.setCreateTime(LocalDateTime.now());
        }
        if (column.contains(SysLogColumnEnum.REMOTE_IP) && !columnHidden.contains(SysLogColumnEnum.REMOTE_IP)) {
            sysLogEntity.setRemoteIp(request.getRemoteAddr());
        }
        if (column.contains(SysLogColumnEnum.REQUEST_URI) && !columnHidden.contains(SysLogColumnEnum.REQUEST_URI)) {
            sysLogEntity.setRequestUri(request.getRequestURI());
        }
        if (column.contains(SysLogColumnEnum.PARAM) && !columnHidden.contains(SysLogColumnEnum.PARAM)) {
            ObjectMapper objectMapper=new ObjectMapper();
            sysLogEntity.setParam(objectMapper.writeValueAsString(request.getParameterMap()));
        }
        if (column.contains(SysLogColumnEnum.SERVICE_NAME) && !columnHidden.contains(SysLogColumnEnum.SERVICE_NAME)) {
            sysLogEntity.setServiceName(serviceName);
        }
        if (column.contains(SysLogColumnEnum.TRACE_ID) && !columnHidden.contains(SysLogColumnEnum.TRACE_ID)) {
            sysLogEntity.setTraceId(traceId);
        }
    }

    /**
     * 方法正常结束，将相应信息保存到日志中
     *
     * @param sysLogEntity
     * @param obj
     * @param column
     * @param columnHidden
     * @return
     * @throws
     * @author yzp
     * @date 2020/4/13 0013 8:48
     */
    public static void afterRunning(SysLogEntity sysLogEntity, Object obj, List<String> column, List<String> columnHidden) throws JsonProcessingException {
        if (column.contains(SysLogColumnEnum.SUCCESS) && !columnHidden.contains(SysLogColumnEnum.SUCCESS)) {
            sysLogEntity.setSuccess(1);
        }
        if (column.contains(SysLogColumnEnum.TIME) && !columnHidden.contains(SysLogColumnEnum.TIME)) {
            if (sysLogEntity.getCreateTime() != null) {
                sysLogEntity.setTime(LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli() - sysLogEntity.getCreateTime().toInstant(ZoneOffset.of("+8")).toEpochMilli());
            }
        }
        if (column.contains(SysLogColumnEnum.DATA) && !columnHidden.contains(SysLogColumnEnum.DATA)) {
            sysLogEntity.setData(new ObjectMapper().writeValueAsString(obj));
        }
    }

    /**
     * 方法执行异常，将异常信息保存到日志中
     *
     * @param sysLogEntity
     * @param throwable
     * @param column
     * @param columnHidden
     * @return
     * @throws
     * @author yzp
     * @date 2020/4/13 0013 8:48
     */
    public static void afterThrowing(SysLogEntity sysLogEntity, Throwable throwable, List<String> column, List<String> columnHidden) {
        if (column.contains(SysLogColumnEnum.SUCCESS) && !columnHidden.contains(SysLogColumnEnum.SUCCESS)) {
            sysLogEntity.setSuccess(0);
        }
        if (column.contains(SysLogColumnEnum.TIME) && !columnHidden.contains(SysLogColumnEnum.TIME)) {
            sysLogEntity.setTime(LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli() - sysLogEntity.getCreateTime().toInstant(ZoneOffset.of("+8")).toEpochMilli());
        }
        if (column.contains(SysLogColumnEnum.EXCEPTION) && !columnHidden.contains(SysLogColumnEnum.EXCEPTION)) {
            sysLogEntity.setException(throwable.getMessage());
        }
    }
}
