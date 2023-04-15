package lib;

public class SpouseInfo {
    private String spouseName;
	private String spouseIdNumber;

    public SpouseInfo(String spouseName, String spouseIdNumber) {
        this.spouseName = spouseName;
        this.spouseIdNumber = spouseIdNumber;
    }
    
    public void setSpouse(String spouseName, String spouseIdNumber) {
		this.spouseName = spouseName;
		this.spouseIdNumber = spouseIdNumber;
	}
}
