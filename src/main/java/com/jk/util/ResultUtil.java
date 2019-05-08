/** 
 * <pre>项目名称:bootStrap 
 * 文件名称:ResultUtil.java 
 * 包名:com.jk.xjb.utils 
 * 创建日期:2019年3月19日上午11:43:39 
 * Copyright (c) 2019, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.util;

/** 
 * <pre>项目名称：bootStrap    
 * 类名称：ResultUtil    
 * 类描述：    
 * 创建人：徐进博 15121870167
 * 创建时间：2019年3月19日 上午11:43:39    
 * 修改人：徐进博 15121870764
 * 修改时间：2019年3月19日 上午11:43:39    
 * 修改备注：       
 * @version </pre>    
 */
public class ResultUtil {
	
	private Integer total;
	
	private Object  rows;

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Object getRows() {
		return rows;
	}

	public void setRows(Object rows) {
		this.rows = rows;
	}

	
	@Override
	public String toString() {
		return "ResultUtil [total=" + total + ", rows=" + rows + "]";
	}
	
	

}
