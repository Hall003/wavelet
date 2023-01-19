public class SearchEngine {
    
}
class Handler implements URLHandler{
    String [] searchList = new String[1000000];
    public String handleRequest(URI url) {
        if (url.getPath().contains("/add")) {
                String[] parameters = url.getQuery().split("=");
                searchList[searchList.length-1] = parameters[1];
            }
            return "404 Not Found!";
    }
}
