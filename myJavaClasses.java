public class myJavaClasses {
	public static void main(String[] args) {
		for(var i = 1; i < 24; i++) {
			if(i == 1) {
				System.out.print(i);
				System.out.print('\n');
			}else if(i > 3 && i < 8) {
				if(i % 2 == 0) {
					System.out.print(i);
					System.out.print(' ');
				}
			}else if(i == 8) {
				System.out.print('\n');
			}else if(i > 8 && i < 14) {
				if(i % 2 == 1) {
					System.out.print(i);
					System.out.print(' ');
				}
			}else if(i == 14) {
				System.out.print('\n');
			}else if(i > 16 && i < 24) {
				if(i % 2 == 1) {
					System.out.print(i);
					System.out.print(' ');
				}
			}
		}
	}
}
