package epam.StructuralDesign;

public class Client {
	public static void main(String[] args) 
    {
        String os = "linux";
        FileDownloadAbs downloader = null;
 
        switch (os) 
        {
            case "windows":
                downloader = new FileDownloadAbsWork( new WindowsFile());
                break;
                 
            case "linux":
                downloader = new FileDownloadAbsWork( new LinuxFile());
                break;
                 
            default:
                System.out.println("OS not supported !!");
        }
         
        Object fileContent = downloader.download("some path");
        downloader.store(fileContent);
    }
}
