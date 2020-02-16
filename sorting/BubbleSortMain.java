package sorting;

public class BubbleSortMain {
	public static void main(String[] args) {
		int[] a={36,19,29,12,5};
		for(int i=0;i<a.length;i++){
			int tmp;
			for (int j=0;j<a.length ; j++) {
				if(a[j]>a[j+1]){
					a[j] = tmp;
					a[j] = a[j+1];
					a[j+1] = tmp;
				}
			}
		}
		for (int i=0; i<a.length; i++) {
			System.out.primtln(a[i]+"");
		}
	}
} 
