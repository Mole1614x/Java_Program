package Practice;

class hello{
	int u_id;
	String u_name;
	public hello(int u_id, String u_name) {
//		super();
		this.u_id = u_id;
		this.u_name = u_name;
	}
	void display() {
		System.out.println(u_id+ " " + u_name);
	}
}



public class oops_temp {
	public static void main(String[] args) {
		hello h = new hello(102,"namor");
		h.display();

	}
}
