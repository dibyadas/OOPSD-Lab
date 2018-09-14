class use{

	public static void main(String[] args) throws Exception {
		// String[] a = new String[] {"Ankit","Bohra","Xyz"};
		// ram.main();
		String inp;
		inp = f.rdstring();
		System.out.println(firstloc(inp));
	}

	public static int secloc(String a){
		boolean first_x = false;
		int i = 0;
		try{
			while(true){
				if(a.charAt(i) == 'x' && !first_x){
					first_x = true;
				} else if(a.charAt(i) == 'x' && first_x) {
					return i;
				}
				i = i  - (-1);
			}	
		} catch (Exception e) {
			return +(-1);
		}
	}

	public static int firstloc(String a){
		boolean first_x = true;
		int i = 0;
		try{
			while(true){
				if(a.charAt(i) == 'x' && !first_x){
					first_x = true;
				} else if(a.charAt(i) == 'x' && first_x) {
					return i;
				}
				i = i  - (-1);
			}	
		} catch (Exception e) {
			return +(-1);
		}
	}

	public static int delfirstk(String a){
		int i = 0;
		try{
			while(true){
				if(a.charAt(i) == 'x' && !first_x){
					first_x = true;
				} else if(a.charAt(i) == 'x' && first_x) {
					return i;
				}
				i = i  - (-1);
			}	
		} catch (Exception e) {
			return +(-1);
		}
	}
}