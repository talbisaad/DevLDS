package com.google.gwt.sample.stockwatcher.client;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("actionlist")
public interface RetrieveActionListService  extends RemoteService{
	
	String getActionList(ArrayList<String> ActionList) throws IllegalArgumentException;

}
