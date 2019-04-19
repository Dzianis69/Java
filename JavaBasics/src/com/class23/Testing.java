package com.class23;

public class Testing {
	public static void main(String[] args) {

		System.out.println("---Creating Employee object---");
		Employee emp = new Employee();
		emp.salary = 90000;
		emp.getPaid();

		System.out.println("---Creating SrumTeam object---");
		ScrumTeam st = new ScrumTeam();
		st.salary = 100000;
		st.getPaid();
		st.artifacts = "Product Backlog,Sprint Backlog, BurnDown chart";
		st.ceremonies = "Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		st.attendScrumMeetings();
		st.workOnArtifacts();

		System.out.println("---Creating Developer object---");
		Developer dev = new Developer();
		dev.salary = 120000;
		dev.getPaid();
		dev.artifacts = "Sprit backlog";
		dev.ceremonies = "Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		dev.workOnArtifacts();
		dev.attendScrumMeetings();
		dev.code();

		System.out.println("---Creating Tester object---");
		Tester qa = new Tester();
		qa.salary = 100000;
		qa.getPaid();
		qa.artifacts = "Sprit backlog";
		qa.ceremonies = "Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		qa.workOnArtifacts();
		qa.attendScrumMeetings();
		qa.test();

		System.out.println("---Creating Bussiness Analyst object---");
		BussinesAnalyst ba = new BussinesAnalyst();
		ba.salary = 85000;
		ba.getPaid();
		ba.artifacts = "Sprit backlog, Product Backlog";
		ba.ceremonies = "Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		ba.workOnArtifacts();
		ba.attendScrumMeetings();
		ba.writeUserStories();

		System.out.println("---Creating Scrum Master object---");
		ScrumMaster sm = new ScrumMaster();
		sm.salary = 90000;
		sm.getPaid();
		sm.artifacts = "Burn Down Chart";
		sm.ceremonies = "Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		sm.workOnArtifacts();
		sm.attendScrumMeetings();
		sm.driveScrumMeetings();

		System.out.println("---Creating Product Owner object---");
		ProductOwner po = new ProductOwner();
		po.salary = 150000;
		po.getPaid();
		po.artifacts = "Sprit backlog, Product Backlog";
		po.ceremonies = "Sprit grooming, Sprint Planning, Sprint Demo";
		po.workOnArtifacts();
		po.attendScrumMeetings();
		po.prioritizeBackLog();
		po.talkToTheClient();

		System.out.println("Creating Front End Developer object");
		FrontEnd frontDev = new FrontEnd();
		frontDev.salary = 99000;
		frontDev.artifacts = "Sprit backlog, Product Backlog";
		frontDev.ceremonies = "Sprit grooming, Sprint Planning, Sprint Demo";
		frontDev.attendScrumMeetings();
		frontDev.code();
		frontDev.getPaid();
		frontDev.doHtml();
		frontDev.workOnArtifacts();

		System.out.println("Creating Back End Developer object");
		BackEnd backDev = new BackEnd();
		backDev.salary = 101000;
		backDev.artifacts = "Sprit backlog, Product Backlog";
		backDev.ceremonies = "Sprit grooming, Sprint Planning, Sprint Demo";
		backDev.attendScrumMeetings();
		backDev.code();
		backDev.doSql();
		backDev.getPaid();
		backDev.workOnArtifacts();

		System.out.println("Creating Manual Tester object");

	ManualTester manTest = new ManualTester();
	manTest.salary = 86000;
	manTest.artifacts = "Sprit backlog, Product Backlog";
	manTest.ceremonies = "Sprit grooming, Sprint Planning, Sprint Demo";
	manTest.attendScrumMeetings();
	manTest.getPaid();
	manTest.test();
	manTest.testManual();
	manTest.workOnArtifacts();
	
	System.out.println("Creating Automation Tester object");
	AutomationTester autTest = new AutomationTester();
	autTest.salary = 95000;
	autTest.artifacts = "Sprit backlog, Product Backlog";
	autTest.ceremonies = "Sprit grooming, Sprint Planning, Sprint Demo";
	autTest.attendScrumMeetings();
	autTest.codeInJava();
	autTest.getPaid();
	autTest.test();
	autTest.workOnArtifacts();
}
}