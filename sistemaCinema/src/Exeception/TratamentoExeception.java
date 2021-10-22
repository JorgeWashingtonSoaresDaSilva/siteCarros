package Exeception;



public class TratamentoExeception {

	private String msg;

	
	public void Exeception(String msg) {
		this.setMsg(msg);
		System.out.println(msg);
	}


	public String getMsg() {
		return msg;
	}


	public void setMsg(String msg) {
		this.msg = msg;
	}
	

}
