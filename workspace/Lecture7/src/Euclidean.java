
public class Euclidean {
	public static int solution(int input){
	    int answer = 0;
	    
	    if(input % 500==0) {
	    	answer = answer + input/500;
	    	
	    }else if((input % 500) % 100==0) {
	    	answer = answer + (input % 500)/100;
	    	
	    }else if(((input % 500) % 100) % 50==0) {
	    	answer = answer + ((input % 500) % 100)/50;
	    	
	    }else if((((input % 500) % 100) % 50) % 10==0) {
	    	answer = answer + (((input % 500) % 100) % 50)/10;
	    	
	    }else if(((((input % 500) % 100) % 50) % 10) % 5==0) {
	    	answer = answer + ((((input % 500) % 100) % 50) % 10)/5;
	    	
	    }else if((((((input % 500) % 100) % 50) % 10) % 5) % 1==0) {
	    	answer = answer + (((((input % 500) % 100) % 50) % 10) % 5)/1;
	    }
	   
	    
	    return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(1000));
	}
}
