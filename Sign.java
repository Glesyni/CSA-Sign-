public class Sign{
    private String message; 
    private int width; 
    public Sign(String mes, int wide){
        message = mes; 
        width = wide; 
    }
    public int numberOfLines(){
        if (message.length()==0){
            return 0; 
        }
        else if(message.length()%width ==0){
            return message.length()/width; 
        }
        else{
            return message.length()/width + 1; 
        }
    }
    public String getLines(){
        String res = ""; 
        if (message.length() == 0){
            return "null"; 
        }
        for (int i = 0; i< numberOfLines()-1; i++){
            res += message.substring(i*width, i*width+width) + ";"; 
        }
        res += message.substring((numberOfLines()-1)*width, message.length()); 
        return res; 
    }
}