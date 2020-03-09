package epam.StructuralDesign;

public class FileDownloadAbsWork implements FileDownloadAbs {
	private FileDownloadWork provider = null;
	 
    public FileDownloadAbsWork(FileDownloadWork provider) {
        super();
        this.provider = provider;
    }
 
    @Override
    public Object download(String path) 
    {
        return provider.downloadFile(path);
    }
 
    @Override
    public boolean store(Object object) 
    {
        return provider.storeFile(object);
    }

}
