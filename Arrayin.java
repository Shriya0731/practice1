import java.util.*;
public class Arrayin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a [] = new int [10];
		System.out.println(""+a.length);
		System.out.println("Enter number of elements to add :");
		int n= sc.nextInt();
		int i=0,pos=0,yes=0,ele;
		System.out.println(" add :");
		for (i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("  MENU\n1.Insert an element\n2.Delete an element");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter element to be inserted :");
			ele=sc.nextInt();
			System.out.println("Enter index no. :");
			int in=sc.nextInt();
			if (n!=a.length) {
				i=n;
				for (i=n;i>in;i--) {
					a[i]=a[i-1];
				}
				a[in]=ele;
				//display
				i=0;
				for (i=0;i<n+1;i++) {
					System.out.print(" "+a[i]);
				}
			}
			else {
				System.out.println("Array is full!");
			}
			break;
		case 2:
			System.out.println("Enter element to be deleted :");
			ele=sc.nextInt();
			for (i=0;i<n;i++) {
				if(a[i]==ele) {
				a[i]=0;
				pos=i;
				yes=1;
				break;
				}
			}
			if (yes==1) {
				for (i=pos;i<n;i++) {
					a[i]=a[i+1];
				}
				i=0;
				for (i=0;i<n;i++) {
					System.out.print(" "+a[i]);
				}
			}
			else {
				System.out.println("Element is not present in given list.");
			}
			break;
			
		}
	    
	}

}
