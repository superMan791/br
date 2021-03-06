/*
 * This file is generated by jOOQ.
 */
package com.tech.biran.br.common.log.db.tables.records;


import com.tech.biran.br.common.log.db.tables.SysLog;

import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SysLogRecord extends TableRecordImpl<SysLogRecord> implements Record12<String, String, LocalDateTime, String, String, String, String, String, Integer, Long, String, String> {

    private static final long serialVersionUID = -1291261740;

    /**
     * Setter for <code>test.sys_log.title</code>.
     */
    public void setTitle(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>test.sys_log.title</code>.
     */
    public String getTitle() {
        return (String) get(0);
    }

    /**
     * Setter for <code>test.sys_log.create_by</code>.
     */
    public void setCreateBy(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>test.sys_log.create_by</code>.
     */
    public String getCreateBy() {
        return (String) get(1);
    }

    /**
     * Setter for <code>test.sys_log.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>test.sys_log.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>test.sys_log.remote_ip</code>.
     */
    public void setRemoteIp(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>test.sys_log.remote_ip</code>.
     */
    public String getRemoteIp() {
        return (String) get(3);
    }

    /**
     * Setter for <code>test.sys_log.request_uri</code>.
     */
    public void setRequestUri(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>test.sys_log.request_uri</code>.
     */
    public String getRequestUri() {
        return (String) get(4);
    }

    /**
     * Setter for <code>test.sys_log.param</code>.
     */
    public void setParam(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>test.sys_log.param</code>.
     */
    public String getParam() {
        return (String) get(5);
    }

    /**
     * Setter for <code>test.sys_log.service_name</code>.
     */
    public void setServiceName(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>test.sys_log.service_name</code>.
     */
    public String getServiceName() {
        return (String) get(6);
    }

    /**
     * Setter for <code>test.sys_log.trace_id</code>.
     */
    public void setTraceId(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>test.sys_log.trace_id</code>.
     */
    public String getTraceId() {
        return (String) get(7);
    }

    /**
     * Setter for <code>test.sys_log.success</code>.
     */
    public void setSuccess(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>test.sys_log.success</code>.
     */
    public Integer getSuccess() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>test.sys_log.time</code>.
     */
    public void setTime(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>test.sys_log.time</code>.
     */
    public Long getTime() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>test.sys_log.data</code>.
     */
    public void setData(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>test.sys_log.data</code>.
     */
    public String getData() {
        return (String) get(10);
    }

    /**
     * Setter for <code>test.sys_log.exception</code>.
     */
    public void setException(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>test.sys_log.exception</code>.
     */
    public String getException() {
        return (String) get(11);
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row12<String, String, LocalDateTime, String, String, String, String, String, Integer, Long, String, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<String, String, LocalDateTime, String, String, String, String, String, Integer, Long, String, String> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return SysLog.SYS_LOG.TITLE;
    }

    @Override
    public Field<String> field2() {
        return SysLog.SYS_LOG.CREATE_BY;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return SysLog.SYS_LOG.CREATE_TIME;
    }

    @Override
    public Field<String> field4() {
        return SysLog.SYS_LOG.REMOTE_IP;
    }

    @Override
    public Field<String> field5() {
        return SysLog.SYS_LOG.REQUEST_URI;
    }

    @Override
    public Field<String> field6() {
        return SysLog.SYS_LOG.PARAM;
    }

    @Override
    public Field<String> field7() {
        return SysLog.SYS_LOG.SERVICE_NAME;
    }

    @Override
    public Field<String> field8() {
        return SysLog.SYS_LOG.TRACE_ID;
    }

    @Override
    public Field<Integer> field9() {
        return SysLog.SYS_LOG.SUCCESS;
    }

    @Override
    public Field<Long> field10() {
        return SysLog.SYS_LOG.TIME;
    }

    @Override
    public Field<String> field11() {
        return SysLog.SYS_LOG.DATA;
    }

    @Override
    public Field<String> field12() {
        return SysLog.SYS_LOG.EXCEPTION;
    }

    @Override
    public String component1() {
        return getTitle();
    }

    @Override
    public String component2() {
        return getCreateBy();
    }

    @Override
    public LocalDateTime component3() {
        return getCreateTime();
    }

    @Override
    public String component4() {
        return getRemoteIp();
    }

    @Override
    public String component5() {
        return getRequestUri();
    }

    @Override
    public String component6() {
        return getParam();
    }

    @Override
    public String component7() {
        return getServiceName();
    }

    @Override
    public String component8() {
        return getTraceId();
    }

    @Override
    public Integer component9() {
        return getSuccess();
    }

    @Override
    public Long component10() {
        return getTime();
    }

    @Override
    public String component11() {
        return getData();
    }

    @Override
    public String component12() {
        return getException();
    }

    @Override
    public String value1() {
        return getTitle();
    }

    @Override
    public String value2() {
        return getCreateBy();
    }

    @Override
    public LocalDateTime value3() {
        return getCreateTime();
    }

    @Override
    public String value4() {
        return getRemoteIp();
    }

    @Override
    public String value5() {
        return getRequestUri();
    }

    @Override
    public String value6() {
        return getParam();
    }

    @Override
    public String value7() {
        return getServiceName();
    }

    @Override
    public String value8() {
        return getTraceId();
    }

    @Override
    public Integer value9() {
        return getSuccess();
    }

    @Override
    public Long value10() {
        return getTime();
    }

    @Override
    public String value11() {
        return getData();
    }

    @Override
    public String value12() {
        return getException();
    }

    @Override
    public SysLogRecord value1(String value) {
        setTitle(value);
        return this;
    }

    @Override
    public SysLogRecord value2(String value) {
        setCreateBy(value);
        return this;
    }

    @Override
    public SysLogRecord value3(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public SysLogRecord value4(String value) {
        setRemoteIp(value);
        return this;
    }

    @Override
    public SysLogRecord value5(String value) {
        setRequestUri(value);
        return this;
    }

    @Override
    public SysLogRecord value6(String value) {
        setParam(value);
        return this;
    }

    @Override
    public SysLogRecord value7(String value) {
        setServiceName(value);
        return this;
    }

    @Override
    public SysLogRecord value8(String value) {
        setTraceId(value);
        return this;
    }

    @Override
    public SysLogRecord value9(Integer value) {
        setSuccess(value);
        return this;
    }

    @Override
    public SysLogRecord value10(Long value) {
        setTime(value);
        return this;
    }

    @Override
    public SysLogRecord value11(String value) {
        setData(value);
        return this;
    }

    @Override
    public SysLogRecord value12(String value) {
        setException(value);
        return this;
    }

    @Override
    public SysLogRecord values(String value1, String value2, LocalDateTime value3, String value4, String value5, String value6, String value7, String value8, Integer value9, Long value10, String value11, String value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SysLogRecord
     */
    public SysLogRecord() {
        super(SysLog.SYS_LOG);
    }

    /**
     * Create a detached, initialised SysLogRecord
     */
    public SysLogRecord(String title, String createBy, LocalDateTime createTime, String remoteIp, String requestUri, String param, String serviceName, String traceId, Integer success, Long time, String data, String exception) {
        super(SysLog.SYS_LOG);

        set(0, title);
        set(1, createBy);
        set(2, createTime);
        set(3, remoteIp);
        set(4, requestUri);
        set(5, param);
        set(6, serviceName);
        set(7, traceId);
        set(8, success);
        set(9, time);
        set(10, data);
        set(11, exception);
    }
}
