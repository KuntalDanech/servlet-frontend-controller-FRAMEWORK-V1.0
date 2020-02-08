package com.kuntal.fronendcontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author Danech Kuntal
 *
 */
public interface IDispatch {
	public void dispatchRequest(HttpServletRequest request, HttpServletResponse response);
}
