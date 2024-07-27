package E_Voting;

import java.io.Serializable;

public class VoterRecord implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String voterName;
    private String voterId;
    private boolean hasVoted;

    public VoterRecord(String voterName, String voterId, boolean hasVoted) {
        this.voterName = voterName;
        this.voterId = voterId;
        this.hasVoted = hasVoted;
    }

    public String getVoterName() {
        return voterName;
    }

    public void setVoterName(String voterName) {
        this.voterName = voterName;
    }

    public String getVoterId() {
        return voterId;
    }

    public void setVoterId(String voterId) {
        this.voterId = voterId;
    }

    public boolean hasVoted() {
        return hasVoted;
    }

    public void setHasVoted(boolean hasVoted) {
        this.hasVoted = hasVoted;
    }
}
