package week2.day2;

public class Assignment10 {
	String s = "loveleetcode";

	public int findUniqueChar() {
		int indexValueForUniqueElement = -2;
		char ch[] = this.s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i; j < ch.length; j++) {
				if ((ch[i] == ch[j]) && (j == ch.length - 1)) {
					System.out.println("cannot find unique char:" + "-1");
					break;
				} else if ((ch[i] == ch[j]) && (j != ch.length - 1) && (i != j)) {
					System.out.println("working on finding a unique character");
					break;
				} else if ((ch[i] == ch[j]) && (j != ch.length - 1) && (i == j)) {
					System.out.println("working on finding a unique character");
					continue;
				} else if ((ch[i] != ch[j]) && (j != ch.length - 1)) {
					System.out.println("working on finding a unique character, eventhough this is not matching");
				} else if ((ch[i] != ch[j]) && (j == ch.length - 1) && (i != j)) {
					System.out.println("Aiyoo found it jee, unique char index is:" + i);
					indexValueForUniqueElement = i;
					break;
				}

			}
			if (indexValueForUniqueElement != -2) {
				break;
			}
		}
		return indexValueForUniqueElement;
	}

	public static void main(String[] args) {
		Assignment10 assign = new Assignment10();
		System.out.println(assign.findUniqueChar());
	}

}
