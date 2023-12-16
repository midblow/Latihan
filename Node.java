class Node { 
    Semester semester;
    Biodata biodata;
    String user;
    Node left;
    Node right;

    public Node(Semester semester, Biodata biodata, String User) {
        this.semester = semester;
        this.biodata = biodata;
        this.user =User;
        this.left = null;
        this.right = null;
    }
}