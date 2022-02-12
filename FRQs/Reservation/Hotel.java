import java.util.*;
public class Hotel
{
    // instance variables - replace the example below with your own
    private Reservation[] rooms;
    private ArrayList waitList;

    public Hotel()
    {
        
    }

    public Reservation requestRoom(String guestName)
    {
        Reservation guestReservation = null;
        for(int i = 0; i < rooms.length; i++){
            if(rooms[i] == null){
                guestReservation = new Reservation(guestName, i);
                rooms[i] = guestReservation;
            }
        }
        if (guestReservation == null){
            waitList.add(guestName);
        }
        
        return guestReservation;
    }
    
    public Reservation cancelAndReassign(Reservation res)
    {
        Reservation newReservation = null;
        int index = res.getRoomNumber();
        
        if(!waitList.isEmpty()){
            newReservation = new Reservation((String)waitList.remove(0),index);
        }
        rooms[index] = newReservation;
        return newReservation;
    }
}
