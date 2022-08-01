package Project.Library;

public class Library {
	public int count = 4;
	public String[] avBook = new String[100];

	public Library() {
		avBook[0] = "akash";
		avBook[1] = "Aj Amar Mon Valo Nei";
		avBook[2] = "Maa";
		avBook[3] = "Three AM";
	}

//	void AvailableBooks() {
//		for (int i = 0; avBook[i] != null; i++) {
//			System.out.println((i + 1) + " " + avBook[i]);
//		}
//	}

	public void setAvBook(String s) {
		avBook[count] = s;
		count++;
	}
	public String getAvBook(int i) {
		return avBook[i];
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
		// System.out.print(count);
		return s;
	}
}

