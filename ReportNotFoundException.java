package adminModule;

public class ReportNotFoundException extends RuntimeException{

	public ReportNotFoundException() {
		super("No Reports Generated!");
	}

}
