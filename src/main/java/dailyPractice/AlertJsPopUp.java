package dailyPractice;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertJsPopUp {

	public static void main(String[] args) {
		int[] array = {3,6,8,9};
		List<Integer> l = new ArrayList<>();
		l.add(array[0]);
		l.add(array[2]);
		l.set(0, array[1]);
		l.remove(0);
		System.out.println(l);

	}

}
