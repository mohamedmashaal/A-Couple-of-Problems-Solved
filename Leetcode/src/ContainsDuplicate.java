
public class ContainsDuplicate {
	public int containsDuplicate(int n) {
		int count = 0 ;
        while(n!= 0){
            if(n%2 != 0)
            count ++ ;
            n >>= 1 ;
        }
        return count ;
    }
}
