public class question2 {
    int size;
    int length=0;
    int top;
    int numarray[];
    public question2(int capacity) {
        size =capacity;
        top=-1;
        numarray=new int[size];}
    void push (int value ) {
        if (top<numarray.length-1) {
            numarray[++top] = value;
            ++length;
        }
        else {
            System.out.println("the stack is full");
        }}
    boolean isempty()  {
        return length==0;}
    boolean isfull() {
        return length==numarray.length;
    }
    int pop() {
        if (top > -1)  {
            int data =numarray[top--];
            length--;
            return data;
        }
        return -1; }
    int peak() {
        if (top> -1) {
            int data2=numarray[top];
            return data2 ;}
        return -1;}
    public static void main(String[] args) {
        question2 baba =new question2(5) ;
        boolean jojo= baba.isempty();
        System.out.println(jojo);
        baba.push(7);
        baba.push(5);
        baba.push(8);
        baba.push(6);
        baba.push(3);
        boolean check=baba.isempty();
        System.out.println(check);
        boolean checkful= baba.isfull();
        int popi=baba.pop();
        int gaga=baba.peak();
        System.out.println(jojo);
        for (int i=0;i<baba.length;i++) {
            System.out.print(baba.numarray[i] +" ");}
        System.out.println();
        System.out.println(popi);
        System.out.println(gaga);}}

