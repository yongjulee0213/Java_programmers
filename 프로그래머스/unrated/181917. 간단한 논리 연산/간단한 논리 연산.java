class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean res_x12;
		if((x1 && x2)||(x1 && !x2)||(!x1 && x2)){
			res_x12=true;
		}
		else{
			res_x12=false;
		}
		
		boolean res_x34;
		if((x3 && x4)||(x3 && !x4)||(!x3 && x4)){
			res_x34=true;
		}
		else{
			res_x34=false;
		}
		
		if(res_x12 && res_x34){
			return true;
		}
		else{
			return false;
		}
    }
}