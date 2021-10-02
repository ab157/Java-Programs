class PrimeNumber{
	
	public static void main(String[] args){
		int  i=0,j;
		while(i<50){
			for(int j = 2;j<i/2;j++){
				if(i%j==0){
					System.out.println("Not a prime");
				}
				else{
				System.out.println("Prime number");
				}
			}
			i+=1;
		}
	}
}



/*****************************************
Last Question:
public class Main{
    public static void main(String [] aa){
        int sum=0;
        int n = 50;
        for(int i =2; i<= n; i++){
            int j;
            for(j = 2; j<= (i/2); j++){
                if(i%j==0){
                    j = i;
                    break;
                }
            }
            if(j == i){
                sum+= i;
            }
        }
        System.out.println(sum+1);
    }
}