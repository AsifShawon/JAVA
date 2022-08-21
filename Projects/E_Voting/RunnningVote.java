package E_Voting;

public class RunnningVote {
	private static String vname;
	
	public RunnningVote(String s) {
		vname = s;
	}
	
	public static void setVname(String s) {
		vname = s;
	}
	
	public static String getVname() {
		return vname;
	}
}
