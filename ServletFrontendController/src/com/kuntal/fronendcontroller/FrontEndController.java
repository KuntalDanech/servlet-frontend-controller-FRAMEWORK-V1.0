package com.kuntal.fronendcontroller;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author Danech Kuntal
 * 
 */
public class FrontEndController {

	private static final Logger LOGGER = Logger.getLogger(FrontEndController.class.getName());

	/**
	 * No args constructor
	 */
	private FrontEndController() {
	}

	/**
	 * frontEndController instance field
	 */
	private static FrontEndController frontEndController;

	/**
	 * Singleton design pattern by using static method
	 * 
	 * @return frontEndController
	 */
	public static FrontEndController getFrontEndController() {
		frontEndController = new FrontEndController();
		return frontEndController;
	}

	private IDispatch dispatch;

	/**
	 * It sets the implementation classes of IDispatch.
	 * @param dispatch
	 */
	public void setDispatch(IDispatch dispatch) {
		this.dispatch = dispatch;
	}

	/**
	 * It hepls to dispatch request of particular HTTP request type.
	 * eg. GET, POST
	 * 
	 * @param request
	 * @param response
	 */
	public void dispatchRequest(HttpServletRequest request, HttpServletResponse response) {

		if (this.isDoGet()) {
			// singleton factory 
			dispatch = GETDispatch.getGETDispatcher();
		} else if (this.isDoPost()) {
			// singleton factory
			dispatch = POSTDispatch.getPOSTDispatcher();
		} else if (this.isDoDelete()) {
			// singleton factory
			dispatch = DELETEDispatch.getDELETEDispatcher();
		} else if (this.isDoHead()) {
			// singleton factory
			dispatch = HEADDispatch.getHEADDispatcher();
		} else if (this.isDoTrace()) {
			// singleton factory
			dispatch = TRACEDispatch.getTRACEDispatcher();
		} else if (this.isDoOptions()) {
			// singleton factory
			dispatch = OPTIONDispatch.getOPTIONDispatcher();
		}
		dispatch.dispatchRequest(request, response);
	}
	
	/*
	 * Seven Http requests
	 */
	private boolean doGet;
	private boolean doPost;
	private boolean doDelete;
	private boolean doHead;
	private boolean doOptions;
	private boolean doTrace;
	private boolean doPut;

	
	/**
	 * Getter and Setter
	 * @return
	 */
	public boolean isDoPut() {
		return doPut;
	}

	public void setDoPut(boolean doPut) {
		this.doPut = doPut;
	}

	public boolean isDoGet() {
		return doGet;
	}

	public void setDoGet(boolean doGet) {
		this.doGet = doGet;
	}

	public boolean isDoPost() {
		return doPost;
	}

	public void setDoPost(boolean doPost) {
		this.doPost = doPost;
	}

	public boolean isDoDelete() {
		return doDelete;
	}

	public void setDoDelete(boolean doDelete) {
		this.doDelete = doDelete;
	}

	public boolean isDoHead() {
		return doHead;
	}

	public void setDoHead(boolean doHead) {
		this.doHead = doHead;
	}

	public boolean isDoOptions() {
		return doOptions;
	}

	public void setDoOptions(boolean doOptions) {
		this.doOptions = doOptions;
	}

	public boolean isDoTrace() {
		return doTrace;
	}

	public void setDoTrace(boolean doTrace) {
		this.doTrace = doTrace;
	}

	public IDispatch getDispatch() {
		return dispatch;
	}

}