import java.util.*;

public class DownloadInfo
{
    String title;
    int downloadCount;
    
    public DownloadInfo(String title)
    {
        this.title = title;
        this.downloadCount = 0;
    }

    public String getTitle()
    {
        
        return this.title;
    }
    
    public void incrementTimesDownloaded(){
        this.downloadCount += 1;
    }
}
