package com.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class TC3 extends CommonMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");
		String parent = driver.getTitle();
		String parentId = driver.getWindowHandle();
		System.out.println(parent+" : "+parentId);
		driver.findElement(By.linkText("Opens in a new window")).click(); 
		
		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> titles = allWindows.iterator();
		parent = titles.next();
		String child = titles.next();
		driver.switchTo().window(child);
		child = driver.getTitle();
		String childId = driver.getWindowHandle();
		child = driver.getTitle();
		System.out.println(child+" : "+childId);
		driver.switchTo().window(parent);
		
		
		
		
		
		/*
		 * package com.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class windows extends CommonMethods {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");
        String parent =driver.getTitle();
        String parentId= driver.getWindowHandle();
        System.out.println("title: "+parent+" "+" ID: "+parentId);
        driver.findElement(By.xpath("//a[text()='Opens in a new window']")).click();
        Set<String> allWindows = driver.getWindowHandles();
        Iterator<String> it = allWindows.iterator();
        parent=it.next();
        String child= it.next();
        driver.switchTo().window(child);
        child=driver.getTitle();
        String childId= driver.getWindowHandle();
        System.out.println("title: "+child+" "+" ID: "+childId);
        driver.switchTo().window(parent);

    }

}
		 */
		
		
	}

}
