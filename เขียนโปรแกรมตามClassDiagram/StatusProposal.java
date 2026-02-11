public enum StatusProposal {
    WAITING("Waiting"),
    REJECTED("Rejected"),
    ACCEPTED("Accepted");

    private final String statusLabel;

    StatusProposal(String statusLabel) {
        this.statusLabel = statusLabel;
    }

    public boolean changeStatus(StatusProposal newStatus) {

        if (this == REJECTED && newStatus == ACCEPTED) {
            System.out.println("Error: Cannot accept a rejected proposal.");
            return false;
        }
        return true;
    }

    public String getStatusLabel() {
        return statusLabel;
    }
}
