package com.wtoip.analysis.biz.service;

import java.util.List;

import com.wtoip.analysis.core.framwork.service.Service;
import com.wtoip.analysis.model.EventDayClickVirtual;

/** 
 *  @Description
 *	@author wanghongwei
 *  @date   2017年4月6日
 */
public interface CalculatedDayClickVirtualService extends Service<EventDayClickVirtual>{
	/**
	 * 按时间查询事件PV,UV,IP
	 * @param date
	 * @param app
	 * @param memberId
	 * @param mallId
	 * @param event
	 * @return
	 */
	EventDayClickVirtual findMallEventDay(String date,String app,String memberId,String mallId,String event);


	/**
	 * 按时间范围查询事件PV,UV,IP
	 * @param page
	 * @param startDate
	 * @param endDate
	 * @param app
	 * @param memberId
	 * @param mallId
	 * @param event
	 * @return
	 * @throws Exception 
	 */
	List<EventDayClickVirtual> findMallEventDateRange(String startDate,String endDate,String app,String memberId,String mallId,String event) throws Exception;
	
	/**
	 * 按时间范围查询事件汇总PV,UV,IP
	 * @param page
	 * @param startDate
	 * @param endDate
	 * @param app
	 * @param memberId
	 * @param mallId
	 * @param event
	 * @return
	 * @throws Exception 
	 */
	EventDayClickVirtual findMallEventDateRangeSum(String startDate,String endDate,String app,String memberId,String mallId,String event) ;

}
