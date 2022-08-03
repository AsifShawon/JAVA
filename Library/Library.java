package Library;


public class Library {
	private int count = 4;
	private String[] avBook = new String[100];

	public Library() {
		avBook[0] = "Java The Complete Reference";
		avBook[1] = "Ami Topu";
		avBook[2] = "Calculus 2";
		avBook[3] = "Sherlock Holmes";
	}

	public void setAvBook(String s) {
		avBook[count] = s;
		count++;
	}
	public String getAvBook(int i) {
		return avBook[i];
	}
	public int getCount() {
		return count;
	}

	public String getBook(int i) {
		String s = avBook[i - 1];
		String t[] = new String[100];
		int k = count = 0;
		for (int j = 0; avBook[j] != null; j++) {
			if ((i - 1) == j)
				continue;
			t[k] = avBook[j];
			k++;
			count++;
		}
		this.avBook = t;
		return s;
	}
}

