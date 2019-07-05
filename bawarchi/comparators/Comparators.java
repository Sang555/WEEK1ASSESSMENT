
package com.bawarchi.comparators;
import java.util.Comparator;
import com.bawarchi.model.*;

public class Comparators
{
	static class SortByCaloriesAsc implements Comparator<Dish>
	{

		@Override
		public int compare(Dish d1, Dish d2) {
			// TODO Auto-generated method stub
			return Integer.valueOf(d1.getCalories()).compareTo(d2.getCalories());
		
		}
		
	}
	static class  SortByCaloriesDesc implements Comparator<Dish>
	{

		@Override
		public int compare(Dish d1, Dish d2) {
			// TODO Auto-generated method stub
			return Integer.valueOf(d2.getCalories()).compareTo(d1.getCalories());
		
		}
		
	}
	static class  SortByPriceAsc implements Comparator<Dish>
	{

		@Override
		public int compare(Dish d1, Dish d2) {
			// TODO Auto-generated method stub
			return Double.valueOf(d1.getPrice()).compareTo(d2.getPrice());
		
		}
		
	}
	static class SortByPriceDesc implements Comparator<Dish>
	{

		@Override
		public int compare(Dish d1, Dish d2) {
			// TODO Auto-generated method stub
			return Double.valueOf(d2.getPrice()).compareTo(d1.getPrice());
		
		}
		
	}
}

