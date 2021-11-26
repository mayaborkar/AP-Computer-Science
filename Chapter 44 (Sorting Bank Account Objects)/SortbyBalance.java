import java.util.*;
class SortbyBalance implements Comparator<BankAccount> {
    // Used for sorting in ascending order of
    // roll number
    public int compare(BankAccount obj1, BankAccount obj2)
    {
        if(obj1.balance == obj2.balance){
            return 0;
        }
        else if(obj1.balance > obj2.balance){
            return 1;
        }
        else{
            return -1;
        }
    }
}