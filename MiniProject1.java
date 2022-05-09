package com.MiniProject1;

import org.openqa.selenium.WebDriver;

import com.baseclass1.Base_Class;

public class MiniProject1 extends Base_Class {

	public static WebDriver driver = getBrowser("chrome");

	public static void main(String[] args) {

		getUrl("http://adactinhotelapp.com/");

	}
}
