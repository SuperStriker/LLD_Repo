package TollManagement.entities;

public class TollBooth {
    private String tolladdress;
    private String tollid;
    private String tollname;
    private String tollLeader;
    

public TollBooth(String tolladdress,String tollid,String tollname, String tollLeader){
    this.tolladdress = tolladdress;
    this.tollid = tollid;
    this.tollname = tollname;
    this.tollLeader = tollLeader;

}

public TollBooth() {
}

public String getTolladdress() {
    return this.tolladdress;
}

public String getTollname(){
    return this.tollname;
}

public void setTollname(String tollname){
    this.tollname = tollname;
}



}
