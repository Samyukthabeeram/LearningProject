package com.pattern.learning;

public class Pattern24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=5;
for(int i=1;i<=n;i++)
{ for(int j=1;j<i;j++)
	System.out.print(" ");
{ for( int k=i;k<=n;k++)
{System.out.print(" *");
}
}System.out.println();
} for(int i=n-1;i>=1;i--)
{ for(int j=1;j<i;j++)
	System.out.print(" ");
{ for( int k=i;k<=n;k++)
{System.out.print(" *");
}
	}System.out.println();
}
	}
}

