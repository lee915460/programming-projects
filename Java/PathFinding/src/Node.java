public class Node {
    private boolean visited;
    private Node parent;
    private int row;
    private int col;

    public Node(int r, int c){
        visited = false;
        parent = null;
        row = r;
        col = c;
    }

    public Node(int r, int c, Node p){
        visited = false;
        parent = p;
        row = r;
        col = c;
    }

    //region Gets and Sets
    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public boolean isVisited() {
        return visited;
    }

    public Node getParent() {
        return parent;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
    //endregion
    @Override
    public String toString() {
        return "Node{" +
                "visited=" + visited +
                ", parent=" + parent +
                ", row=" + row +
                ", col=" + col +
                '}';
    }
}
