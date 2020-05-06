import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class readValuesFromTable {
	static WebDriver wd;
	public static void main(String[] args) throws ParseException 
	
	{
		 wd = new ChromeDriver();
		 wd.get("https://www.w3schools.com/sql/sql_syntax.asp");
		 WebElement mytable = wd.findElement(By.cssSelector("table.w3-table-all.notranslate"));
		 List<WebElement> rows_table = mytable.findElements(By.tagName("tr"));
		 int rows_count = rows_table.size();
		 System.out.println("Row Count : " + rows_count);
		 
		 for(int row = 0;row < rows_count; row++)
		 {
			 List<WebElement> cols_table = mytable.findElements(By.tagName("td")); 
			 int cols_count = cols_table.size();
			 System.out.println("Number of Cells in a row" +row+ "are" + cols_count);
			 
			 for(int column = 0; column< cols_count; column++)
			 {
				 
				 String celText = cols_table.get(column).getText();
				 System.out.println("Cell value of row number " +row+ "and column number " +column+ "is" +celText);
			 }
			 System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		 }
	}
		 
		 
		 
	
}
