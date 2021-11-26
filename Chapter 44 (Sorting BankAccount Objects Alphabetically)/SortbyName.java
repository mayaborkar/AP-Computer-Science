import java.util.*;
class SortbyName implements Comparator<BankAccount> {
    public int compare(BankAccount obj1, BankAccount obj2)
    {
        return obj1.name.compareTo(obj2.name);
    }
}