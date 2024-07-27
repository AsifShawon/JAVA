package E_Voting;

import java.io.Serializable;
import java.util.List;

public class VotingSession implements Serializable {
    private static final long serialVersionUID = 1L;

    private String electionName;
    private List<Participant> participants;

    public VotingSession(String electionName, List<Participant> participants) {
        this.electionName = electionName;
        this.participants = participants;
    }

    public String getElectionName() {
        return electionName;
    }

    public void setElectionName(String electionName) {
        this.electionName = electionName;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }
}
