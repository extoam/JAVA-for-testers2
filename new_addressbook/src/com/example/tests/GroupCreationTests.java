package com.example.tests;

import org.testng.annotations.Test;

	public class GroupCreationTests extends TestBase { 
	  
	  

	  @Test
	  public void testNonEmptyGropCreation() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    app.getNavigationHelper().gotoGroupsPage();
	    app.getGroupHelper().initGroupCreation();
	    GroupData group = new GroupData();
	    group.groupname = "groupname 1";
	    group.header = "header 1";
	    group.footer = "footer 1";
		app.getGroupHelper().fillGroupForm(group);
	    app.getGroupHelper().submitGroupForm();
	    app.getGroupHelper().returnToGroupsPage();
	  }
	  
	  @Test
	  public void testEmptyGropCreation() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    app.getNavigationHelper().gotoGroupsPage();
	    app.getGroupHelper().initGroupCreation();
	    app.getGroupHelper().fillGroupForm(new GroupData("", "", ""));
	    app.getGroupHelper().submitGroupForm();
	    app.getGroupHelper().returnToGroupsPage();
	  }

		
	}
