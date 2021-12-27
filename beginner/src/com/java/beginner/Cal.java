package com.java.beginner;

public class Cal {
	
		private int monthNum;
		public int fetch()
		{ return this.monthNum;
		}
		public void change(int monthNum)
		{
			if(monthNum>=1 && monthNum<=12)
			{ this.monthNum=monthNum;
		}
			else
			{ throw new InvalidMonthNumberException();
			}
			}
}
