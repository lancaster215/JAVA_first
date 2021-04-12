package JSON_response;

public class Response {
	private String message;
	private String value;
	private boolean success;
	
//	public Object SampleObject(String m, String v, boolean s) {
//		
//	}
//	
	public String setMessage(String m) {
		return this.message = m;
	}
	
	public String setValue(String v) {
		return this.value = v;
	}
	
	public boolean setSuccess(boolean s) {
		return this.success = s;
	}
	
	public static void main(String [] args) {
		Response obj = new Response();
	}
}
