public class RouteCipher
{
    private String[][] letterBlock;
    private int numRows;
    private int numCols;
    
    public static void main(){
        RouteCipher r = new RouteCipher(2, 3);
        System.out.print(r.encryptMessage("Meet at midnight"));
    }
    
    public RouteCipher(int numRows, int numCols)
    {
        this.numRows = numRows;
        this.numCols = numCols;
        this.letterBlock = new String[this.numRows][this.numCols];
    }

    private void fillBlock(String str){
        for(int i = 0; i < this.numCols * this.numRows; i++){
            if (i < str.length()){
                this.letterBlock[i/this.numCols][i % this.numCols] = str.substring(i, i+1);
            }
            
            else{
                this.letterBlock[i/this.numCols][i % this.numCols] = "A";
            }
        }
    }
    
    private String encryptBlock(){
        String encrypted = "";
        
        for (int cols = 0; cols < this.numCols; cols++){
            for(int rows = 0; rows < this.numRows; rows++){
                encrypted += this.letterBlock[rows][cols];
            }
        }
        return encrypted;
    }
    
    public String encryptMessage(String message){
        String yourMessage = "";
        for (int i = 0; i < message.length(); i += this.numCols * this.numRows){
            if(i + this.numCols * this.numRows > message.length()){
                fillBlock(message.substring(i, message.length()));
            }
            else{
                fillBlock(message.substring(i, i + this.numCols * this.numRows));
            }
            yourMessage += encryptBlock();
        }
        return yourMessage;
    }
    
}