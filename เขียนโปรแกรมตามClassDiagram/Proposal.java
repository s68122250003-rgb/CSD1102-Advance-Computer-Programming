import java.util.Date;

public class Proposal {
    private String proposal_code;
    private String proposal_title;
    private String proposal_text;
    private Date proposal_date;
    private StatusProposal proposal_status = StatusProposal.WAITING; // กำหนด Default

    public Proposal(){
    }
    public Proposal(String proposal_code,String proposal_title,String proplos_text, Date proposa_date){
        this.proposal_code = proposal_code;
        this.proposal_title = proposal_title;
        this.proposal_text = proplos_text;
        this.proposal_date = proposa_date;

    }


    public void viewProposal() {
        // โค้ดสำหรับแสดงข้อมูลข้อเสนอ
    }

    public void archiveProposal() {
        // โค้ดสำหรับการย้ายสถานะไปเก็บใน Archive
        System.out.println("Proposal " + proposal_code + " has been archived.");
    }

    public void viewApplicant() {
        // โค้ดสำหรับดึงข้อมูลจากคลาส Applicant มาแสดง
    }
}
