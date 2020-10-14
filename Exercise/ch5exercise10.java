// Exercise 5-10

abstract class PairMap {
	protected String keyArray [];
	protected String valueArray [];
	abstract String get(String key);
	abstract void put(String key, String value);
	abstract String delete(String key);
	abstract int length();
}

class Dictionary extends PairMap {
	private int len;
	
	public Dictionary(int n) {
		this.keyArray = new String[n];
		this.valueArray = new String[n];
		this.len = 0;
	}
	
	@Override
	public String get(String key) {
		for(int i = 0; i < this.keyArray.length; i++) {
			try {
				if(this.keyArray[i].equals(key)) {
					return this.valueArray[i];
				}
			} catch(NullPointerException e) {
				continue;
			}			
		}
		
		return null;
	}
	
	@Override
	public void put(String key, String value) {
		for(int i = 0; i < this.keyArray.length; i++) {
			try {
				if(this.keyArray[i].equals(key)) {
					this.valueArray[i] = value;
					return;
				}
			} catch(NullPointerException e) {
				continue;
			}
		}
		
		if(this.len == this.keyArray.length) {
			return;
		}
		
		this.keyArray[this.len] = key;
		this.valueArray[this.len] = value;
		this.len++;
	}
	
	@Override
	public String delete(String key) {
		String val;
		
		for(int i = 0; i < this.len; i++) {
			try {
				if(this.keyArray[i].equals(key)) {
					val = this.valueArray[i];
					
					this.keyArray[i] = null;
					this.valueArray[i] = null;
					this.len--;
					
					return val;
				}
			} catch(NullPointerException e) {
				continue;
			}
		}
		
		return null;
	}
	
	@Override
	public int length() {
		return this.len;
	}
}

public class ch5exercise10 {

	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("황기태", "자바");
		dic.put("이재문", "파이선");
		dic.put("이재문", "C++");
		
		System.out.println("이재문의 값은 " + dic.get("이재문"));
		System.out.println("황기태의 값은 " + dic.get("황기태"));
		
		dic.delete("황기태");
		System.out.println("황기태의 값은 " + dic.get("황기태"));
	}

}
