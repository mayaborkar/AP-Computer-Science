import java.util.*;
public class AnalogDigitalDriver
{
    
    public AnalogDigitalDriver()
    {
        BWTCV bwtcv1 = new BWTCV();
        BWTCV bwtcv2 = new BWTCV();
        BWTCV bwtcv3 = new BWTCV();
        
        HDTV hdtv1 = new HDTV();
        HDTV hdtv2 = new HDTV();
        
        ArrayList<TV> myTvs = new ArrayList<TV>();
        
        myTvs.add(bwtcv1);
        myTvs.add(bwtcv2);
        myTvs.add(bwtcv3);
        myTvs.add(hdtv1);
        myTvs.add(hdtv2);
        
        for(TV tvs : myTvs){
            System.out.println(tvs.tvType() + "...Am I on? " + tvs.getTVOn());
        }
        
        for(int i = 0; i < myTvs.size(); i++){
            myTvs.get(i).setTVOn(true);
            
        }
        
        System.out.println("\n\n");
        for (TV TVs: myTvs){
            System.out.println(TVs.tvType() + "...Am I on? " + TVs.getTVOn());
        }
        
        System.out.println(bwtcv1.rotateRabbitEars());
        System.out.println(hdtv1.connectHDMI());
    }

}
