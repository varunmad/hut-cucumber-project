package com.pomManager;

import com.pojo.PojoClass;

public class PojoPom {
	private PojoClass pojo;

	public PojoClass getPojo() {
		return(pojo==null)?pojo=new PojoClass():pojo ;
	}

	}
