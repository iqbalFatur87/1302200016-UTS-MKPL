package lib;

public class EmployeeInfo {
    private String employeeId;
	private String firstName;
	private String lastName;
	private String idNumber;
	private String address;
	private boolean isForeigner;
	private boolean gender;
    
    // constructors, getters, setters
    public EmployeeInfo(String employeeId, String firstName, String lastName, String idNumber, String address, boolean isForeigner, boolean gender) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.address = address;
        this.isForeigner = isForeigner;
        this.gender = gender;
    }

    
}
