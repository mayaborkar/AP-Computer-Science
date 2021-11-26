import java.util.*;
public class MusicDownloads
{
    private ArrayList<DownloadInfo> downloadList;
    
    public MusicDownloads()
    {
      downloadList = new ArrayList<DownloadInfo>();  
    }

    public DownloadInfo getDownloadInfo(String title)
    {
        for(int i = 0; i < downloadList.size(); i ++){
            if (downloadList.get(i).equals(title)){
                return downloadList.get(i);
            }
        }
        return null;
    }
    
    public void updateDownloads(ArrayList<String> titles){
        boolean foundTitle;
        
        for (int i = 0; i < titles.size(); i++){
            foundTitle = false;
            for(int j = 0; j < downloadList.size(); j ++){
                if (downloadList.get(j).equals(titles.get(i))){
                    downloadList.get(j).incrementTimesDownloaded();
                    foundTitle = true;
                }
            }
            
            if(!foundTitle){
                DownloadInfo newDownloadInfo = new DownloadInfo(titles.get(i));
                downloadList.add(newDownloadInfo);
            }
        }
    }
}
