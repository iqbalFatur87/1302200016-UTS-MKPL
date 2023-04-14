package lib;

public class EmployeeInfo {
    enum Gender {
        MALE,FEMALE
    }
    enum Nationality {
        LOCAL,FOREIGNER
    }

    private String employeeId;
	private String firstName;
	private String lastName;
	private String idNumber;
	private String address;
    private Gender gender;
    private static Nationality nationality;

    public EmployeeInfo(String employeeId, String firstName, String lastName, String idNumber, String address,
        Gender gender, Nationality nationality) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.address = address;
        this.gender = gender;
        this.nationality = nationality;
    }
    
    public static Nationality getNationality() {
        return nationality;
    }
}
