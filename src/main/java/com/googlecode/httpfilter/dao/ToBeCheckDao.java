package com.googlecode.httpfilter.dao;

import java.sql.SQLException;

import com.googlecode.httpfilter.domain.ToBeCheckDO;

public interface ToBeCheckDao {

	/**
	 * ����ToBeCheckDO
	 * @param toBeCheck
	 * @return
	 */
	long createToBeCheckDO( ToBeCheckDO toBeCheck ) throws SQLException;
	
	/**
	 * ͨ��id��ȡToBeCheckDO
	 * @param id
	 * @return
	 */
	ToBeCheckDO getToBeCheckDOById( long id ) throws SQLException;
}