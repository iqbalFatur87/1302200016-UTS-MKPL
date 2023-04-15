package lib;

import java.util.List;

public class ChildInfo {
    private List<String> childNames;
	private List<String> childIdNumbers;

    public ChildInfo(List<String> childNames, List<String> childIdNumbers) {
        this.childNames = childNames;
        this.childIdNumbers = childIdNumbers;
    }

    public void addChild(String childName, String childIdNumber) {
		childNames.add(childName);
		childIdNumbers.add(childIdNumber);
	}
}
