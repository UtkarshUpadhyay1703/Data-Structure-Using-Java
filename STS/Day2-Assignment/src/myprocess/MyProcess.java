package myprocess;

public class MyProcess {
	private int pid;
	private String pname;
	private String owner;
	public MyProcess(int pid,String pname,String owner) {
	this.pid=pid;
	this.owner=owner;
	this.pname=pname;
	}
	@Override
	public String toString() {
		return "MyProcess [pid=" + pid + ", pname=" + pname + ", owner=" + owner + "]";
	}
}
