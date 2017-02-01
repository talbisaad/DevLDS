package com.google.gwt.sample.stockwatcher.client;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface RetrieveActionListServiceAsync {
	
	void getActionList(ArrayList<String> ActionList, AsyncCallback<String> callback) throws IllegalArgumentException;
}
