import java.util.Scanner;

public class BinarySearch {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

	Boolean flag = true;
	int i = 0;
	while(flag){
		flag = false;
		
		for(int j = 0;j<a.length-1-i;j++){
			if(a[j] > a[j+1]){
				int temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
				flag = true;
			}
		}
		i++;
	}
	System.out.println("enter a key :");
	int key = sc.nextInt();

	int l = 0;
	int h = a.length-1;
	flag = true;
	while(l<=h){
		int mid = (l+h)/2;
		if(a[mid] == key){
			flag = false;
			break;
		}
		else if(a[mid] > key)	
			h = mid - 1;
		else
			l = mid + 1;
		}

        if(flag)
		System.out.println("Not Found ");
	else
		System.out.println("Found");
	}
}

	
	