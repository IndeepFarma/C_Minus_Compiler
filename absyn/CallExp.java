package absyn;

public class CallExp extends Exp {
    public ExpList args; 
    public String function; 

    public CallExp(int row, int col, String function, ExpList args) {
        this.row = row;
        this.col = col;
        this.function = function;
        this.args = args; 
    }
    public void accept( AbsynVisitor visitor, int level ) {
        visitor.visit( this, level );
    }
      
    public int params_count() {
        int count = 0; 
        ExpList temp = this.args; 
        while (temp != null) {
            temp = temp.tail; 
            count++; 
        }
        return count; 
    }
}
