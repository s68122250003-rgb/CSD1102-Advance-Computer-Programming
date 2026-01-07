class MedicalCertificate{
    private String certld;
    private int restDys;
    private String comment;

    public MedicalCertificate(){

    }
    public MedicalCertificate(String certld, int restDys, String comment ){
        this.certld = certld;
        this.restDys = restDys;
        this.comment  = comment;
    }

    public void setcertld(String certld){
        this.certld = certld;
    }

    public void setrestDys(int restDys){
        this.restDys = restDys;
    }

    public void setcomment(String comment){
        this.comment = comment;
    } 

    public String getcerld(){
        return this.certld;
    }

    public int restDys(){
        return this.restDys;
    }

    public String comment(){
        return this.comment;
    }

    public void generateCertificate(){
        System.out.println("สร้างใบรับรอง");
    }


}