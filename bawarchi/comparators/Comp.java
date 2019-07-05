

package com.bawarchi.comparators;
import com.bawarchi.model.*;
import java.util.Comparator;
public class Comp {

	public  static Comparator<Dish> getComparators(int choice)
	{
		switch(choice)
		{
		case 1:
		{
			return new Comparators.SortByCaloriesAsc();
		}
		case 2:
		{
			return new Comparators.SortByPriceDesc();
		}
		case 3:
		{
			return new Comparators.SortByPriceAsc();
		}
			
		default:
		{
			return new Comparators.SortByPriceDesc();
		}
		}
		
	}
}
