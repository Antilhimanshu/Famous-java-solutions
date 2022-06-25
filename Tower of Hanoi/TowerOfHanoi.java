package assingment;

public class TowerOfHanoi {
	
	public static void main(String[] args) {
		towerOfHanoi(3, 'a','b','c');
	}
	
	public static void towerOfHanoi(int disks, char source,char auxiliary, char destination) {
		
		if(disks == 0) {
			return;
		}
		
		towerOfHanoi(disks-1,source,auxiliary,destination);
		System.out.println(source + ""+ destination);
		towerOfHanoi(disks-1,auxiliary,source,destination);
		
		
	}

}
