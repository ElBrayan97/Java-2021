package tp5;

public class Naipe {
	private Integer num;
	private Palo palo;

	public Naipe(Integer num, Palo palo){
		this.num = num;
		this.palo = palo;
	}
	
	public Integer getNum() {
		return num;
	}
	
	public void setNum(Integer num){
		this.num = num;
	}
	
	public Palo getPalo() {
		return palo;
	}
	public void setPalo(Palo palo) {
		this.palo = palo;
	}
	
	public Boolean equals(Naipe naipe) {
		if (this.num == naipe.getNum() && this.palo.equals(naipe.getPalo())){
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}
	
	@Override
	public String toString() {
		return "[ "+num+" - "+palo+" ]";
	}
}
