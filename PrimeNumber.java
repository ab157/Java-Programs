class PrimeNumber{
	public static void main(String[] args){
		int  i=0;
		while(i<50){
			for(int j = 2;j<i/2;j++){
				if(i%j==0){
					System.out.println("Not a prime");
				}
				else{
				System.out.println(j);
				}
			
			}
			i+=1;
		}
			
	}
}