package com.google.gwt.sample.stockwatcher.server;

import java.util.ArrayList;

import com.google.gwt.sample.stockwatcher.client.RetrieveActionListService;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class RetrieveActionListServiceImpl extends RemoteServiceServlet implements RetrieveActionListService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getActionList(ArrayList<String> ActionList) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
		String size= String.valueOf(ActionList.size());
		return size;
	}

}
