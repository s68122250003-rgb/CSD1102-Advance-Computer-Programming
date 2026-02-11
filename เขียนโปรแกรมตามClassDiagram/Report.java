import java.util.Date;

public class Report {
    private int reportCode;
    private Date reportDate;
    
    // ความสัมพันธ์ Composition: Report ต้องมี Proposal อยู่ข้างใน
    private Proposal proposal; 

    // Constructor รับ Proposal เข้ามาทันทีตอนสร้าง Report
    public Report(int code, Proposal prop) {
        this.reportCode = code;
        this.reportDate = new Date(); // วันที่ปัจจุบัน
        this.proposal = prop;
    }

    public void viewReport() {
        System.out.println("Report ID: " + reportCode);
        System.out.println("Date: " + reportDate);
        System.out.println("--- Content from Proposal ---");
        proposal.viewProposal(); 
    }

    public void printReport() {
        System.out.println("Printing Report #" + reportCode + "...");
        // Logic การส่งคำสั่งไป Printer หรือ Export PDF
    }
}
